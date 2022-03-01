package br.com.stud.casaDoCodigo.domain.gateway;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CategoryEntity;

public interface CategoryGateway {
    String saveCategory(CategoryEntity request);

    CategoryEntity findCategory(String nameCategory);

    CategoryEntity findById(Integer id);
}
