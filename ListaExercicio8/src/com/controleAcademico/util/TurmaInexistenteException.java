package com.controleAcademico.util;

public class TurmaInexistenteException extends Exception {
	
	private int idTurma;
	
	public TurmaInexistenteException(int idTurma) {
		super("Turma Inexistente!");
		this.idTurma = idTurma;
	}

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

}
