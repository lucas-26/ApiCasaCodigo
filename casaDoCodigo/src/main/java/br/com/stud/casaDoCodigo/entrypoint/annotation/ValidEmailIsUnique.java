package br.com.stud.casaDoCodigo.entrypoint.annotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ValidEmailIsUniqueImpl.class)
public @interface ValidEmailIsUnique {
    String message() default "The email needed is valid and, email is unique in system.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
