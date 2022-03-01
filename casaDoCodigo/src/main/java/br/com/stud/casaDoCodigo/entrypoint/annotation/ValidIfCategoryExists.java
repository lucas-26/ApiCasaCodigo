package br.com.stud.casaDoCodigo.entrypoint.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ValidIfCategoryExistsImpl.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ValidIfCategoryExists {
    String message() default "needed use another name.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
