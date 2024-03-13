package br.com.fiap.springpfauthentication.repository;

import br.com.fiap.springpfauthentication.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
