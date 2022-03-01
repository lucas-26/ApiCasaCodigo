package br.com.stud.casaDoCodigo.dataprovider.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "Estado")
public class StateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nome;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinTable(
            name = "State_Country",
            joinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "state_id", referencedColumnName = "id")}
    )
    private CountryEntity pais;

    @Deprecated
    public StateEntity(){}

    public StateEntity(String nome, CountryEntity pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public CountryEntity getPais() {
        return pais;
    }
}
