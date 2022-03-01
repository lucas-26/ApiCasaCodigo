package br.com.stud.casaDoCodigo.usecases.bookUseCase;

import br.com.stud.casaDoCodigo.domain.model.BookModel;

import java.util.List;

public interface BookUseCase {

    BookModel CreateBook(BookModel req);

    List<BookModel> findBooks();

    BookModel findBook(Long id);
}
