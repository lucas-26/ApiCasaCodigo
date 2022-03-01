package br.com.stud.casaDoCodigo.dataprovider.mapper;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.AuthorEntity;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.BookEntity;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CategoryEntity;
import br.com.stud.casaDoCodigo.domain.model.BookModel;

import java.util.ArrayList;
import java.util.List;

public class BookMapper {

    public static BookEntity parseModelForEntity(BookModel req, AuthorEntity aut, CategoryEntity cat) {
        return new BookEntity(
                req.getTitle(),
                req.getResume(),
                req.getSummary(),
                req.getPrice(),
                req.getNumberPages(),
                req.getIsbn(),
                req.getDatePublication(),
                cat,
                aut
        );
    }

    public static List<BookModel> parseListEntityForListModel(List<BookEntity> booksByDatabase) {

        List<BookModel> listForResponse = new ArrayList<>();

        booksByDatabase.forEach(a -> {
            listForResponse.add(
                    new BookModel(
                            a.getId(),
                            a.getTitle(),
                            a.getResume(),
                            a.getSummary(),
                            a.getPrice(),
                            a.getNumberPages(),
                            a.getIsbn(),
                            a.getDatePublication(),
                            a.getCategory().getId().intValue(),
                            a.getAuthor().getId().intValue()
                    )
            );
        });
        return listForResponse;
    }

    public static BookModel parseEntityForModel(BookEntity a) {
        return new BookModel(
                a.getId(),
                a.getTitle(),
                a.getResume(),
                a.getSummary(),
                a.getPrice(),
                a.getNumberPages(),
                a.getIsbn(),
                a.getDatePublication(),
                a.getCategory().getId().intValue(),
                a.getAuthor().getId().intValue()
        );
    }
}
