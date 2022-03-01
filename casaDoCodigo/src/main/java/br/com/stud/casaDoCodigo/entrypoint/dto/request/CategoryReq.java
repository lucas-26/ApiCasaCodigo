package br.com.stud.casaDoCodigo.entrypoint.dto.request;


import br.com.stud.casaDoCodigo.entrypoint.annotation.ValidIfCategoryExists;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class CategoryReq {

    @NotBlank(message = "Nome é obrigatorio.")
    @JsonProperty(value = "nome_categoria", required = true, defaultValue = "no name")
    @ValidIfCategoryExists
    public String nome;

    @Deprecated
    public CategoryReq() {
    }

    public CategoryReq(
            String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
