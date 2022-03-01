package br.com.stud.casaDoCodigo.usecases.mapper;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.BookEntity;
import br.com.stud.casaDoCodigo.entrypoint.dto.request.BookReq;
import br.com.stud.casaDoCodigo.domain.model.BookModel;

public class BookMapper {

    public static BookModel parseReqForModel(BookReq req){
        return new BookModel(
                req.getTitle(),
                req.getResume(),
                req.getSummary(),
                req.getPrice(),
                req.getNumberPages(),
                req.getIsbn(),
                req.getDatePublication(),
                Integer.valueOf(req.getCategory()),
                Integer.valueOf(req.getAuthor())
        );
    }

    public static BookModel parseEntityForModelObject(BookEntity responseForReturn){
        return new BookModel(responseForReturn.getId(), responseForReturn.getTitle(),
                responseForReturn.getResume(), responseForReturn.getSummary(),
                responseForReturn.getPrice(), responseForReturn.getNumberPages(),
                responseForReturn.getIsbn(), responseForReturn.getDatePublication(),
                responseForReturn.getCategory().getId().intValue(),
                responseForReturn.getAuthor().getId().intValue());
    }
}
