package com.controleAcademico.model;

import com.controleAcademico.controller.Disciplina;

public class RepositorioDisciplinaArray implements RepositorioDisciplina {

	private Disciplina[] disciplinas;
	private int indice;
	private final static int TAMANHO = 100;
	
	public RepositorioDisciplinaArray() {
		this.disciplinas = new Disciplina[TAMANHO];
		this.indice = 0;
	}
	
	@Override
	public void inserir(Disciplina disciplina) {
		this.disciplinas[this.indice] = disciplina;
		this.indice = this.indice + 1;
	}

	@Override
	public void remover(String nomeDisciplina) {
		for(int i = 0; i < this.indice; i++) {
			if(this.disciplinas[i].getNome() == nomeDisciplina) {
				this.disciplinas[i] = null;
			}
		}
		
	}

	@Override
	public Disciplina procurar(String nomeDisciplina) {
		for(int i = 0; i < this.indice; i++) {
			if(this.disciplinas[i].getNome() == nomeDisciplina) {
				return this.disciplinas[i];
			}
		}
		return null;
	}

	@Override
	public void atualizar(Disciplina disciplina) {
		for(int i = 0; i < this.indice; i++) {
			if(this.disciplinas[i].getNome() == disciplina.getNome()) {
				this.disciplinas[i] = disciplina;
			}
		}
		
	}

}
