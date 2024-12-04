package com.bibliotecasystem.biblioteca;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // Configura o perfil para o ambiente de teste
class BibliotecaApplicationTests {

	@Test
	void contextLoads() {
	}

}
