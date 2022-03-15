package br.com.stud.casaDoCodigo.entrypoint.dto.request;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CountryEntity;
import br.com.stud.casaDoCodigo.entrypoint.annotation.ValidatorGeneric;

import javax.validation.constraints.NotBlank;

public class CountryReq {

    @NotBlank
    @ValidatorGeneric(domainCLass = CountryEntity.class, target = "nome")
    public String nome;

    @Deprecated
    public CountryReq() {
    }

    public CountryReq(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
