package br.com.stud.casaDoCodigo.entrypoint.mapper;

import br.com.stud.casaDoCodigo.domain.model.BookModel;
import br.com.stud.casaDoCodigo.entrypoint.dto.response.BookResp;

import java.util.ArrayList;
import java.util.List;

public class BookMapper {

    public static BookResp parseModelForDto(BookModel respBook) {
        return new BookResp(
                respBook.getId(),
                respBook.getTitle(),
                respBook.getResume(),
                respBook.getSummary(),
                respBook.getPrice(),
                respBook.getNumberPages(),
                respBook.getIsbn(),
                respBook.getDatePublication(),
                respBook.getCategory(),
                respBook.getAuthor()
        );
    }

    public static List<BookResp> parseListModelForListDto(List<BookModel> listOfBooks) {

        List<BookResp> books = new ArrayList<>();

        listOfBooks.forEach(book -> {
            books.add(
                    new BookResp(
                            book.getId(),
                            book.getTitle(),
                            book.getResume(),
                            book.getSummary(),
                            book.getPrice(),
                            book.getNumberPages(),
                            book.getIsbn(),
                            book.getDatePublication(),
                            book.getCategory(),
                            book.getAuthor()
                    )
            );
        });

        return books;
    }
}
