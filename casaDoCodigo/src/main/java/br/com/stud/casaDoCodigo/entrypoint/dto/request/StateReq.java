package br.com.stud.casaDoCodigo.entrypoint.dto.request;

public class StateReq {

    private String nome;

    private Long pais;

    public StateReq(String nome, Long pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public Long getPais() {
        return pais;
    }
}
