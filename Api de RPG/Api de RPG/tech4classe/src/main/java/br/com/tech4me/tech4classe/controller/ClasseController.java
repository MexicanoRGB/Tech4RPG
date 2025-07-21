package br.com.tech4me.tech4classe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.tech4classe.model.Classe;
import br.com.tech4me.tech4classe.service.ClasseService;

@RestController
@RequestMapping("/classes")
public class ClasseController {

    @Autowired
    private ClasseService servico;

    @GetMapping
    public List<Classe> obterTodas() {
        return servico.obterTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Classe> obterPorId(@PathVariable String id) {
        Classe classe = servico.obterPorId(id);
        return classe != null ? ResponseEntity.ok(classe) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Classe> cadastrar(@RequestBody Classe classe) {
        return ResponseEntity.status(201).body(servico.cadastrar(classe));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Classe> atualizar(@PathVariable String id, @RequestBody Classe classe) {
        Classe atualizada = servico.atualizar(id, classe);
        return atualizada != null ? ResponseEntity.ok(atualizada) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable String id) {
        servico.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
