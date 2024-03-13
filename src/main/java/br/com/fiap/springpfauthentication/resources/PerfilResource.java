package br.com.fiap.springpfauthentication.resources;

import br.com.fiap.springpfauthentication.repository.PermissaoRepository;
import br.com.fiap.springpfauthentication.repository.PerfilRepository;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import br.com.fiap.springpfauthentication.entity.Perfil;
import br.com.fiap.springpfauthentication.entity.Permissao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/perfil")
public class PerfilResource {
    @Autowired
    private PermissaoRepository permissaoRepository;
    @Autowired
    private PerfilRepository repo;

    @GetMapping
    public List<Perfil> findAll() {
        return repo.findAll();
    }

    @GetMapping(value="/{id}")
    public Perfil findById(@PathVariable Long id) {
        return repo.findById( id ).orElseThrow();
    }

    @GetMapping(value="/{id}/permissoes")
    public Set<Permissao> findPermissoesByIdPerfil(@PathVariable Long id) {
        Perfil perfil = repo.findById(id).orElseThrow();

        return perfil.getPermissoes();
    }


    @Transactional
    @PostMapping
    public Perfil save(@RequestBody Perfil perfil) {
        return repo.save( perfil );
    }

    @Transactional
    @PostMapping(value="/{id}/permissoes")
    public Perfil save(@PathVariable Long id, @RequestBody Permissao p) {
        Perfil perfil = repo.findById(id).orElseThrow();

        if(Objects.isNull(p)) return null;

        if(Objects.nonNull(p.getId())){
            Permissao permissao = permissaoRepository.findById(p.getId()).orElseThrow();
            perfil.getPermissoes().add(permissao);
            return perfil;
        }

        perfil.getPermissoes().add(p);

        return perfil;
    }



}
