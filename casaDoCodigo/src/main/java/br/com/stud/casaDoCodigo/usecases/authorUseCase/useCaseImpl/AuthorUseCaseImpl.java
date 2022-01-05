package br.com.stud.casaDoCodigo.usecases.authorUseCase.useCaseImpl;

import java.util.Optional;

import br.com.stud.casaDoCodigo.domain.gateway.AuthorGateway;
import br.com.stud.casaDoCodigo.usecases.authorUseCase.AuthorUseCase;
import br.com.stud.casaDoCodigo.usecases.mapper.AuthorMapper;
import br.com.stud.casaDoCodigo.usecases.model.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorUseCaseImpl implements AuthorUseCase {

    @Autowired
    AuthorGateway authorGateway;
    private AuthorMapper mapper;

    @Override
    public Optional<Author> findAutor(String id) {
        authorGateway.createAuthor(null);
        return null;
    }

    @Override
    public Author createAutor(Author autor) {
        authorGateway.createAuthor(mapper.parseReqForModel(autor));
        return null;
    }

   
    
}
