package br.com.stud.casaDoCodigo.entrypoint.controller;

import br.com.stud.casaDoCodigo.domain.model.StateModel;
import br.com.stud.casaDoCodigo.entrypoint.dto.request.StateReq;
import br.com.stud.casaDoCodigo.entrypoint.dto.response.StateResp;
import br.com.stud.casaDoCodigo.usecases.stateUseCase.StateUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/State")
public class StateController {

    @Autowired
    private StateUseCase useCase;

    @PostMapping
    public ResponseEntity<StateResp> createState(StateReq req) {

        StateModel state = useCase.createState(req);
        StateResp resp = new StateResp(state.getNome(), state.getPais());
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id_state}").buildAndExpand(state.getId()).toUri();

        return ResponseEntity.created(location).body(resp);
    }
}
