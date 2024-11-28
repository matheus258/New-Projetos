package com.gourmet.gourmetfood.di.notificacao;

import com.gourmet.gourmetfood.di.modelo.Cliente;

public class NotificadorSms implements Notificador{
    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorSms(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
        System.out.println("Notificador SMS");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if(this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificando %s através do numero %s usando SMTP %s : %s\n",
                cliente.getNome(), cliente.getTelefone(),this.hostServidorSmtp, mensagem);
    }
    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

}
