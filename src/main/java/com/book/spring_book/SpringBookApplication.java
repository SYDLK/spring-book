package com.book.spring_book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // created_at, updated_at
@SpringBootApplication
public class SpringBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookApplication.class, args);
	}

}
