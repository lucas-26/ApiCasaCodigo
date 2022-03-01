package br.com.stud.casaDoCodigo.dataprovider;

import br.com.stud.casaDoCodigo.dataprovider.repository.CountryRepository;
import br.com.stud.casaDoCodigo.dataprovider.repository.StateRepository;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CountryEntity;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.StateEntity;
import br.com.stud.casaDoCodigo.domain.gateway.StateGateway;
import br.com.stud.casaDoCodigo.domain.model.StateModel;
import org.springframework.stereotype.Service;

@Service
public class StateDataProvider implements StateGateway {

    private StateRepository repository;
    private CountryRepository countryRepository;

    @Override
    public StateEntity createState(StateModel req) {
        return repository.save(new StateEntity(req.getNome(), countryRepository.getById(req.getPais())));
    }
}
