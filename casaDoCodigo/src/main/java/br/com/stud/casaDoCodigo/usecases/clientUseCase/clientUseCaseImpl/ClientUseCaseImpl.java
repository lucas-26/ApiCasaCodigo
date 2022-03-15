package br.com.stud.casaDoCodigo.usecases.clientUseCase.clientUseCaseImpl;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.ClientEntity;
import br.com.stud.casaDoCodigo.domain.gateway.ClientGateway;
import br.com.stud.casaDoCodigo.domain.model.ClientModel;
import br.com.stud.casaDoCodigo.entrypoint.annotation.StateBelongsToTheCountry;
import br.com.stud.casaDoCodigo.usecases.clientUseCase.ClientUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientUseCaseImpl implements ClientUseCase {

    @Autowired
    private ClientGateway clientGateway;

    @Autowired
    private StateBelongsToTheCountry stateValidCountry = new StateBelongsToTheCountry();

    @Override
    public Long createClient(ClientModel client) {

        stateValidCountry.validate(client);

        return clientGateway.persistNewClient(
                new ClientEntity(client.getEmail(), client.getNome(), client.getLastName(),
                    client.getDocument(), client.getComplement(), client.getAddress(), client.getCity(),
                        client.getCountry(), client.getState(), client.getNumberPhone(), client.getCep())
        );
    }
}
