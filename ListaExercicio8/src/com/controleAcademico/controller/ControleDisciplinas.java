package com.controleAcademico.controller;

import com.controleAcademico.model.RepositorioDisciplina;
import com.controleAcademico.model.RepositorioDisciplinaArray;
import com.controleAcademico.util.DisciplinaInexistenteException;

public class ControleDisciplinas {
	
	RepositorioDisciplina disciplinas = new RepositorioDisciplinaArray();
	
	public void cadastrar(Disciplina disciplina) {
		this.disciplinas.inserir(disciplina);
	}
	
	public void remover (String nomeDisciplina) {
		this.disciplinas.remover(nomeDisciplina);
	}
	
	public Disciplina procurar(String nomeDisciplina) throws DisciplinaInexistenteException {
		if(this.disciplinas.procurar(nomeDisciplina) != null) {
			return this.disciplinas.procurar(nomeDisciplina);	
		} else {
			DisciplinaInexistenteException e;
			e = new DisciplinaInexistenteException(nomeDisciplina);
			
			throw e;
		}
	}
	
	public void atualizar(Disciplina disciplina) {
		this.disciplinas.atualizar(disciplina);
	}
	
}
