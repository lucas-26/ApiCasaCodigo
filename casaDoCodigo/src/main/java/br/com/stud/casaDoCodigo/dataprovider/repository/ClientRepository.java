package br.com.stud.casaDoCodigo.dataprovider.repository;

import br.com.stud.casaDoCodigo.dataprovider.repository.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
