package br.com.stud.casaDoCodigo.entrypoint.dto.response;

public class FindAuthorResp {

    private String nome;
    private String email;
    private String description;

    public FindAuthorResp(String nome, String email, String description) {
        this.nome = nome;
        this.email = email;
        this.description = description;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }
}