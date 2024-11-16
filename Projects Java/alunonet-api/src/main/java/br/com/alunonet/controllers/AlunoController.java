package br.com.alunonet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.alunonet.Dao.AlunoDao;
import br.com.alunonet.model.Aluno;


@Controller
public class AlunoController {
	@Autowired
	private AlunoDao alunorepositorio;
	
	@GetMapping("/inserirAlunos")
	public ModelAndView InsertAluno(Aluno aluno) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Alunos/formAluno");
		mv.addObject("aluno", new Aluno());
		return mv;
	}
	
	@PostMapping("InsertAlunos")
	public ModelAndView inserirAluno(Aluno aluno) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/Aluno/listAlunos");
		alunorepositorio.save(aluno);
		return mv;
	}
	
	
}
