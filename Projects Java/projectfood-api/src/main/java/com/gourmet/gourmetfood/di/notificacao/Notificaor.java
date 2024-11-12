package com.gourmet.gourmetfood.di.notificacao;

import com.gourmet.gourmetfood.di.modelo.Cliente;

public interface Notificaor {

	void notificar(Cliente cliente, String mensagem);

}