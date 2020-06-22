package com.fimeco.services;

import com.fimeco.documents.Respuesta;

import reactor.core.publisher.Mono;

public interface RespuestaService {

	Mono<Respuesta> save(Respuesta respuesta);
}
