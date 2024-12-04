package com.bibliotecasystem.biblioteca;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		// Carregar o arquivo .env
		Dotenv dotenv = Dotenv.load();
		SpringApplication.run(BibliotecaApplication.class, args);
	}
}