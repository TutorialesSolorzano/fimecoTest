package com.fimeco.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.fimeco.documents.Respuesta;

@Repository
public interface RespuestaRepository extends ReactiveMongoRepository<Respuesta, String> {

}
