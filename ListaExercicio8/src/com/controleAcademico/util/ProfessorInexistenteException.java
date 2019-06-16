package com.controleAcademico.util;

public class ProfessorInexistenteException extends Exception {
	
	private String nomeProfessor;
	
	public ProfessorInexistenteException(String nomeProfessor) {
		super("Professor inexistente!");
		this.nomeProfessor = nomeProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

}
