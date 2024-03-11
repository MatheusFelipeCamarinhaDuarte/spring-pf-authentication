package br.com.fiap.resources;

import br.com.fiap.repository.UsuarioRepository;
import java.util.List;
import br.com.fiap.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioResource {

    private UsuarioRepository repo;

    @GetMapping
    public List<Usuario> findAll() {
        return null;
    }

    @GetMapping(value="/{id}")
    public Usuario findById(Long id) {
        return null;
    }

    @Transactional
    @PostMapping
    public Usuario save(Usuario usuario) {
        return null;
    }

}
