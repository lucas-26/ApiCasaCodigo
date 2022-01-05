package br.com.stud.casaDoCodigo.dataprovider;

import br.com.stud.casaDoCodigo.dataprovider.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stud.casaDoCodigo.dataprovider.repository.AuthorRepository;
import br.com.stud.casaDoCodigo.domain.gateway.AuthorGateway;
import br.com.stud.casaDoCodigo.domain.model.AuthorModel;

@Service
public class AuthorDataProvider implements AuthorGateway {

    @Autowired
    AuthorRepository authorRepository;
    AuthorMapper mapper;

    @Override
    public AuthorModel createAuthor(AuthorModel author) {
        authorRepository.save(mapper.parseModelForEntity(author));
        System.out.println("chegou aqui");
        return null;
    }
    
}
