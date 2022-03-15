package br.com.stud.casaDoCodigo.entrypoint.dto.response;

public class CountryResp {

    private Long id;
    private String nome;

    public CountryResp(String nome) {
        this.nome = nome;
    }

    public CountryResp(Long id, String nome) {
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
