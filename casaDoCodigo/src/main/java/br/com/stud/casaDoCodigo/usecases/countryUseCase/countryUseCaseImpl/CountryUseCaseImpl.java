package br.com.stud.casaDoCodigo.usecases.countryUseCase.countryUseCaseImpl;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CountryEntity;
import br.com.stud.casaDoCodigo.domain.gateway.CountryGateway;
import br.com.stud.casaDoCodigo.domain.model.CountryModel;
import br.com.stud.casaDoCodigo.usecases.countryUseCase.CountryUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryUseCaseImpl implements CountryUseCase {

    @Autowired
    private CountryGateway gateway;

    @Override
    public CountryModel CreateNewCountry(CountryModel countryModel) {
        CountryEntity country = gateway.persistNewCountry(new CountryEntity(countryModel.getNome()));
        return new CountryModel(country.getId(), country.getNome());
    }
}
