package br.com.stud.casaDoCodigo.dataprovider.repository.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Author")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(nullable = false)
    private LocalDateTime momentRegister;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String description;

    @Deprecated
    public AuthorEntity() {
    }

    public AuthorEntity(Long id, LocalDateTime momentRegister, String email, String nome, String description) {
        this.id = id;
        this.momentRegister = momentRegister;
        this.email = email;
        this.nome = nome;
        this.description = description;
    }

    public AuthorEntity(LocalDateTime momentRegister, String email, String nome, String description) {
        this.momentRegister = momentRegister;
        this.email = email;
        this.nome = nome;
        this.description = description;
    }

    public Long getId() {
        return id;
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
