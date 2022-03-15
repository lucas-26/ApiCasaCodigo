package br.com.stud.casaDoCodigo.dataprovider.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "Client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String document;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String complement;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String country;
    private String state;
    @Column(nullable = false)
    private String numberPhone;
    @Column(nullable = false)
    private String cep;

    @Deprecated
    public ClientEntity() {
    }

    public ClientEntity(String email, String nome, String lastName, String document, String address, String complement, String city, String country, String state, String numberPhone, String cep) {
        this.email = email;
        this.nome = nome;
        this.lastName = lastName;
        this.document = document;
        this.address = address;
        this.complement = complement;
        this.city = city;
        this.country = country;
        this.state = state;
        this.numberPhone = numberPhone;
        this.cep = cep;
    }

    public Long getId() {
        return id;
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
        return country;
    }

    public String getState() {
        return state;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getCep() {
        return cep;
    }
}
