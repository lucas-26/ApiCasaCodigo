package br.com.stud.casaDoCodigo.usecases.authorUseCase;

import br.com.stud.casaDoCodigo.domain.model.AuthorModel;

import java.util.Optional;

public interface AuthorUseCase {

    Optional<AuthorModel> findById(Integer id);

    Optional<AuthorModel> findAuthor(String id);

    AuthorModel createAuthor(AuthorModel author);

}
