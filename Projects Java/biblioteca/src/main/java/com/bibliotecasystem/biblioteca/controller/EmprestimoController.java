package com.bibliotecasystem.biblioteca.controller;

import com.bibliotecasystem.biblioteca.model.Emprestimo;
import com.bibliotecasystem.biblioteca.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoRepository repository;

    @GetMapping
    public List<Emprestimo> listarTodosEmprestimos(){
        List<Emprestimo> emprestimos = repository.findAll();
        if (emprestimos.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nenhum empréstimo encontrado!");
        }
        return emprestimos;
    }

    @PostMapping
    public Emprestimo adicionarEmprestimo(@RequestBody Emprestimo emprestimo){
        return repository.save(emprestimo);
    }

    @PutMapping("{id}")
    public Emprestimo editarEmprestimo(@PathVariable Long id, @RequestBody Emprestimo novoEmprestimo){
        return repository.findById(id).map(emprestimo -> {
            emprestimo.setLivro(novoEmprestimo.getLivro());
            emprestimo.setUsuario(novoEmprestimo.getUsuario());
            emprestimo.setDataEmprestimo(novoEmprestimo.getDataEmprestimo());
            emprestimo.setDataDevolucao(novoEmprestimo.getDataDevolucao());
            return repository.save(emprestimo);
        }).orElseThrow(() -> new RuntimeException("Empréstimo não encontrado com o ID: "+ id));
    }

    @DeleteMapping("/{id}")
    public String deletarEmprestimo(@PathVariable Long id){
        repository.deleteById(id);
        return "Emprestimo deletado com sucesso! ID: "+id;
    }

    @GetMapping("/atrasados")
    public List<Emprestimo> listarEmprestimosAtrasados() {
        return repository.findByDataDevolucaoBeforeAndDataDevolucaoNotNull(LocalDate.now());
    }
}
