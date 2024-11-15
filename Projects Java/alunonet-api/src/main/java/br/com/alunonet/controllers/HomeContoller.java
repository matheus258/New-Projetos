package br.com.alunonet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeContoller {
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/index");
		mv.addObject("msg", "Bem vindo ao nosso site!");
		return mv;
	}
	
	@GetMapping("/cadastrar")
	public ModelAndView contatos() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/cadastrar");
		mv.addObject("msg", "Bem vindo a pagina de cadstros!");
		return mv;
	}

}
