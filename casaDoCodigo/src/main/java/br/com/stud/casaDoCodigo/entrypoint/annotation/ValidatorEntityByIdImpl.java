package br.com.stud.casaDoCodigo.entrypoint.annotation;

import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class ValidatorEntityByIdImpl implements ConstraintValidator<ValidatorEntityById, Integer> {

    @PersistenceContext
    private  EntityManager manager;
    private Class<?> paramClass;
    private String paramTarget;


    @Override
    public void initialize(ValidatorEntityById constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        paramClass = constraintAnnotation.domainCLass();
        paramTarget = constraintAnnotation.target();
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        Query query = manager.createQuery("SELECT 1 FROM "+ paramClass.getName() + " WHERE "+ paramTarget +" = :value");
        query.setParameter("value", Long.valueOf(integer));

        List<?> result = query.getResultList();
        Assert.isTrue((result.size() == 1), "This id not exists, try how another id.");
        return true;
    }
}
