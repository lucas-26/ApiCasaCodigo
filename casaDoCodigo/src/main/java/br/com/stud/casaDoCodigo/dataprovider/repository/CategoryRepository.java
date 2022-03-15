package br.com.stud.casaDoCodigo.dataprovider.repository;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    CategoryEntity findByNameCategory(String name);

}
