package com.controleAcademico.model;

import com.controleAcademico.controller.Turma;

public interface RepositorioTurma {
	
	public void inserir(Turma turma);
	public void remover(int idTurma);
	public Turma procurar(int idTurma);
	public void atualizar(Turma turma);
	
}
