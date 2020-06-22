package com.fimeco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fimeco.documents.Pregunta;
import com.fimeco.services.PreguntaService;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class FimecoTestApplication implements CommandLineRunner{

	@Autowired
	private PreguntaService preguntaService;
	
	public static void main(String[] args) {
		SpringApplication.run(FimecoTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Flux.just(
				new Pregunta("Que es POO?"),
				new Pregunta("Que es Herencia?"),
				new Pregunta("Que es Polimorfismo?"),
				new Pregunta("Que es Abstraccion?"),
				new Pregunta("Que es Encapsulamiento?")
				)
				.flatMap(pregunta -> {
					return preguntaService.save(pregunta);
				}).subscribe(
						pregunta -> System.out.println("Insert: " + pregunta.getPregunta()));
		
	}

}
