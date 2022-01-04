package br.com.stud.casaDoCodigo.dataprovider.repository;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
