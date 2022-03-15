package br.com.stud.casaDoCodigo.domain.model;

public class ClientModel {


    private String email;

    private String nome;

    private String lastName;

    private String document;

    private String address;
    private String complement;

    private String city;

    private String Country;
    private String State;

    private String numberPhone;

    private String cep;

    public ClientModel(String email, String nome, String lastName, String document, String address, String complement, String city, String country, String state, String numberPhone, String cep) {
        this.email = email;
        this.nome = nome;
        this.lastName = lastName;
        this.document = document;
        this.address = address;
        this.complement = complement;
        this.city = city;
        Country = country;
        State = state;
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

    public String getCountry() {
        return Country;
    }

    public String getState() {
        return State;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getCep() {
        return cep;
    }
}
