package br.com.stud.casaDoCodigo.domain.gateway;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.ClientEntity;

public interface ClientGateway {

    Long persistNewClient(ClientEntity clientEntity);

}
