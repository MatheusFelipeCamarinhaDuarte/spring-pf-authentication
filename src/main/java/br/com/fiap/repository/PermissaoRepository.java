package br.com.fiap.repository;

import br.com.fiap.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PermissaoRepository extends JpaRepository<Permissao, Long> {

}
