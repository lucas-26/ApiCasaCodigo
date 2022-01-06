package br.com.stud.casaDoCodigo.entrypoint.dto.response;

public class AuthorResp {
    
    private String message;

    public AuthorResp(String message){
        this.message = message;
    }

    public AuthorResp(){}

    public String getmessage() {
        return message;
    }

    public void messageForCreateNewAuthor(String message) {
        this.message = message;
    }
}