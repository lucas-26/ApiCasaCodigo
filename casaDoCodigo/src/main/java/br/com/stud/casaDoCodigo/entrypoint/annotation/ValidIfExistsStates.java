package br.com.stud.casaDoCodigo.entrypoint.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ValidIfExistsStatesImpl.class)
public @interface ValidIfExistsStates {
    String message() default "The param needed is valid and, param is unique in system.";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    Class<?> domainCLass();
    String target();
}
