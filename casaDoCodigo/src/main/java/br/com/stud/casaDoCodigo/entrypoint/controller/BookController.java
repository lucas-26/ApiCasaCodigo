package br.com.stud.casaDoCodigo.entrypoint.controller;

import br.com.stud.casaDoCodigo.domain.model.BookModel;
import br.com.stud.casaDoCodigo.entrypoint.dto.request.BookReq;
import br.com.stud.casaDoCodigo.entrypoint.dto.response.BookResp;
import br.com.stud.casaDoCodigo.usecases.bookUseCase.BookUseCase;
import br.com.stud.casaDoCodigo.usecases.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/Book")
public class BookController {

    private BookUseCase bookUseCase;

    @Autowired
    public BookController(BookUseCase bookUseCase) {
        this.bookUseCase = bookUseCase;
    }

    @PostMapping
    public ResponseEntity<BookResp> createBook(@RequestBody @Valid BookReq req) {

        BookModel respBook = bookUseCase.CreateBook(BookMapper.parseReqForModel(req));
        BookResp resp = br.com.stud.casaDoCodigo.entrypoint.mapper.BookMapper.parseModelForDto(respBook);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(respBook.getId()).toUri();

        return ResponseEntity.created(location).body(resp);
    }

    @GetMapping
    public ResponseEntity<List<BookResp>> findAllBooks(){

        List<BookModel> listOfBooks =  bookUseCase.findBooks();

        List<BookResp> resp = br.com.stud.casaDoCodigo.entrypoint.mapper.BookMapper.parseListModelForListDto(listOfBooks);

        return ResponseEntity.ok(resp);
    }

    @GetMapping("/{id_book}")
    public ResponseEntity<BookResp> findAllBooks(@PathVariable("id_book") Long id){

        BookModel book =  bookUseCase.findBook(id);

        BookResp bookResp = br.com.stud.casaDoCodigo.entrypoint.mapper.BookMapper.parseModelForDto(book);

        return ResponseEntity.ok(bookResp);
    }
}
