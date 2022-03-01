package br.com.stud.casaDoCodigo.dataprovider;

import br.com.stud.casaDoCodigo.dataprovider.repository.CategoryRepository;
import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CategoryEntity;
import br.com.stud.casaDoCodigo.domain.gateway.CategoryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryDataProvider implements CategoryGateway {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryDataProvider(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public String saveCategory(CategoryEntity request) {
        categoryRepository.save(request);
        return "Category "+ request.getNameCategory() +" is created how success.";
    }

    @Override
    public CategoryEntity findCategory(String nameCategory) {
       CategoryEntity cat = categoryRepository.findByNameCategory(nameCategory);
       return new CategoryEntity(cat.getNameCategory());
    }

    @Override
    public CategoryEntity findById(Integer id) {
        Optional<CategoryEntity> cat = categoryRepository.findById(id.longValue());
        return new CategoryEntity(cat.get().getId(), cat.get().getNameCategory());
    }
}
