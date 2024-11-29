package com.gourmet.gourmetfood.di.notificacao;

import com.gourmet.gourmetfood.di.modelo.Cliente;
import org.springframework.stereotype.Component;


public class NotificadorSms implements Notificador{
    private boolean caixaAlta;
    private String hostServidorSms;

    public NotificadorSms(String hostServidorSmtp) {
        this.hostServidorSms = hostServidorSmtp;
        System.out.println("Notificador SMS");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if(this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificando %s através do numero %s usando SMS %s : %s\n",
                cliente.getNome(), cliente.getTelefone(),this.hostServidorSms, mensagem);
    }
    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

}
