package br.com.tech4me.tech4classe.service;

import java.util.List;

import br.com.tech4me.tech4classe.model.Classe;

public interface ClasseService {
    List<Classe> obterTodas();
    Classe obterPorId(String id);
    Classe cadastrar(Classe classe);
    Classe atualizar(String id, Classe classe);
    void excluir(String id);
}
