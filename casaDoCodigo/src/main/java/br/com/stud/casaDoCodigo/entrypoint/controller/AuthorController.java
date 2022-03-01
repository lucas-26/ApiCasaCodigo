package br.com.stud.casaDoCodigo.entrypoint.controller;

import br.com.stud.casaDoCodigo.domain.model.AuthorModel;
import br.com.stud.casaDoCodigo.entrypoint.dto.request.AuthorReq;
import br.com.stud.casaDoCodigo.entrypoint.dto.response.AuthorResp;
import br.com.stud.casaDoCodigo.entrypoint.dto.response.FindAuthorResp;
import br.com.stud.casaDoCodigo.usecases.authorUseCase.AuthorUseCase;
import br.com.stud.casaDoCodigo.usecases.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/Autores")
public class AuthorController {

    private final AuthorUseCase authorUseCase;
    private final AuthorMapper mapper = new AuthorMapper();

    @Autowired
    public AuthorController(AuthorUseCase authorUseCase) {
        this.authorUseCase = authorUseCase;
    }

    @PostMapping
    public ResponseEntity<AuthorResp> createAuthor(@RequestBody @Valid AuthorReq author) {
        AuthorModel authorModel = mapper.parseReqForModelUseCase(author);
        AuthorModel authorCreated = authorUseCase.createAuthor(authorModel);

        AuthorResp response = new AuthorResp();
        response.messageForCreateNewAuthor("Um novo autor criado no sitema.");

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idAuthor}").buildAndExpand(authorCreated.getId()).toUri();

        return ResponseEntity.created(location).body(response);
    }

    @GetMapping("/{idAuthor}")
    public ResponseEntity<FindAuthorResp> findAuthor(@PathVariable("idAuthor") String id) {

        Optional<AuthorModel> myAuthorUseCase = authorUseCase.findAuthor(id);
        AuthorModel author = myAuthorUseCase.get();
        FindAuthorResp response = new FindAuthorResp(
                author.getNome(),
                author.getEmail(),
                author.getDescription());

        return ResponseEntity.ok().body(response);
    }
}
