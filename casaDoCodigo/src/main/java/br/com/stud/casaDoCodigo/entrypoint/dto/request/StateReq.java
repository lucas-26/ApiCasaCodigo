package br.com.stud.casaDoCodigo.entrypoint.dto.request;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CountryEntity;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.StateEntity;
import br.com.stud.casaDoCodigo.entrypoint.annotation.ValidatorGeneric;
import br.com.stud.casaDoCodigo.entrypoint.annotation.ValidatorIfNotExistsGeneric;

import javax.validation.constraints.NotBlank;

public class StateReq {

    @NotBlank
    @ValidatorGeneric(domainCLass = StateEntity.class, target = "nome")
    private String nome;
    @ValidatorIfNotExistsGeneric(domainCLass = CountryEntity.class, target = "id")
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
