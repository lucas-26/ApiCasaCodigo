package br.com.stud.casaDoCodigo.domain.model;

public class CategoryModel {

    private Long id;
    private String nome;

    public CategoryModel(String nome) {
        this.nome = nome;
    }

    public CategoryModel(Long id, String nome) {
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
