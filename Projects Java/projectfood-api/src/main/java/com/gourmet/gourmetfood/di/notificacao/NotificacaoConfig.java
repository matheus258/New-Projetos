package com.gourmet.gourmetfood.di.notificacao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NotificacaoConfig {
    @Primary
    @Bean
    public NotificadorSms notificadorSms(){
        NotificadorSms notificador = new NotificadorSms("11 81142563");
        notificador.setCaixaAlta(true);

        return notificador;
    }

    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.goutmet.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }
}
