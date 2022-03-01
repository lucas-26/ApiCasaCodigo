package br.com.stud.casaDoCodigo.dataprovider.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "Category")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id")
    private Long id;
    @Column(name = "name_category", unique = true)
    private String nameCategory;

    @Deprecated
    public CategoryEntity(){}

    public CategoryEntity(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public CategoryEntity( Long id, String nameCategory) {
        this.id = id;
        this.nameCategory = nameCategory;
    }

    public Long getId() {
        return id;
    }

    public String getNameCategory() {
        return nameCategory;
    }
}