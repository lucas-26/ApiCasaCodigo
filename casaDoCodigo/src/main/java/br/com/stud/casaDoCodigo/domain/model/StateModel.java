package br.com.stud.casaDoCodigo.domain.model;

public class StateModel {

    private Long id;

    private String nome;

    private Long pais;

    public StateModel(String nome, Long pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Long getPais() {
        return pais;
    }
}
