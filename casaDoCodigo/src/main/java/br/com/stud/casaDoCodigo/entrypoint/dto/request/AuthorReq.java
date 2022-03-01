package br.com.stud.casaDoCodigo.entrypoint.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.AuthorEntity;
import br.com.stud.casaDoCodigo.entrypoint.annotation.ValidatorGeneric;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthorReq {
    
    @JsonProperty("Email")
    @NotBlank(message = "obrigatório passar um dados.")
    @Email(message = "use um email valido.")
    private String email;
    @JsonProperty("Nome")
    @NotBlank(message = "obrigatório passar um dados.")
    @Size(min = 1, max = 150)
    @ValidatorGeneric(target = "nome", domainCLass = AuthorEntity.class)
    private String nome;
    @JsonProperty("Descricao")
    @NotBlank(message = "obrigatório passar um dados.")
    @Size(min = 1, max = 400)
    private String description;

    @Deprecated
    public AuthorReq(){}

    public AuthorReq(String email, String nome, String description) {
        this.email = email;
        this.nome = nome;
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getDescription() {
        return description;
    }
}
