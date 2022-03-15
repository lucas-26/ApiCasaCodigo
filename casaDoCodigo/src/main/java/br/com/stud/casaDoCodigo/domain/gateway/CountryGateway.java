package br.com.stud.casaDoCodigo.domain.gateway;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CountryEntity;

public interface CountryGateway {
    CountryEntity persistNewCountry(CountryEntity countryEntity);
}
