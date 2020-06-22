package com.fimeco.documents;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="preguntas")
public class Pregunta {

	@Id
	private String id;
	
	@NotEmpty
	private String pregunta;

	public Pregunta(String id, @NotEmpty String pregunta) {
		this.id = id;
		this.pregunta = pregunta;
	}
	
	public Pregunta(@NotEmpty String pregunta) {
		this.pregunta = pregunta;
	}

	public Pregunta() {
	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	
	
	
	
}
