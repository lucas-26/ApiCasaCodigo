package br.com.stud.casaDoCodigo.usecases.mapper;

import br.com.stud.casaDoCodigo.entrypoint.dto.request.AuthorReq;
import br.com.stud.casaDoCodigo.usecases.model.Author;
import br.com.stud.casaDoCodigo.domain.model.AuthorModel;

import java.time.LocalDateTime;


public class AuthorMapper {

    public Author parseReqForModelUseCase(AuthorReq author) {
        return new Author(
                LocalDateTime.now(),
                author.getEmail(),
                author.getNome(),
                author.getDescription()
        );
    }

    public AuthorModel parseReqForModel(Author author){
        return new AuthorModel(
            author.getMomentRegister(),
            author.getEmail(),
            author.getNome(),
            author.getDescription()
        );
    }

}
