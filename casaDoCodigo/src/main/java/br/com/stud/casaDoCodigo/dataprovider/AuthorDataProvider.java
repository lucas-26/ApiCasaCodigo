package br.com.stud.casaDoCodigo.dataprovider;

import br.com.stud.casaDoCodigo.dataprovider.mapper.AuthorMapper;
import br.com.stud.casaDoCodigo.dataprovider.repository.AuthorRepository;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.AuthorEntity;
import br.com.stud.casaDoCodigo.domain.gateway.AuthorGateway;
import br.com.stud.casaDoCodigo.domain.model.AuthorModel;
import br.com.stud.casaDoCodigo.entrypoint.exception.exceptionsObject.AuthorNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class AuthorDataProvider implements AuthorGateway {

    AuthorRepository authorRepository;

    @Autowired
    public AuthorDataProvider(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorModel createAuthor(AuthorModel author) {
        AuthorEntity authorEntity = AuthorMapper.parseModelForEntity(author);
        AuthorEntity authorSaved = authorRepository.save(authorEntity);

        return new AuthorModel(authorSaved.getId(), authorSaved.getMomentRegister(), authorSaved.getEmail(), authorSaved.getNome(),
                authorSaved.getDescription());
    }

    @Override
    public Optional<AuthorModel> find(String id) {
        try {
            Optional<AuthorEntity> authorRepo = authorRepository.findById(Long.valueOf(id));

            if (authorRepo.isEmpty()) {
                throw new AuthorNotFoundException("Author not found, verify if this id passed is correct.");
            }

            AuthorEntity author = authorRepo.get();

            return Optional.of(
                    new AuthorModel(
                            author.getMomentRegister(),
                            author.getNome(),
                            author.getEmail(),
                            author.getDescription()));

        } catch (NoSuchElementException e) {
            throw new AuthorNotFoundException("Author not found, verify if this id passed is correct.");
        }
    }

    @Override
    public Optional<AuthorModel> findById(Integer id) {
        try {
            Optional<AuthorEntity> authorRepo = authorRepository.findById(Long.valueOf(id));

            if (authorRepo.isEmpty()) {
                throw new AuthorNotFoundException("Author not found, verify if this id passed is correct.");
            }

            AuthorEntity author = authorRepo.get();

            return Optional.of(
                    new AuthorModel(
                            author.getId(),
                            author.getMomentRegister(),
                            author.getNome(),
                            author.getEmail(),
                            author.getDescription()));

        } catch (NoSuchElementException e) {
            throw new AuthorNotFoundException("Author not found, verify if this id passed is correct.");
        }
    }
}
