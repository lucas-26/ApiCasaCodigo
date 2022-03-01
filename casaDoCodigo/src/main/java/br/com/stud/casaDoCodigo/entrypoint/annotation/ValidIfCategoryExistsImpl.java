package br.com.stud.casaDoCodigo.entrypoint.annotation;


import br.com.stud.casaDoCodigo.entrypoint.exception.exceptionsObject.CategoryAlreadyExistsException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class ValidIfCategoryExistsImpl implements ConstraintValidator<ValidIfCategoryExists, String> {

    @PersistenceContext
    private final EntityManager manager;

    public ValidIfCategoryExistsImpl(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void initialize(ValidIfCategoryExists constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        try {
            if (s == null) {
                return false;
            }

            Query query = manager.createQuery("SELECT 1 FROM CategoryEntity a WHERE a.nameCategory = :value");
            query.setParameter("value", s);

            List<?> list = query.getResultList();
            if (list.size() == 1) {
                throw new CategoryAlreadyExistsException("This Category Already exists, please use another.");
            }

            return true;
        } catch (Exception e) {
            throw e;
        }
    }
}