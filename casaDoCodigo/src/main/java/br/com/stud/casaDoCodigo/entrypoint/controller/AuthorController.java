package br.com.stud.casaDoCodigo.entrypoint.controller;

import br.com.stud.casaDoCodigo.usecases.authorUseCase.AuthorUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> findAutores(){
        authorUseCase.createAutor(null);
        return ResponseEntity.ok("ok");

    }

}
