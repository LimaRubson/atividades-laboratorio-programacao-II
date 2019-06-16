package com.controleAcademico.util;

public class DisciplinaInexistenteException extends Exception {
	
	private String nomeDisciplina;
	
	public DisciplinaInexistenteException(String nomeDisciplina) {
		super("Disciplina inexistente!");
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

}
