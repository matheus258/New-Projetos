package com.bibliotecasystem.biblioteca.controller;

import com.bibliotecasystem.biblioteca.model.Usuario;
import com.bibliotecasystem.biblioteca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> listarTodos(){
        List<Usuario> usuarios = repository.findAll();
        if (usuarios.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nenhum usuário encontrado!");
        }
        return usuarios;
    }

    @GetMapping("/{id}")
    public Usuario listarPorId(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado, com o ID: "+ id));
    }

    @PostMapping
    public Usuario adicionarUsuario(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario editarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioEditado){
        return repository.findById(id).map(usuario -> {
            usuario.setNome(usuarioEditado.getNome());
            usuario.setEmail(usuarioEditado.getEmail());
            usuario.setTelefone(usuarioEditado.getTelefone());
            return repository.save(usuario);
        }).orElseThrow(() -> new RuntimeException("Usuário não encontrado, com o ID: "+ id));
    }

    @DeleteMapping("/{id}")
    public String deletarUsuario(@PathVariable Long id){
        repository.deleteById(id);
        return "Usuário deletado com sucesso! ID: "+ id;
    }
}
