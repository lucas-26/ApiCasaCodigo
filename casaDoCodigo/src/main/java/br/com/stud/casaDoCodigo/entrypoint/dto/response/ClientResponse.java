package br.com.stud.casaDoCodigo.entrypoint.dto.response;

public class ClientResponse {

    private String message;
    private Long id;

    public ClientResponse(String message, Long id) {
        this.message = message;
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public Long getId() {
        return id;
    }
}
