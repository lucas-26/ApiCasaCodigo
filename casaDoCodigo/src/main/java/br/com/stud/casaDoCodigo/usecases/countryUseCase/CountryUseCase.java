package br.com.stud.casaDoCodigo.usecases.countryUseCase;

import br.com.stud.casaDoCodigo.domain.model.CountryModel;

public interface CountryUseCase {
    CountryModel CreateNewCountry(CountryModel countryModel);
}
