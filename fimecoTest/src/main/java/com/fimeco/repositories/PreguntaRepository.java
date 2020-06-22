package com.fimeco.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.fimeco.documents.Pregunta;

@Repository
public interface PreguntaRepository extends ReactiveMongoRepository<Pregunta, String> {

}
