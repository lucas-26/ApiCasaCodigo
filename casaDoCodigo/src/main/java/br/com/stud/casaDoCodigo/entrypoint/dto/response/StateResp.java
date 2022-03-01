package br.com.stud.casaDoCodigo.entrypoint.dto.response;

public class StateResp {

    private String nome;

    private Long pais;

    public StateResp(String nome, Long pais) {
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
