package br.com.fiap.springpfauthentication.resources;

import br.com.fiap.springpfauthentication.repository.PermissaoRepository;
import java.util.List;
import br.com.fiap.springpfauthentication.entity.Permissao;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/permissao")
public class PermissaoResource {

    private PermissaoRepository repo;

    @GetMapping
    public List<Permissao> findAll() {
        return null;
    }

    @GetMapping(value="/{id}")
    public Permissao findById(Long id) {
        return null;
    }

    @Transactional
    @PostMapping
    public Permissao save(Permissao permissao) {
        return null;
    }

}
