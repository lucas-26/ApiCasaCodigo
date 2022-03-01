package br.com.stud.casaDoCodigo.usecases.authorUseCase.authorUseCaseImpl;

import br.com.stud.casaDoCodigo.domain.gateway.AuthorGateway;
import br.com.stud.casaDoCodigo.domain.model.AuthorModel;
import br.com.stud.casaDoCodigo.usecases.authorUseCase.AuthorUseCase;
import br.com.stud.casaDoCodigo.usecases.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorUseCaseImpl implements AuthorUseCase {

    AuthorGateway authorGateway;
    AuthorMapper mapper = new AuthorMapper();

    @Autowired
    public AuthorUseCaseImpl(AuthorGateway authorGateway) {
        this.authorGateway = authorGateway;
    }

    @Override
    public Optional<AuthorModel> findById(Integer id) {
        Optional<AuthorModel> authorModel = authorGateway.findById(id);
        return Optional.of(
                new AuthorModel(
                        authorModel.get().getId(),
                        authorModel.get().getMomentRegister(),
                        authorModel.get().getNome(),
                        authorModel.get().getEmail(),
                        authorModel.get().getDescription()));
    }

    @Override
    public Optional<AuthorModel> findAuthor(String id) {
        Optional<AuthorModel> authorModel = authorGateway.find(id);

        return Optional.of(
                new AuthorModel(
                        authorModel.get().getId(),
                        authorModel.get().getMomentRegister(),
                        authorModel.get().getNome(),
                        authorModel.get().getEmail(),
                        authorModel.get().getDescription()));
    }

    @Override
    public AuthorModel createAuthor(AuthorModel author) {
        AuthorModel authorModel = mapper.parseReqForModel(author);
        authorModel = authorGateway.createAuthor(authorModel);
        return new AuthorModel(authorModel.getId(), authorModel.getMomentRegister(), authorModel.getEmail(), authorModel.getNome(),
                authorModel.getDescription());
    }

}
