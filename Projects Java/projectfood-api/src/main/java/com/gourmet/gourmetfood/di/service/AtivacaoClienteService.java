package com.gourmet.gourmetfood.di.service;

import com.gourmet.gourmetfood.di.modelo.Cliente;
import com.gourmet.gourmetfood.di.notificacao.NotificadorEmail;

public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
