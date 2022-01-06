package br.com.stud.casaDoCodigo.dataprovider;

import br.com.stud.casaDoCodigo.dataprovider.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stud.casaDoCodigo.dataprovider.repository.AuthorRepository;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.Author;
import br.com.stud.casaDoCodigo.domain.gateway.AuthorGateway;
import br.com.stud.casaDoCodigo.domain.model.AuthorModel;

@Service
public class AuthorDataProvider implements AuthorGateway {

    @Autowired
    AuthorRepository authorRepository;
    AuthorMapper mapper = new AuthorMapper();

    @Override
    public AuthorModel createAuthor(AuthorModel author) {
        Author authorEntity = mapper.parseModelForEntity(author);
        Author authorSaved = authorRepository.save(authorEntity);

        return new AuthorModel(authorSaved.getMomentRegister(), authorSaved.getEmail(), authorSaved.getNome(),
                authorSaved.getDescription());
    }

}
