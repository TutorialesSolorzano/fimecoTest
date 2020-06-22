package com.fimeco.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fimeco.documents.Pregunta;
import com.fimeco.repositories.PreguntaRepository;
import com.fimeco.services.PreguntaService;

import reactor.core.publisher.Mono;

@Service
public class PreguntaServiceImpl implements PreguntaService {

	@Autowired
	private PreguntaRepository preguntaRepository;

	@Override
	public Mono<Pregunta> findPregunta() {
		return preguntaRepository.findAll().next();
	}

	@Override
	public Mono<Pregunta> save(Pregunta p) {
		return preguntaRepository.save(p);
	}

}
