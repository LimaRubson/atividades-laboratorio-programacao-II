package com.controleAcademico.model;

import com.controleAcademico.controller.Professor;

public interface RepositorioProfessor {
	
	public void inserir(Professor professor);
	public void remover(String nomeProfessor);
	public Professor procurar(String nomeProfessor);
	public void atualizar(Professor professor);
	
}
