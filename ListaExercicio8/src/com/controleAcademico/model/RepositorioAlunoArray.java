package com.controleAcademico.model;

import com.controleAcademico.controller.Aluno;

public class RepositorioAlunoArray implements RepositorioAluno {

	private Aluno[] alunos;
	private int indice;
	private final static int TAMANHO = 100;

	public RepositorioAlunoArray() {
		this.alunos = new Aluno[TAMANHO];
		this.indice = 0;
	}

	@Override
	public void inserir(Aluno aluno) {
		this.alunos[indice] = aluno;
		this.indice++;
	}

	@Override
	public void remover(String nomeAluno) {
		for(int i = 0; i < indice; i++) {
			if(this.alunos[i].getNome() == nomeAluno) {
				this.alunos[i] = null;
			}
		}


	}

	@Override
	public Aluno procurar(String nomeAluno) {
		for(int i = 0; i < indice; i++) {
			if(this.alunos[i].getNome() == nomeAluno && this.alunos[i] != null) {
				return this.alunos[i];
			}
		}
		return null;
	}

	@Override
	public void atualizar(Aluno aluno) {
		for(int i = 0; i < indice; i++) {
			if(this.alunos[i].getNome() == aluno.getNome()) {
				this.alunos[i] = aluno;
			}
		}
	}

}
