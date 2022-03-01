package br.com.stud.casaDoCodigo.usecases.stateUseCase.stateUseCaseimpl;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.StateEntity;
import br.com.stud.casaDoCodigo.domain.gateway.StateGateway;
import br.com.stud.casaDoCodigo.domain.model.StateModel;
import br.com.stud.casaDoCodigo.entrypoint.dto.request.StateReq;
import br.com.stud.casaDoCodigo.usecases.stateUseCase.StateUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateUseCaseImpl implements StateUseCase {

    @Autowired
    private StateGateway stateGateway;


    @Override
    public StateModel createState(StateReq req) {
        StateEntity state = stateGateway.createState(new StateModel(req.getNome(), req.getPais()));
        return new StateModel(state.getNome(), state.getPais().getId());
    }
}
