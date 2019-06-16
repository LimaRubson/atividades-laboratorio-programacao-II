package com.controleAcademico.controller;

import com.controleAcademico.model.RepositorioTurma;
import com.controleAcademico.model.RepositorioTurmaArray;
import com.controleAcademico.util.TurmaInexistenteException;

public class ControleTurmas {

	RepositorioTurma turmas = new RepositorioTurmaArray();

	public void cadastrar(Turma turma) {
		this.turmas.inserir(turma);
	}

	public void remover (int idTurma) {
		this.turmas.remover(idTurma);
	}

	public Turma procurar(int idTurma) throws TurmaInexistenteException {
		if(this.turmas.procurar(idTurma) != null) {
			return this.turmas.procurar(idTurma);	
		} else {
			TurmaInexistenteException e;
			e = new TurmaInexistenteException(idTurma);
			throw e;
		}
	}

	public void atualizar(Turma turma) {
		this.turmas.atualizar(turma);
	}

}
