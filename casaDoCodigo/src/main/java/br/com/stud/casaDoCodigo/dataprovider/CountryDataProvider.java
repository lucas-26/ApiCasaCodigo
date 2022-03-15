package br.com.stud.casaDoCodigo.dataprovider;

import br.com.stud.casaDoCodigo.dataprovider.repository.CountryRepository;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CountryEntity;
import br.com.stud.casaDoCodigo.domain.gateway.CountryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryDataProvider implements CountryGateway {

    @Autowired
    private CountryRepository repository;

    @Override
    public CountryEntity persistNewCountry(CountryEntity countryEntity) {
       repository.save(countryEntity);
       return countryEntity;
    }
}
