package br.com.cidadao.backend.controller;

import br.com.cidadao.backend.model.Problema;
import br.com.cidadao.backend.repository.ProblemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/problemas")
public class ProblemaController {

    @Autowired
    private ProblemaRepository repository;

    @GetMapping
    public List<Problema> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Problema criar(@RequestBody Problema problema) {
        return repository.save(problema);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Problema> atualizar(@PathVariable Long id, @RequestBody Problema atualizado) {
        return repository.findById(id)
            .map(problema -> {
                problema.setStatus(atualizado.getStatus());
                return ResponseEntity.ok(repository.save(problema));
            })
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProblema(@PathVariable Long id) {
    if (!repository.existsById(id)) {
        return ResponseEntity.notFound().build();
    }

    repository.deleteById(id);
    return ResponseEntity.noContent().build();
    }   
}
