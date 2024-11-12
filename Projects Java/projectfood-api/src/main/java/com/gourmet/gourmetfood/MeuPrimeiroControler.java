package com.gourmet.gourmetfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gourmet.gourmetfood.di.modelo.Cliente;
import com.gourmet.gourmetfood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroControler {
	private AtivacaoClienteService ativacaoClienteService;
	
	
	public MeuPrimeiroControler(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}


	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("João", "joao@winxs.com", "8897556611");
		ativacaoClienteService.ativar(joao);
		
		return "Hello";
	}

}
