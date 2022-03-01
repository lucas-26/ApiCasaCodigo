package br.com.stud.casaDoCodigo.usecases.categoryUseCase;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CategoryEntity;
import br.com.stud.casaDoCodigo.domain.model.CategoryModel;

import java.util.Optional;

public interface CategoryUseCase {

    Optional<CategoryModel> findById(Integer id);

    String createCategory(CategoryModel req);

    CategoryModel findCategory(String nameCategory);
}
