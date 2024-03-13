package br.com.fiap.springpfauthentication.resources;

import br.com.fiap.springpfauthentication.repository.SistemaRepository;
import br.com.fiap.springpfauthentication.repository.UsuarioRepository;
import java.util.List;
import br.com.fiap.springpfauthentication.entity.Sistema;
import br.com.fiap.springpfauthentication.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/sistema")
public class SistemaResource {

    private SistemaRepository repo;

    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Sistema> findAll() {
        return repo.findAll();
    }

    @GetMapping(value="/{id}")
    public Sistema findById(Long id) {
        return repo.findById( id ).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Sistema save(Sistema sistema) {
        return repo.save( sistema );
    }

    @Transactional
    @PostMapping(value="/{id}/responsaveis")
    public Sistema save(Long id, Usuario u) {
        return repo.save( id );
    }

}
