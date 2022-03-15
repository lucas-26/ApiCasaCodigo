package br.com.stud.casaDoCodigo.entrypoint.exception;

import br.com.stud.casaDoCodigo.entrypoint.exception.exceptionsObject.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class ControllerHandlerException {

    @ExceptionHandler(value = {AuthorNotFoundException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorMessage authorNotFoundException(AuthorNotFoundException ex, WebRequest req) {
        int status = HttpStatus.NOT_FOUND.value();
        Date date = new Date();
        String description = "Author not found, please verify if id is correct.";

        return new ErrorMessage(
                status,
                date,
                ex.getMessage(),
                description);
    }

    @ExceptionHandler(value = {CategoryAlreadyExistsException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessage categoryAlreadyExistsException(CategoryAlreadyExistsException ex) {

        int status = HttpStatus.BAD_REQUEST.value();
        Date date = new Date();

        return new ErrorMessage(
                status,
                date,
                ex.getMessage(),
                "Please verify if what you pass in request its ok.");
    }

    @ExceptionHandler(value = {EmailAlreadyExistsException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessage emailAlreadyExistsException(EmailAlreadyExistsException ex) {

        int status = HttpStatus.BAD_REQUEST.value();
        Date date = new Date();

        return new ErrorMessage(
                status,
                date,
                ex.getMessage(),
                "Please verify if what you pass in request its ok.");
    }

    @ExceptionHandler(value = {IllegalArgumentException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessage illegalArgumentException(IllegalArgumentException ex) {

        int status = HttpStatus.BAD_REQUEST.value();
        Date date = new Date();

        return new ErrorMessage(
                status,
                date,
                ex.getMessage(),
                "Please verify if what you pass in request its ok.");
    }

    @ExceptionHandler(value = DocumentIllegalFormatException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessage documentArgumentException(DocumentIllegalFormatException ex) {

        int status = HttpStatus.BAD_REQUEST.value();
        Date date = new Date();

        return new ErrorMessage(
                status,
                date,
                ex.getMessage(),
                "Please verify if what you pass in request its ok.");
    }

    @ExceptionHandler(value = StateBelongsToTheCountryException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessage stateBelongsToTheCountryException(DocumentIllegalFormatException ex) {

        int status = HttpStatus.BAD_REQUEST.value();
        Date date = new Date();

        return new ErrorMessage(
                status,
                date,
                ex.getMessage(),
                "Please verify if what you pass in request its ok.");
    }

}