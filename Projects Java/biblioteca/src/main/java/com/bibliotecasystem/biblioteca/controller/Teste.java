package com.bibliotecasystem.biblioteca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/teste")
public class Teste {
    @GetMapping("/mensagem")
    public String exibirMensagem() {
        System.out.println("A API está funcionando corretamente!");
        return "Teste bem-sucedido! Verifique o console para mais detalhes.";
    }
}
