package br.com.stud.casaDoCodigo.usecases.stateUseCase;

import br.com.stud.casaDoCodigo.domain.model.StateModel;
import br.com.stud.casaDoCodigo.entrypoint.dto.request.StateReq;

public interface StateUseCase {

     StateModel createState(StateReq req);
}
