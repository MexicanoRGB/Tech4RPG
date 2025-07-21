package br.com.tech4me.tech4classe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.tech4classe.model.Classe;

public interface ClasseRepository extends MongoRepository<Classe, String> {
}
