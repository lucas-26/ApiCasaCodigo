package br.com.stud.casaDoCodigo.entrypoint.dto.request;

import br.com.stud.casaDoCodigo.entrypoint.annotation.ValidDocument;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ClientReq {

    @Email
    private String email;
    @NotBlank
    private String nome;
    @NotBlank
    private String lastName;
    @ValidDocument
    private String document;
    @NotBlank
    private String address;
    private String complement;
    @NotBlank
    private String city;
    @NotNull
    private Long idCountry;
    private Long idState;
    @NotBlank
    private String numberPhone;
    @NotBlank
    private String cep;

    @Deprecated
    public ClientReq() {
    }

    public ClientReq(String email, String nome, String lastName, String document, String address, String complement, String city, Long idCountry, Long idState, String numberPhone, String cep) {
        this.email = email;
        this.nome = nome;
        this.lastName = lastName;
        this.document = document;
        this.address = address;
        this.complement = complement;
        this.city = city;
        this.idCountry = idCountry;
        this.idState = idState;
        this.numberPhone = numberPhone;
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocument() {
        return document;
    }

    public String getAddress() {
        return address;
    }

    public String getComplement() {
        return complement;
    }

    public String getCity() {
        return city;
    }

    public Long getIdCountry() {
        return idCountry;
    }

    public Long getIdState() {
        return idState;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getCep() {
        return cep;
    }
}
