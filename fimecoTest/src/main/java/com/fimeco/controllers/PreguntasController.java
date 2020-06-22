package com.fimeco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fimeco.documents.Pregunta;
import com.fimeco.services.PreguntaService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/preguntas")
public class PreguntasController {

	@Autowired
	private PreguntaService preguntaService;
	
	@GetMapping({ "/preguntar", "/" })
	public Mono<String> preguntar(Model model) {
		Mono<Pregunta> pregunta = preguntaService.findPregunta();

		model.addAttribute("pregunta", pregunta);
		model.addAttribute("titulo", "Preguntas & Respuestas");
		return Mono.just("preguntar");
	}
}
