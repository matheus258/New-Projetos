package com.gourmet.gourmetfood.di.notificacao;

import org.springframework.stereotype.Component;

import com.gourmet.gourmetfood.di.modelo.Cliente;


public class NotificadorEmail implements Notificaor {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		// TODO Auto-generated constructor stub
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do e-mail %s usando SMTP %s : %s\n",
				cliente.getNome(), cliente.getEmail(),this.hostServidorSmtp, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	
}
