package com.controleAcademico.model;

import com.controleAcademico.controller.RendimentoEscolar;

public interface RepositorioRendimentoEscolar {
	
	public void inserir(RendimentoEscolar rendimento);
	public void remover(String nomeRendimento);
	public RendimentoEscolar procurar(String nomeRendimento);
	public void atualizar(RendimentoEscolar rendimento);

}
