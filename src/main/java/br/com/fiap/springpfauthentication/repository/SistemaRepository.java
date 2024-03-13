package br.com.fiap.springpfauthentication.repository;

import br.com.fiap.springpfauthentication.entity.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface SistemaRepository extends JpaRepository<Sistema, Long> {

}
