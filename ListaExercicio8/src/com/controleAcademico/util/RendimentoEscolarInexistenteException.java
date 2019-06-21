package com.controleAcademico.util;

public class RendimentoEscolarInexistenteException extends Exception {
	
	private int idAluno;
	
	public RendimentoEscolarInexistenteException(int idAluno) {
		super("Rendimento Escolar Inexistente!");
		this.idAluno = idAluno;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

}
