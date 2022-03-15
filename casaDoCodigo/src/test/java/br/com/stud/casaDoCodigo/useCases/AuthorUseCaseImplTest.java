//package br.com.stud.casaDoCodigo.useCases;
//
//import br.com.stud.casaDoCodigo.domain.model.AuthorModel;
//import br.com.stud.casaDoCodigo.usecases.authorUseCase.AuthorUseCase;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.time.LocalDateTime;
//
//@SpringBootTest
//public class AuthorUseCaseImplTest {
//
//    AuthorModel aut;
//
//    @Autowired
//    private AuthorUseCase useCase;
//
//    @BeforeEach
//    public void build_object() {
//
//        aut = new AuthorModel(
//                LocalDateTime.now(),
//                "Fulano.clicano@gmail.com.br",
//                "Fulano clicano",
//                "O autor fulano costuma escrever sobre devops.");
//    }
//
//    @Test
//    void create_Author_Test() {
//        AuthorUseCase useCaseMock = Mockito.mock(AuthorUseCase.class);
//
//        Mockito.when(useCaseMock.createAuthor(aut)).thenReturn(aut);
//
//        AuthorModel authorMock = useCaseMock.createAuthor(aut);
//        AuthorModel author = useCase.createAuthor(aut);
//
//        Assertions.assertEquals(author.getNome(), authorMock.getNome());
//    }
//
//}
