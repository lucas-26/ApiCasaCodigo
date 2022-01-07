package br.com.stud.casaDoCodigo.entrypoint.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.stud.casaDoCodigo.entrypoint.dto.request.AuthorReq;
import br.com.stud.casaDoCodigo.entrypoint.dto.response.AuthorResp;
import br.com.stud.casaDoCodigo.usecases.authorUseCase.AuthorUseCase;

@SpringBootTest
public class AuthorControllerTests {

    private AuthorUseCase authorUseCase;
    private AuthorReq request;

    @BeforeEach
    public void build_object() {

        authorUseCase = mock(AuthorUseCase.class);

        request = new AuthorReq("Fulano clicano",
                "Fulano.clicano@gmail.com.br",
                "O autor fulano costuma escrever sobre devops.");
    }

    @Test
    void criar_Author() {

        AuthorController controller = new AuthorController(authorUseCase);
        ResponseEntity<AuthorResp> authorReturn = controller.createAuthor(request);

        Assertions.assertEquals("Um novo autor criado no sitema.", authorReturn.getBody().getmessage());
        Assertions.assertEquals(HttpStatus.OK, authorReturn.getStatusCode());
    }

}