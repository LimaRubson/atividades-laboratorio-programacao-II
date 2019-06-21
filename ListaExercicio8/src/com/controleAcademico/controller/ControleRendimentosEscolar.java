package com.controleAcademico.controller;

import com.controleAcademico.model.RepositorioRendimentoEscolar;
import com.controleAcademico.model.RepositorioRendimentoEscolarArray;
import com.controleAcademico.util.RendimentoEscolarInexistenteException;

public class ControleRendimentosEscolar {
	
	RepositorioRendimentoEscolar rendimentos = new RepositorioRendimentoEscolarArray();
	
	
	public void cadastrar(RendimentoEscolar rendimento) {
		this.rendimentos.inserir(rendimento);
	}

	public void remover (String nomeRendimento) {
		this.rendimentos.remover(nomeRendimento);
	}

	public RendimentoEscolar procurar(int idAluno) throws RendimentoEscolarInexistenteException {
		if(this.rendimentos.procurar(idAluno) != null) {
			return this.rendimentos.procurar(idAluno);	
		} else {
			RendimentoEscolarInexistenteException e;
			e = new RendimentoEscolarInexistenteException(idAluno);
			
			throw e;
		}
	}

	public void atualizar(RendimentoEscolar rendimento) {
		this.rendimentos.atualizar(rendimento);
	}

}
