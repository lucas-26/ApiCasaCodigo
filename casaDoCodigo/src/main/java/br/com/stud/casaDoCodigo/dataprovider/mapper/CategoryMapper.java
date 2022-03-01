package br.com.stud.casaDoCodigo.dataprovider.mapper;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CategoryEntity;
import br.com.stud.casaDoCodigo.domain.model.CategoryModel;

public class CategoryMapper {

    public static CategoryEntity parseByObjectForEntity(CategoryModel req) {
        return new CategoryEntity(req.getId(), req.getNome());
    }

}
