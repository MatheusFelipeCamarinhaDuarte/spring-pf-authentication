package br.com.fiap.springpfauthentication.repository;

import br.com.fiap.springpfauthentication.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface PerfilRepository extends JpaRepository<Perfil, Long> {

}
