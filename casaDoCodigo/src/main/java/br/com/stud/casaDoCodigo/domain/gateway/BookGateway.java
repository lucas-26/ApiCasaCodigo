package br.com.stud.casaDoCodigo.domain.gateway;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.BookEntity;

import java.util.List;

public interface BookGateway {

    BookEntity createNewBook(BookEntity book);

    List<BookEntity> findAllBooks();

    BookEntity findBook(Long id);
}
