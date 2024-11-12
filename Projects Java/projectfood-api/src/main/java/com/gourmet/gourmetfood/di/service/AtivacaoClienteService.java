package com.gourmet.gourmetfood.di.service;

import org.springframework.stereotype.Component;

import com.gourmet.gourmetfood.di.modelo.Cliente;
import com.gourmet.gourmetfood.di.notificacao.Notificaor;

@Component
public class AtivacaoClienteService {
	
	private Notificaor notificador;
	
	
	
	public AtivacaoClienteService(Notificaor notificador) {
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService: "+ notificador);
	}


	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
