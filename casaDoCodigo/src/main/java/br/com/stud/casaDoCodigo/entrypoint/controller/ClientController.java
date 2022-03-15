package br.com.stud.casaDoCodigo.entrypoint.controller;

import br.com.stud.casaDoCodigo.domain.model.ClientModel;
import br.com.stud.casaDoCodigo.entrypoint.dto.request.ClientReq;
import br.com.stud.casaDoCodigo.entrypoint.dto.response.ClientResponse;
import br.com.stud.casaDoCodigo.usecases.clientUseCase.ClientUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/Clients")
public class ClientController {

    @Autowired
    private ClientUseCase clientUseCase;

    @PostMapping
    public ResponseEntity<ClientResponse> createClient(
            @RequestBody
            @Valid
            ClientReq req) {

        Long idClient = clientUseCase.createClient(
                new ClientModel(req.getEmail(), req.getNome(), req.getLastName(), req.getDocument(), req.getAddress(),
                        req.getComplement(), req.getCity(), req.getIdCountry().toString(), req.getIdState().toString(), req.getNumberPhone(),
                            req.getCep()));

        ClientResponse response = new ClientResponse("User is created how success, how id " + idClient + "", idClient);

        return ResponseEntity.ok(response);
    }
}
