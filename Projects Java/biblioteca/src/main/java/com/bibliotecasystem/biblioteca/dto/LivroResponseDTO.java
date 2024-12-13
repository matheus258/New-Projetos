package com.bibliotecasystem.biblioteca.dto;

import com.bibliotecasystem.biblioteca.model.Livro;

public record LivroResponseDTO(String titulo, String autor, String isbn, Integer anoPublicado) {
    public LivroResponseDTO(Livro livro) {
        this(
            livro.getTitulo(),
            livro.getAutor(),
            livro.getIsbn(),
            livro.getAnoPublicado());
    }
}
