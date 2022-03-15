package br.com.stud.casaDoCodigo.entrypoint.annotation;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CountryEntity;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.StateEntity;
import br.com.stud.casaDoCodigo.domain.model.ClientModel;
import br.com.stud.casaDoCodigo.entrypoint.exception.exceptionsObject.StateBelongsToTheCountryException;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StateBelongsToTheCountry {

    @PersistenceContext
    private EntityManager entityManager;

    public void validate(ClientModel client) {

        CountryEntity country = entityManager.find(CountryEntity.class, Long.valueOf(client.getCountry()));
        StateEntity state = entityManager.find(StateEntity.class, Long.valueOf(client.getState()));

        existsState(country, state);
    }

    boolean existsState(CountryEntity country, StateEntity state) {

        String obj = StateEntity.class.getName();

        if (state == null) {
            Query query = entityManager.createQuery("SELECT 1 FROM " + obj + "");

            List<StateEntity> states =  query.getResultList();
            List<StateEntity> stateFiltered = states.stream().filter(stateEntity -> stateEntity.getPais().getId().equals(country.getId())).collect(Collectors.toList());

            if (stateFiltered.size() == 1){
                throw new IllegalArgumentException("Existis states registered for this country, please select one state..");
            }

        }
        if (country == null) {
            throw new IllegalArgumentException("This country not exists.");
        }

        if (state != null){
            if (!state.getPais().getId().equals(country.getId())) {
                throw new StateBelongsToTheCountryException("Exists one state create by Country, please use this register.");
            }
        }
        return true;
    }
}
