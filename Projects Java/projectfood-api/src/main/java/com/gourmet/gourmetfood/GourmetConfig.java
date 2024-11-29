package com.gourmet.gourmetfood;

import com.gourmet.gourmetfood.di.notificacao.NotificadorSms;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gourmet.gourmetfood.di.notificacao.NotificadorEmail;

@Configuration
public class GourmetConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.gourmetmail.com.br");
		notificador.setCaixaAlta(true);

		return notificador;
	}

	@Bean
	public NotificadorSms notificadorSms() {
		NotificadorSms notificador = new NotificadorSms("smtp.gourmetmail.com.br");
		notificador.setCaixaAlta(true);

		return notificador;
	}
}
