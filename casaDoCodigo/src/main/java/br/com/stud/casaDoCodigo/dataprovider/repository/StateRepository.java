package br.com.stud.casaDoCodigo.dataprovider.repository;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<StateEntity, Long> {
}
