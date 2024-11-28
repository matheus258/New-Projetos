package com.gourmet.gourmetfood.di.notificacao;

import com.gourmet.gourmetfood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}