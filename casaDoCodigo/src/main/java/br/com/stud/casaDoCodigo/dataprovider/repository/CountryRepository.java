package br.com.stud.casaDoCodigo.dataprovider.repository;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {
}
