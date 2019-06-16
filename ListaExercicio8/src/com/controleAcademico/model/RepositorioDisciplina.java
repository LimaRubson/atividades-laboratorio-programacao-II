package com.controleAcademico.model;

import com.controleAcademico.controller.Disciplina;

public interface RepositorioDisciplina {
	
	public void inserir(Disciplina disciplina);
	public void remover(String nomeDisciplina);
	public Disciplina procurar(String nomeDisciplina);
	public void atualizar(Disciplina disciplina);

}
