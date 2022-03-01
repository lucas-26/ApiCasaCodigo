package br.com.stud.casaDoCodigo.entrypoint.exception.exceptionsObject;

public class EmailAlreadyExistsException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public EmailAlreadyExistsException(String message){
        super(message);
    }
}
