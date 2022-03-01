package br.com.stud.casaDoCodigo.dataprovider.mapper;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.AuthorEntity;
import br.com.stud.casaDoCodigo.domain.model.AuthorModel;

public class AuthorMapper {

    public static AuthorEntity parseModelForEntity(AuthorModel author) {
        return new AuthorEntity(
                author.getId(),
                author.getMomentRegister(),
                author.getEmail(),
                author.getNome(),
                author.getDescription()
        );
    }

}
