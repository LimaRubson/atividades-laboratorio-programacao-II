package com.controleAcademico.model;

import com.controleAcademico.controller.Aluno;

public interface RepositorioAluno {
	
	public void inserir(Aluno aluno);
	public void remover(String nomeAluno);
	public Aluno procurar(String nomeAluno);
	public void atualizar(Aluno aluno);

}
