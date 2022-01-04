package br.com.stud.casaDoCodigo.dataprovider;

import br.com.stud.casaDoCodigo.dataprovider.repository.AuthorRepository;
import br.com.stud.casaDoCodigo.domain.gateway.AuthorGateway;
import br.com.stud.casaDoCodigo.domain.model.Author;

public class AuthorDataProvider implements AuthorGateway {

    AuthorRepository authorRepository;

    @Override
    public Author createAuthor(Author author) {
        authorRepository.save(null);
        return null;
    }
    
}
