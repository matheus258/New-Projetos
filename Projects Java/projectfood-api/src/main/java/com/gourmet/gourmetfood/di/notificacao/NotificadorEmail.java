package com.gourmet.gourmetfood.di.notificacao;

import org.springframework.stereotype.Component;

import com.gourmet.gourmetfood.di.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificaor {
	
	public NotificadorEmail() {
		// TODO Auto-generated constructor stub
		System.out.println("NotificadorEmail");
	
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
