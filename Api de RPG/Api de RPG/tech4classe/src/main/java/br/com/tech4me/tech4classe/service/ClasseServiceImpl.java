package br.com.tech4me.tech4classe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.tech4classe.model.Classe;
import br.com.tech4me.tech4classe.repository.ClasseRepository;

@Service
public class ClasseServiceImpl implements ClasseService {

    @Autowired
    private ClasseRepository repository;

    @Override
    public List<Classe> obterTodas() {
        return repository.findAll();
    }

    @Override
    public Classe obterPorId(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Classe cadastrar(Classe classe) {
        return repository.save(classe);
    }

    @Override
    public Classe atualizar(String id, Classe classe) {
        Classe existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setNome(classe.getNome());
            existente.setDescricao(classe.getDescricao());
            existente.setHabilidades(classe.getHabilidades());
            return repository.save(existente);
        }
        return null;
    }

    @Override
    public void excluir(String id) {
        repository.deleteById(id);
    }
}
