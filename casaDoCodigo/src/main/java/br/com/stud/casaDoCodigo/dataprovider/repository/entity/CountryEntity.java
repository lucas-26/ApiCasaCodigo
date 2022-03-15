package br.com.stud.casaDoCodigo.dataprovider.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "Pais")
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", unique = true)
    private String nome;

    @Deprecated
    public CountryEntity(){}

    public CountryEntity(String nome) {
        this.nome = nome;
    }

    public CountryEntity(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
