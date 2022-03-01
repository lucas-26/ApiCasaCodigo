package br.com.stud.casaDoCodigo.entrypoint.dto.request;

public class CountryReq {

    public String nome;

    public CountryReq(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
