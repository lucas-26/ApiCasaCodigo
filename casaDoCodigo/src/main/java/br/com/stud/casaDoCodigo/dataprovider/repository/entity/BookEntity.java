package br.com.stud.casaDoCodigo.dataprovider.repository.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String resume;
    @Column(nullable = false)
    private String summary;
    @Column(nullable = false)
    private Double price;
    @Column(nullable = false)
    private Integer numberPages;
    @Column(nullable = false)
    private String isbn;
    @Column(nullable = false)
    private LocalDateTime datePublication;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinTable(name = "Book_Category",
        joinColumns = { @JoinColumn(name = "book_id", referencedColumnName = "id") },
        inverseJoinColumns = { @JoinColumn(name = "category_id", referencedColumnName = "id")})
    private CategoryEntity category;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinTable(name = "Book_Author",
            joinColumns = { @JoinColumn(name = "book_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "author_id", referencedColumnName = "id")})
    private AuthorEntity author;

    @Deprecated
    public BookEntity(){}

    public BookEntity(String title, String resume, String summary, Double price, Integer numberPages, String isbn, LocalDateTime datePublication, CategoryEntity category, AuthorEntity author) {
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

    public CategoryEntity getCategory() {
        return category;
    }

    public AuthorEntity getAuthor() {
        return author;
    }
}
