package com.controleAcademico.util;

public class AlunoInexistenteException extends Exception {
	
	private String nomeAluno;
	
	public AlunoInexistenteException(String nomeAluno) {
		super("Aluno inexistente!");
		this.nomeAluno = nomeAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	

}
