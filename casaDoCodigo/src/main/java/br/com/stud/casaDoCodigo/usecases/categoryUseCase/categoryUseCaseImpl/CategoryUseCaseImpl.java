package br.com.stud.casaDoCodigo.usecases.categoryUseCase.categoryUseCaseImpl;


import br.com.stud.casaDoCodigo.dataprovider.mapper.CategoryMapper;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CategoryEntity;
import br.com.stud.casaDoCodigo.domain.gateway.CategoryGateway;
import br.com.stud.casaDoCodigo.domain.model.CategoryModel;
import br.com.stud.casaDoCodigo.usecases.categoryUseCase.CategoryUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryUseCaseImpl implements CategoryUseCase {

    private CategoryGateway categoryGateway;

    @Autowired
    public CategoryUseCaseImpl(CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public Optional<CategoryModel> findById(Integer id) {
        CategoryEntity cat = categoryGateway.findById(id);
        return Optional.of(new CategoryModel(cat.getId() ,cat.getNameCategory()));
    }

    @Override
    public String createCategory(CategoryModel req) {
        return categoryGateway.saveCategory(CategoryMapper.parseByObjectForEntity(req));
    }

    @Override
    public CategoryModel findCategory(String nameCategory) {
        CategoryEntity cat = categoryGateway.findCategory(nameCategory);
        return new CategoryModel(cat.getNameCategory());
    }
}
