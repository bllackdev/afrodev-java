package com.afrodev.exemplospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
@RestController
public class ExemploSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploSpringApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s, Spring Boot!", name);
	}

	@GetMapping("/soma")
	public String soma(@RequestParam(value = "valor", defaultValue = "0") Double valor,
							  @RequestParam(value = "valor2", defaultValue = "0") Double valor2) {
		return String.format("Soma dos numeros: %s + %s = %s", valor, valor2, (valor + valor2));
	}

	@GetMapping("/subtracao")
	public String subtracao(@RequestParam(value = "valor", defaultValue = "0") Double valor,
					   @RequestParam(value = "valor2", defaultValue = "0") Double valor2) {
		return String.format("Soma dos numeros: %s + %s = %s", valor, valor2, (valor - valor2));
	}

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Spring Boot") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}


}
