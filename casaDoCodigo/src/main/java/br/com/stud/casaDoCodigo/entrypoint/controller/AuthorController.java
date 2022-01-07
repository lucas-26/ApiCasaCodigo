package br.com.stud.casaDoCodigo.entrypoint.controller;

import br.com.stud.casaDoCodigo.entrypoint.dto.request.AuthorReq;
import br.com.stud.casaDoCodigo.entrypoint.dto.response.AuthorResp;
import br.com.stud.casaDoCodigo.usecases.authorUseCase.AuthorUseCase;
import br.com.stud.casaDoCodigo.usecases.mapper.AuthorMapper;
import br.com.stud.casaDoCodigo.usecases.model.Author;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Autores")
public class AuthorController {

    private AuthorUseCase authorUseCase;
    private AuthorMapper mapper  = new AuthorMapper();
    
    @Autowired
    public AuthorController(AuthorUseCase authorUseCase){
        this.authorUseCase = authorUseCase;
    }

    @PostMapping
    public ResponseEntity<AuthorResp> createAuthor(@RequestBody @Valid @JsonProperty("Author") AuthorReq author){
        Author authorModel = mapper.parseReqForModelUseCase(author);
        authorUseCase.createAutor(authorModel);

        AuthorResp response = new AuthorResp();
        response.messageForCreateNewAuthor("Um novo autor criado no sitema.");
        return ResponseEntity.ok(response);
    }

}
