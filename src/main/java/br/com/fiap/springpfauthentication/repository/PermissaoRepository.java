package br.com.fiap.springpfauthentication.repository;

import br.com.fiap.springpfauthentication.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PermissaoRepository extends JpaRepository<Permissao, Long> {

}
