package br.com.stud.casaDoCodigo.usecases.mapper;

import br.com.stud.casaDoCodigo.domain.model.AuthorModel;
import br.com.stud.casaDoCodigo.entrypoint.dto.request.AuthorReq;

import java.time.LocalDateTime;


public class AuthorMapper {

    public AuthorModel parseReqForModelUseCase(AuthorReq author) {
        return new AuthorModel(
                LocalDateTime.now(),
                author.getEmail(),
                author.getNome(),
                author.getDescription()
        );
    }

    public AuthorModel parseReqForModel(AuthorModel author) {
        return new AuthorModel(
                author.getMomentRegister(),
                author.getEmail(),
                author.getNome(),
                author.getDescription()
        );
    }

}
