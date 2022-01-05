package br.com.stud.casaDoCodigo.dataprovider.mapper;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.Author;
import br.com.stud.casaDoCodigo.domain.model.AuthorModel;

public class AuthorMapper {

    public Author parseModelForEntity(AuthorModel author){
        return new Author(
                author.getMomentRegister(),
                author.getEmail(),
                author.getNome(),
                author.getDescription()
        );
    }

}
