package com.remedios.marques.FamaciaApi.remedio;

import com.remedios.marques.FamaciaApi.Enum.Remedio.Via;

public record DadosCadastroRemedio(
		String nome, 
		Via via, String lote, 
		String quantidade, 
		String validade,
		Laboratorio laboratorio) {
	
	
}
