package br.com.tech4me.tech4classe.shared;

import java.util.List;

public record ClasseCompletaDTO(
    String id,
    String nome,
    String descricao,
    List<String> habilidades
) {}