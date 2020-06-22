package com.fimeco.documents;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="respuestas")
public class Respuesta {

	@Id
	private String id;
	
	@NotEmpty
	private String respuesta;
	
	@Valid
	private Pregunta pregunta;

	public Respuesta(@NotEmpty String respuesta, @Valid Pregunta pregunta) {
		super();
		this.respuesta = respuesta;
		this.pregunta = pregunta;
	}

	public Respuesta() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}
	
	
	
	
}
