package com.bibliotecasystem.biblioteca.model;

import com.bibliotecasystem.biblioteca.dto.LivroResponseDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private String isbn;
    private Integer anoPublicado;

    public Livro() {
    }

    public Livro(@Valid LivroResponseDTO body) {
        this.titulo = body.titulo();
        this.autor = body.autor();
        this.isbn = body.isbn();
        this.anoPublicado = body.anoPublicado();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(Integer anoPublicado) {
        this.anoPublicado = anoPublicado;
    }
}
