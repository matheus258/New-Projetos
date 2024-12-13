package com.bibliotecasystem.biblioteca.controller;

import com.bibliotecasystem.biblioteca.dto.LivroResponseDTO;
import com.bibliotecasystem.biblioteca.model.Livro;
import com.bibliotecasystem.biblioteca.repository.LivroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("livros")
public class LivroController {
    @Autowired
    private LivroRepository repository;

    @GetMapping
    public ResponseEntity listarTodosLivros() {
        List<LivroResponseDTO> livros = this.repository.findAll()
                .stream()
                .map(LivroResponseDTO::new)
                .toList();

        return ResponseEntity.ok(livros);  // Retorna a lista correta de DTOs.
    }

    @GetMapping("/{id}")
    public ResponseEntity listarPorId(@PathVariable Long id){
        Livro livro = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
        return ResponseEntity.ok(livro);
    }

    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Valid LivroResponseDTO body){
        Livro newLivro = new Livro(body);

        this.repository.save(newLivro);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizarLivro(@PathVariable Long id, @RequestBody Livro livroAtualizado){
        Livro livro = repository.findById(id).orElseThrow(() ->
                new RuntimeException("Livro não encontrado com o ID: " + id));
        livro.setTitulo(livroAtualizado.getTitulo());
        livro.setAutor(livroAtualizado.getAutor());
        livro.setIsbn(livroAtualizado.getIsbn());
        livro.setAnoPublicado(livroAtualizado.getAnoPublicado());

        repository.save(livro);
        return ResponseEntity.ok(livro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarLivro(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.ok("Livro deletado com sucesso! ID: "+ id);
    }

}
