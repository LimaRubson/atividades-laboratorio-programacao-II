package com.controleAcademico.controller;

import com.controleAcademico.model.RepositorioProfessor;
import com.controleAcademico.model.RepositorioProfessorArray;
import com.controleAcademico.util.ProfessorInexistenteException;

public class ControleProfessores {

	RepositorioProfessor professores = new RepositorioProfessorArray();

	public void cadastrar(Professor professor) {
		this.professores.inserir(professor);
	}

	public void remover (String nomeProfessor) {
		this.professores.remover(nomeProfessor);
	}

	public Professor procurar(String nomeProfessor) throws ProfessorInexistenteException {
		if(this.professores.procurar(nomeProfessor) != null) {
			return this.professores.procurar(nomeProfessor);	
		} else {
			ProfessorInexistenteException e;
			e = new ProfessorInexistenteException(nomeProfessor);
			
			throw e;
		}
	}

	public void atualizar(Professor professor) {
		this.professores.atualizar(professor);
	}

}
