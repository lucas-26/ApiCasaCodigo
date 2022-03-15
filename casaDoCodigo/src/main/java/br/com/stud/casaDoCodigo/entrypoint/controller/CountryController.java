package br.com.stud.casaDoCodigo.entrypoint.controller;

import br.com.stud.casaDoCodigo.domain.model.CountryModel;
import br.com.stud.casaDoCodigo.entrypoint.dto.request.CountryReq;
import br.com.stud.casaDoCodigo.entrypoint.dto.response.CountryResp;
import br.com.stud.casaDoCodigo.usecases.countryUseCase.CountryUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/Country")
public class CountryController {

    @Autowired
    private CountryUseCase useCase;

    @PostMapping
    public ResponseEntity<CountryResp> createCountry(@RequestBody @Valid CountryReq req){

        CountryModel country = useCase.CreateNewCountry(new CountryModel(req.getNome()));

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(country.getId()).toUri();

        return ResponseEntity.created(location).body(new CountryResp(country.getId(),country.getNome()));
    }
}
