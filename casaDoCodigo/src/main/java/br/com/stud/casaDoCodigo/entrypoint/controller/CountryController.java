package br.com.stud.casaDoCodigo.entrypoint.controller;

import br.com.stud.casaDoCodigo.entrypoint.dto.request.CountryReq;
import br.com.stud.casaDoCodigo.entrypoint.dto.response.CountryResp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Country")
public class CountryController {

    private CountryUseCase useCase;

    public ResponseEntity<CountryResp> createCountry(CountryReq req){

    }

}
