package com.controleAcademico.model;

import com.controleAcademico.controller.Turma;

public class RepositorioTurmaArray implements RepositorioTurma {

	private Turma[] turmas;
	private int indice;
	private final static int TAMANHO = 100; 

	public RepositorioTurmaArray() {
		this.turmas = new Turma[TAMANHO];
		this.indice = 0;
	}

	@Override
	public void inserir(Turma turma) {
		this.turmas[this.indice] = turma;
		this.indice++;
	}

	@Override
	public void remover(int idTurma) {
		for(int i = 0; i < this.indice; i++) {
			if(this.turmas[i].getId() == idTurma) {
				this.turmas[i] = null;
			}
		}
	}

	@Override
	public Turma procurar(int idTurma) {
		for(int i = 0; i < this.indice; i++) {
			if(this.turmas[i].getId() == idTurma) {
				return this.turmas[i];
			}
		}
		return null;
	}

	@Override
	public void atualizar(Turma turma) {
		for(int i = 0; i < this.indice; i++) {
			if(this.turmas[i].getId() == turma.getId()) {
				this.turmas[i] = turma;
			}
		}
	}

}
