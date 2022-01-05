package br.com.stud.casaDoCodigo.entrypoint.controller;

import br.com.stud.casaDoCodigo.entrypoint.dto.request.AuthorReq;
import br.com.stud.casaDoCodigo.usecases.authorUseCase.AuthorUseCase;
import br.com.stud.casaDoCodigo.usecases.mapper.AuthorMapper;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Autores")
public class AuthorController {

    private AuthorUseCase authorUseCase;

    @Autowired
    public AuthorController(AuthorUseCase authorUseCase){
        this.authorUseCase = authorUseCase;
    }

    @RequestMapping
    public ResponseEntity<String> findAutores(@RequestBody @Valid AuthorReq author){
        AuthorMapper mapper  = new AuthorMapper();
        authorUseCase.createAutor(mapper.parseReqForModelUseCase(author));
        return ResponseEntity.ok("ok");
    }

}
