package com.fimeco.services;

import com.fimeco.documents.Pregunta;

import reactor.core.publisher.Mono;

public interface PreguntaService {

	Mono<Pregunta> findPregunta();
	
	Mono<Pregunta> save(Pregunta p);
}
