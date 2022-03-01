package br.com.stud.casaDoCodigo.dataprovider;

import br.com.stud.casaDoCodigo.dataprovider.repository.AuthorRepository;
import br.com.stud.casaDoCodigo.dataprovider.repository.BookRepository;
import br.com.stud.casaDoCodigo.dataprovider.repository.CategoryRepository;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.AuthorEntity;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.BookEntity;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CategoryEntity;
import br.com.stud.casaDoCodigo.domain.gateway.BookGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookDataProvider implements BookGateway {

    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;
    private final AuthorRepository authorRepository;


    @Autowired
    public BookDataProvider(BookRepository bookRepository, CategoryRepository categoryRepository, AuthorRepository authorRepository){
        this.bookRepository = bookRepository;
        this.categoryRepository = categoryRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public BookEntity createNewBook(BookEntity book) {
        try {
            bookRepository.save(book);
            return book;
        } catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<BookEntity> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public BookEntity findBook(Long id) {
        return bookRepository.findById(id).get();
    }
}
