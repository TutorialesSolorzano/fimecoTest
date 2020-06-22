package com.fimeco.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fimeco.documents.Respuesta;
import com.fimeco.repositories.RespuestaRepository;
import com.fimeco.services.RespuestaService;

import reactor.core.publisher.Mono;

@Service
public class RespuestaServiceImpl implements RespuestaService {

	@Autowired
	private RespuestaRepository respuestaRepository;
	
	@Override
	public Mono<Respuesta> save(Respuesta respuesta) {
		return respuestaRepository.save(respuesta);
	}

}
