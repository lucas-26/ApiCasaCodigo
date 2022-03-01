package br.com.stud.casaDoCodigo.entrypoint.dto.request;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.AuthorEntity;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CategoryEntity;
import br.com.stud.casaDoCodigo.entrypoint.annotation.ValidatorEntityById;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

public class BookReq {

    @NotBlank
    private String title;
    @NotBlank
    @Size(max = 500)
    private String resume;
    @NotBlank
    private String summary;
    @NotNull
    @Min(20)
    private Double price;
    @NotNull
    @Min(100)
    private Integer numberPages;
    @NotBlank
    private String isbn;
    @Future
    private LocalDateTime datePublication;
    @NotNull
    @ValidatorEntityById(target = "id", domainCLass = CategoryEntity.class)
    private Integer category;
    @NotNull
    @ValidatorEntityById(target = "id", domainCLass = AuthorEntity.class)
    private Integer author;

    public BookReq(String title, String resume, String summary, Double price, Integer numberPages, String isbn, LocalDateTime datePublication, Integer category, Integer author) {
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
