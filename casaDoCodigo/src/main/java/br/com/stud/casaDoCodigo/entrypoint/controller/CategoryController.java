package br.com.stud.casaDoCodigo.entrypoint.controller;

import br.com.stud.casaDoCodigo.domain.model.CategoryModel;
import br.com.stud.casaDoCodigo.entrypoint.dto.request.CategoryReq;
import br.com.stud.casaDoCodigo.entrypoint.dto.response.CategoryResp;
import br.com.stud.casaDoCodigo.usecases.categoryUseCase.CategoryUseCase;
import br.com.stud.casaDoCodigo.usecases.mapper.CategoryMapper;
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
@RequestMapping("/Category")
public class CategoryController {

    private final CategoryUseCase categoryUseCase;

    @Autowired
    public CategoryController(CategoryUseCase categoryUseCase) {
        this.categoryUseCase = categoryUseCase;
    }

    @PostMapping
    public ResponseEntity<CategoryResp> createCategory(@Valid @RequestBody CategoryReq req) {

        String response = categoryUseCase.createCategory(CategoryMapper.parseRequestForModel(req));

        CategoryModel cat = categoryUseCase.findCategory(req.getNome());

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{name_category}").buildAndExpand(cat.getNome()).toUri();

        return ResponseEntity.created(location).body(new CategoryResp(response));
    }
}