package br.com.stud.casaDoCodigo.domain.gateway;

import br.com.stud.casaDoCodigo.domain.model.AuthorModel;

import java.util.Optional;


public interface AuthorGateway {
    
    AuthorModel createAuthor(AuthorModel author);

    Optional<AuthorModel> find(String id);

    Optional<AuthorModel> findById(Integer id);
}
