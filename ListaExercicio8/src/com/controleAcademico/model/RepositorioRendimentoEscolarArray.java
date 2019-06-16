package com.controleAcademico.model;

import com.controleAcademico.controller.RendimentoEscolar;

public class RepositorioRendimentoEscolarArray implements RepositorioRendimentoEscolar {
	
	private RendimentoEscolar[] rendimentos;
	private int indice;
	private final static int TAMANHO = 100;
	
	public RepositorioRendimentoEscolarArray() {
		this.rendimentos = new RendimentoEscolar[TAMANHO];
		this.indice = 0;
	}

	@Override
	public void inserir(RendimentoEscolar rendimento) {
		this.rendimentos[this.indice] = rendimento;
		this.indice++;
	}

	@Override
	public void remover(String nomeRendimento) {
		for(int i = 0; i < this.indice; i++) {
			if(this.rendimentos[i].getAluno().getNome() == nomeRendimento) {
				this.rendimentos[i] = null;
			}
		}
		
	}

	@Override
	public RendimentoEscolar procurar(String nomeRendimento) {
		for(int i = 0; i < this.indice; i++) {
			if(this.rendimentos[i].getAluno().getNome() == nomeRendimento) {
				return this.rendimentos[i];
			}
		}
		return null;
	}

	@Override
	public void atualizar(RendimentoEscolar rendimento) {
		for(int i = 0; i < this.indice; i++) {
			if(this.rendimentos[i].getAluno().getNome() == rendimento.getAluno().getNomeUsuario()) {
				this.rendimentos[i] = rendimento;
			}
		}
	}

}
