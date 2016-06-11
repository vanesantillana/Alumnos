package com.example.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Matricula {

	@Id
	@SequenceGenerator(name = "Matricula_ID_GENERATOR", sequenceName = "Matricula_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Matricula_ID_GENERATOR")
	
	private String codigo;
	private String id_alumno;
	private String id_curso;
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAlumno() {
		return id_alumno;
	}

	public void setAlumno(String id_alumno) {
		this.id_alumno = id_alumno;
	}
	
	public String getCurso() {
		return id_curso;
	}

	public void setCurso(String id_curso) {
		this.id_curso = id_curso;
	}
}
