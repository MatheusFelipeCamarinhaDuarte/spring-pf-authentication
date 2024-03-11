package br.com.fiap.repository;

import br.com.fiap.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
