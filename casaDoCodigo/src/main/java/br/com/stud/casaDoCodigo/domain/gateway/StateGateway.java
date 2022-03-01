package br.com.stud.casaDoCodigo.domain.gateway;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.StateEntity;
import br.com.stud.casaDoCodigo.domain.model.StateModel;

public interface StateGateway {
    StateEntity createState(StateModel req);
}
