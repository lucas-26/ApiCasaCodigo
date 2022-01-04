package br.com.stud.casaDoCodigo.usecases.authorUseCase.useCaseImpl;

import java.util.Optional;

import br.com.stud.casaDoCodigo.domain.gateway.AuthorGateway;
import br.com.stud.casaDoCodigo.usecases.authorUseCase.AuthorUseCase;
import br.com.stud.casaDoCodigo.usecases.model.Author;
import org.springframework.stereotype.Service;

@Service
public class AuthorUseCaseImpl implements AuthorUseCase {

    AuthorGateway authorGateway;

    @Override
    public Optional<Author> findAutor(String id) {
        authorGateway.createAuthor(null);
        return null;
    }

    @Override
    public Author createAutor(Author autor) {
        // TODO Auto-generated method stub
        return null;
    }

   
    
}
