package com.bibliotecasystem.biblioteca.controller;

import com.bibliotecasystem.biblioteca.model.Livro;
import com.bibliotecasystem.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroRepository repository;

    @GetMapping
    public List<Livro> listarTodos(){
        List<Livro> livros = repository.findAll();
        if(livros.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nenhum livro foi encontrado!");
        }
        return livros;
    }
    @GetMapping("/{id}")
    public Livro listarPorId(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    @PostMapping
    public Livro adicionarLivro(@RequestBody Livro livro){
        return repository.save(livro);
    }

    @PutMapping("/{id}")
    public Livro atualizarLivro(@PathVariable Long id, @RequestBody Livro livroAtualizado){
        return repository.findById(id).map(livro -> {
            livro.setTitulo(livroAtualizado.getTitulo());
            livro.setAutor(livroAtualizado.getAutor());
            livro.setIsbn(livroAtualizado.getIsbn());
            livro.setAnoPublicado(livroAtualizado.getAnoPublicado());
            return  repository.save(livro);
        }).orElseThrow(() -> new RuntimeException("Livro não encontrado com o ID: " + id));
    }

    @DeleteMapping("/{id}")
    public String deletarLivro(@PathVariable Long id){
        repository.deleteById(id);
        return "Livro deletado com sucesso! ID: "+ id;
    }

}
