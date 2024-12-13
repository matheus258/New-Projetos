package com.bibliotecasystem.biblioteca.dto;

import com.bibliotecasystem.biblioteca.model.Emprestimo;

import java.time.LocalDate;

public record EmprestimoResponseDTO(
        String usuarioNome,
        String livroTitulo,
        LocalDate dataEmprestimo,
        LocalDate dataDevolucao
) {
    public EmprestimoResponseDTO(Emprestimo emprestimo) {
        this(
                emprestimo.getUsuario().getNome(),
                emprestimo.getLivro().getTitulo(),
                emprestimo.getDataEmprestimo(),
                emprestimo.getDataDevolucao()
        );
    }
}