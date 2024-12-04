package com.forumproject.forum.controller;


import com.forumproject.forum.model.Curso;
import com.forumproject.forum.model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {
    @RequestMapping("/topicos")
    @ResponseBody
    public List<TopicoDto> lista(){
        Topico topico = new Topico("Dúvida", "Dúvida com JavaScript",new Curso("Javascript", "Programação"));
        Topico topico1 = new Topico("Sugestao", "Melhorar Qualdiade do video de spring",new Curso("Java", "Programação"));
        return Arrays.asList(topico, topico1, topico);
    }
}
