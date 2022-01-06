package br.com.stud.casaDoCodigo.dataprovider.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime momentRegister;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String description;

    @Deprecated
    public Author(){}

    public Author(LocalDateTime momentRegister, String email, String nome, String description) {
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
