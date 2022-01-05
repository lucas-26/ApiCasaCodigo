package br.com.stud.casaDoCodigo.domain.model;

import java.time.LocalDateTime;

public class AuthorModel {

    private LocalDateTime momentRegister;
    private String email;
    private String nome;
    private String description;

    public AuthorModel(LocalDateTime momentRegister, String email, String nome, String description) {
        this.momentRegister = momentRegister;
        this.email = email;
        this.nome = nome;
        this.description = description;
    }

    public LocalDateTime getMomentRegister() {
        return momentRegister;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getDescription() {
        return description;
    }
    
}
