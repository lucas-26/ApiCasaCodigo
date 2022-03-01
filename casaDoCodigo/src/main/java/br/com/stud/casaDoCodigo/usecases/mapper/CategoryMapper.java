package br.com.stud.casaDoCodigo.usecases.mapper;

import br.com.stud.casaDoCodigo.domain.model.CategoryModel;
import br.com.stud.casaDoCodigo.entrypoint.dto.request.CategoryReq;

public class CategoryMapper {

    public static CategoryModel parseRequestForModel(CategoryReq req){
        return new CategoryModel(req.getNome());
    }

}
