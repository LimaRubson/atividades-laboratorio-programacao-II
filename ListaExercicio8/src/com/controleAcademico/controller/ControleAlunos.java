package com.controleAcademico.controller;

import com.controleAcademico.model.RepositorioAluno;
import com.controleAcademico.model.RepositorioAlunoArray;
import com.controleAcademico.util.AlunoInexistenteException;

public class ControleAlunos {

	RepositorioAluno alunos = new RepositorioAlunoArray();

	public void cadastrar(Aluno aluno) {
		this.alunos.inserir(aluno);
	}

	public void remover (String nomeAluno) {
		this.alunos.remover(nomeAluno);
	}

	public Aluno procurar(String nomeAluno) throws AlunoInexistenteException {
		if(this.alunos.procurar(nomeAluno) != null) {
			return this.alunos.procurar(nomeAluno);	
		} else {
			AlunoInexistenteException e;
			e = new AlunoInexistenteException(nomeAluno);

			throw e;
		}
	}

	public void atualizar(Aluno aluno) {
		this.alunos.atualizar(aluno);
	}

}
