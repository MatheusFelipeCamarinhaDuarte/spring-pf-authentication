package br.com.fiap.repository;

import br.com.fiap.entity.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface SistemaRepository extends JpaRepository<Sistema, Long> {

}
