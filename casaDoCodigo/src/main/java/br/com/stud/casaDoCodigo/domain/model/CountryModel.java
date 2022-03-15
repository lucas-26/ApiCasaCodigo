package br.com.stud.casaDoCodigo.domain.model;

public class CountryModel {

    private Long Id;
    private String nome;

    public CountryModel(String nome) {
        this.nome = nome;
    }

    public CountryModel(Long id, String nome) {
        Id = id;
        this.nome = nome;
    }

    public Long getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }
}
