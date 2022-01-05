package br.com.stud.casaDoCodigo.entrypoint.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AuthorReq {
    
    @NotBlank(message = "obrigatório passar um dados.")
    @Email(message = "use um email valido.")
    private String email;
    @NotBlank(message = "obrigatório passar um dados.")
    @Size(min = 1, max = 150)
    private String nome;
    @NotBlank(message = "obrigatório passar um dados.")
    @Size(min = 1, max = 150)
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
