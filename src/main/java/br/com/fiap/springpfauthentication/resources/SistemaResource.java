package br.com.fiap.springpfauthentication.resources;

import br.com.fiap.springpfauthentication.entity.Perfil;
import br.com.fiap.springpfauthentication.entity.Permissao;
import br.com.fiap.springpfauthentication.repository.SistemaRepository;
import br.com.fiap.springpfauthentication.repository.UsuarioRepository;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import br.com.fiap.springpfauthentication.entity.Sistema;
import br.com.fiap.springpfauthentication.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/sistema")
public class SistemaResource {

    @Autowired
    private SistemaRepository repo;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Sistema> findAll() {
        return repo.findAll();
    }

    @GetMapping(value="/{id}")
    public Sistema findById(@PathVariable Long id) {
        return repo.findById( id ).orElseThrow();
    }

    @GetMapping(value="/{id}/responsaveis")
    public Set<Usuario> findSistemaByIdResponsaveis(@PathVariable Long id) {
        Sistema sistema = repo.findById(id).orElseThrow();

        return sistema.getResponsaveis();
    }

    @Transactional
    @PostMapping
    public Sistema save(@RequestBody Sistema sistema) {
        return repo.save( sistema );
    }

    @Transactional
    @PostMapping(value="/{id}/responsaveis")
    public Sistema save(@PathVariable Long id, @RequestBody Usuario u) {
        Sistema sistema = repo.findById(id).orElseThrow();

        if (Objects.isNull(u)) return null;

        if (Objects.nonNull(u.getId())) {
            Usuario usuario = usuarioRepository.findById(u.getId()).orElseThrow();
            sistema.getResponsaveis().add(usuario);
            return sistema;
        }

        sistema.getResponsaveis().add(u);

        return sistema;
    }

}
