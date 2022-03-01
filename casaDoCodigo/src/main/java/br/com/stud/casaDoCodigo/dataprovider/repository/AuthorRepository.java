package br.com.stud.casaDoCodigo.dataprovider.repository;


import br.com.stud.casaDoCodigo.dataprovider.repository.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

    AuthorEntity findByEmail(String s);

}
