package br.com.stud.casaDoCodigo.dataprovider;

import br.com.stud.casaDoCodigo.dataprovider.repository.ClientRepository;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.ClientEntity;
import br.com.stud.casaDoCodigo.domain.gateway.ClientGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientDataProvider implements ClientGateway {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Long persistNewClient(ClientEntity clientEntity) {
        ClientEntity client = clientRepository.save(clientEntity);
        return client.getId();
    }
}
