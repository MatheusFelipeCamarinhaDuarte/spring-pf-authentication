package br.com.fiap.springpfauthentication.resources;

import br.com.fiap.springpfauthentication.repository.PermissaoRepository;
import br.com.fiap.springpfauthentication.repository.PerfilRepository;
import java.util.List;
import br.com.fiap.springpfauthentication.entity.Perfil;
import br.com.fiap.springpfauthentication.entity.Permissao;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/perfil")
public class PerfilResource {

    private PermissaoRepository permissaoRepository;

    private PerfilRepository repo;

    @GetMapping
    public List<Perfil> findAll() {
        return null;
    }

    @GetMapping(value="/{id}")
    public Perfil findById(Long id) {
        return null;
    }


    @Transactional
    @PostMapping
    public Perfil save(Perfil perfil) {
        return null;
    }

    @Transactional
    @PostMapping(value="/{id}/permissoes")
    public Perfil save(Long id, Permissao p) {
        return null;
    }

}
