package br.com.stud.casaDoCodigo.entrypoint.annotation;

import br.com.stud.casaDoCodigo.entrypoint.exception.exceptionsObject.DocumentIllegalFormatException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class ValidDocumentImpl implements ConstraintValidator<ValidDocument, String> {


    private final Pattern patternCpf = Pattern.compile("(^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$)");
    private final Pattern patternRG = Pattern.compile("(^\\d{1,2}).?(\\d{3}).?(\\d{3})-?(\\d{1}|X|x$)");

    @Override
    public void initialize(ValidDocument constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        if (!(patternCpf.matcher(s).matches()) || patternRG.matcher(s).matches()){
            throw new DocumentIllegalFormatException("Document what you pass have error, please look if have format correct. Remember document is RG or CPF.");
        }

        return true;
    }

}
