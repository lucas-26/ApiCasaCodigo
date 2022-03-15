package br.com.stud.casaDoCodigo.entrypoint.annotation;

import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class ValidatorIfNotExistsGenericImpl implements ConstraintValidator<ValidatorIfNotExistsGeneric, Long> {

    @PersistenceContext
    private EntityManager manager;
    private Class<?> paramClass;
    private String paramTarget;

    public ValidatorIfNotExistsGenericImpl(EntityManager manager) {
        this.manager = manager;
    }


    @Override
    public void initialize(ValidatorIfNotExistsGeneric constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        paramClass = constraintAnnotation.domainCLass();
        paramTarget = constraintAnnotation.target();
    }

    @Override
    public boolean isValid(Long aLong, ConstraintValidatorContext constraintValidatorContext) {
        Query query = manager.createQuery("SELECT 1 FROM " + paramClass.getName() + " WHERE " + paramTarget + " = :value ");
        query.setParameter("value", aLong);

        List<?> result = query.getResultList();
        Assert.isTrue((result.size() == 1), "This dates not exists, try how another dates.");

        return true;
    }
}