package com.controleAcademico.controller;

import com.controleAcademico.model.RepositorioRendimentoEscolar;
import com.controleAcademico.model.RepositorioRendimentoEscolarArray;

public class ControleRendimentosEscolar {
	
	RepositorioRendimentoEscolar rendimentos = new RepositorioRendimentoEscolarArray();
	
	
	public void cadastrar(RendimentoEscolar rendimento) {
		this.rendimentos.inserir(rendimento);
	}

	public void remover (String nomeRendimento) {
		this.rendimentos.remover(nomeRendimento);
	}

	public RendimentoEscolar procurar(String nomeRendimento) {
		if(this.rendimentos.procurar(nomeRendimento) != null) {
			return this.rendimentos.procurar(nomeRendimento);	
		}
		return null;
	}

	public void atualizar(RendimentoEscolar rendimento) {
		this.rendimentos.atualizar(rendimento);
	}

}
