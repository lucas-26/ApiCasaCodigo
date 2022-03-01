package br.com.stud.casaDoCodigo.entrypoint.exception.exceptionsObject;

import java.util.Date;

public class ErrorMessage {

    private int statusCode;
    private Date timesTamp;
    private String message;
    private String description;

    public ErrorMessage(int statusCode, Date timesTamp, String message, String description) {
        this.statusCode = statusCode;
        this.timesTamp = timesTamp;
        this.message = message;
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Date getTimesTamp() {
        return timesTamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
