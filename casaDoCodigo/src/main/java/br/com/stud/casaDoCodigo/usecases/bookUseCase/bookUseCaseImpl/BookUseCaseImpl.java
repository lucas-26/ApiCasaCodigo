package br.com.stud.casaDoCodigo.usecases.bookUseCase.bookUseCaseImpl;

import br.com.stud.casaDoCodigo.dataprovider.mapper.AuthorMapper;
import br.com.stud.casaDoCodigo.dataprovider.mapper.BookMapper;
import br.com.stud.casaDoCodigo.dataprovider.mapper.CategoryMapper;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.BookEntity;
import br.com.stud.casaDoCodigo.domain.gateway.BookGateway;
import br.com.stud.casaDoCodigo.domain.model.AuthorModel;
import br.com.stud.casaDoCodigo.domain.model.BookModel;
import br.com.stud.casaDoCodigo.domain.model.CategoryModel;
import br.com.stud.casaDoCodigo.usecases.authorUseCase.AuthorUseCase;
import br.com.stud.casaDoCodigo.usecases.bookUseCase.BookUseCase;
import br.com.stud.casaDoCodigo.usecases.categoryUseCase.CategoryUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookUseCaseImpl implements BookUseCase {

    private BookGateway bookGateway;

    private AuthorUseCase authorUseCase;

    private CategoryUseCase categoryUseCase;

    @Autowired
    public BookUseCaseImpl(BookGateway bookGateway, AuthorUseCase authorUseCase, CategoryUseCase categoryUseCase) {
        this.bookGateway = bookGateway;
        this.authorUseCase = authorUseCase;
        this.categoryUseCase = categoryUseCase;
    }

    @Override
    public BookModel CreateBook(BookModel req) {
        Optional<AuthorModel> aut = authorUseCase.findById(req.getAuthor());
        Optional<CategoryModel> cat = categoryUseCase.findById(req.getCategory());

        if (aut.isEmpty() || cat.isEmpty()) {
            if (aut.isEmpty()) {
                throw new IllegalArgumentException("this author not exists, you need pass one id author what exists in house of code.");
            }

            throw new IllegalArgumentException("this category not exists, you need pass one id category what exists in house of code.");
        }

        BookEntity responseForReturn =
                bookGateway.createNewBook(BookMapper.
                        parseModelForEntity(req,
                                AuthorMapper.parseModelForEntity(aut.get()),
                                CategoryMapper.parseByObjectForEntity(cat.get())));

        return br.com.stud.casaDoCodigo.usecases.mapper.BookMapper.parseEntityForModelObject(responseForReturn);

    }

    @Override
    public List<BookModel> findBooks() {
        List<BookEntity> booksByDatabase = bookGateway.findAllBooks();

        return BookMapper.parseListEntityForListModel(booksByDatabase);
    }

    @Override
    public BookModel findBook(Long id) {

        BookEntity bookFindeed =  bookGateway.findBook(id);

        return BookMapper.parseEntityForModel(bookFindeed);
    }

}
