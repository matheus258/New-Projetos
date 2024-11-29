package com.gourmet.gourmetfood.di.notificacao;

import com.gourmet.gourmetfood.di.modelo.Cliente;
import org.springframework.stereotype.Component;


public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		// TODO Auto-generated constructor stub
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("Notificador Email");
	
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
