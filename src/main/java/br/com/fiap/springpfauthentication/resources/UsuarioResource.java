package br.com.fiap.springpfauthentication.resources;

import br.com.fiap.springpfauthentication.repository.UsuarioRepository;
import java.util.List;
import br.com.fiap.springpfauthentication.entity.Usuario;
import jakarta.transaction.Transactional;
import org.apache.coyote.Response;
import org.hibernate.mapping.Array;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioResource {

    private UsuarioRepository repo;

    @GetMapping
    public List<Usuario> findAll() {
        return repo.findAll();
    }

    @GetMapping(value="/{id}")
    public Usuario findById(@PathVariable Long id) {
        return repo.findById( id ).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Usuario save(@RequestBody Usuario usuario) {
        return repo.save( usuario );
    }

}
