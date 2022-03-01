package br.com.stud.casaDoCodigo.domain.model;

import java.time.LocalDateTime;

public class BookModel {

    private Long id;
    private String title;
    private String resume;
    private String summary;
    private Double price;
    private Integer numberPages;
    private String isbn;
    private LocalDateTime datePublication;
    private Integer category;
    private Integer author;

    public BookModel(String title, String resume, String summary, Double price, Integer numberPages, String isbn, LocalDateTime datePublication, Integer category, Integer author) {
        this.title = title;
        this.resume = resume;
        this.summary = summary;
        this.price = price;
        this.numberPages = numberPages;
        this.isbn = isbn;
        this.datePublication = datePublication;
        this.category = category;
        this.author = author;
    }

    public BookModel(Long id, String title, String resume, String summary, Double price, Integer numberPages, String isbn, LocalDateTime datePublication, Integer category, Integer author) {
        this.id = id;
        this.title = title;
        this.resume = resume;
        this.summary = summary;
        this.price = price;
        this.numberPages = numberPages;
        this.isbn = isbn;
        this.datePublication = datePublication;
        this.category = category;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getResume() {
        return resume;
    }

    public String getSummary() {
        return summary;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getNumberPages() {
        return numberPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDateTime getDatePublication() {
        return datePublication;
    }

    public Integer getCategory() {
        return category;
    }

    public Integer getAuthor() {
        return author;
    }
}
