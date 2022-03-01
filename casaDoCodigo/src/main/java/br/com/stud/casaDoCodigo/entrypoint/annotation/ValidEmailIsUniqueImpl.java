package br.com.stud.casaDoCodigo.entrypoint.annotation;


import br.com.stud.casaDoCodigo.entrypoint.exception.exceptionsObject.EmailAlreadyExistsException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class ValidEmailIsUniqueImpl implements ConstraintValidator<ValidEmailIsUnique, String> {

    @PersistenceContext
    private final EntityManager manager;

    public ValidEmailIsUniqueImpl(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void initialize(ValidEmailIsUnique constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        Query query = manager.createQuery("SELECT * FROM Author a WHERE a.email = :value");
        query.setParameter("value", s);

        List<?> list = query.getResultList();
        if (list.size() == 1){
            throw new EmailAlreadyExistsException("Email invalid, try how another.");
        }

        return true;
    }
}