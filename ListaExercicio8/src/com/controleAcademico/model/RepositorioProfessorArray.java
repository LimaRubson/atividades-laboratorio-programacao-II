package com.controleAcademico.model;

import com.controleAcademico.controller.Professor;

public class RepositorioProfessorArray implements RepositorioProfessor {
	
	private Professor[] professores;
	private int indice;
	private final static int TAMANHO = 100;

	public RepositorioProfessorArray() {
		this.professores = new Professor[TAMANHO];
		this.indice = 0;
	}
	
	@Override
	public void inserir(Professor professor) {
		this.professores[this.indice] = professor;
		this.indice++;
	}

	@Override
	public void remover(String nomeProfessor) {
		for(int i = 0; i < this.indice; i++) {
			if(this.professores[i].getNome() == nomeProfessor) {
				this.professores[i] = null;
			}
		}
	}

	@Override
	public Professor procurar(String nomeProfessor) {
		for(int i = 0; i < this.indice; i++) {
			if(this.professores[i].getNome() == nomeProfessor) {
				return this.professores[i];
			}
		}
		return null;
	}

	@Override
	public void atualizar(Professor professor) {
		for(int i = 0; i < this.indice; i++) {
			if(this.professores[i].getNome() == professor.getNome()) {
				this.professores[i] = professor;
			}
		}
	}

}
