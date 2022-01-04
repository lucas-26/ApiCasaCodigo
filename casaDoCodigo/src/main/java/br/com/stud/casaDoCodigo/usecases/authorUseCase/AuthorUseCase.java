package br.com.stud.casaDoCodigo.usecases.authorUseCase;

import java.util.Optional;

import br.com.stud.casaDoCodigo.usecases.model.Author;

public interface AuthorUseCase {
    
    Optional<Author> findAutor(String id);

    Author createAutor (Author autor);

}
