package com.forumproject.forum;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ForumApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();
		System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));
		System.setProperty("DATABASE_USER", dotenv.get("DATABASE_USER"));
		System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
		SpringApplication.run(ForumApplication.class, args);
	}

}
