package com.controleAcademico.controller;

import java.util.Arrays;

/*
 
    *A classe rendimento escolar possui os atributos turma (Turma), aluno (Aluno), nota 1a prova (int), nota 2a prova (int), trabalhos (array de String
     com 4 posições) e notas dos trabalhos (array de int com 4 posições).
 
*/

public class RendimentoEscolar {
	
	private Turma turma;
	private Aluno aluno;
	private int notaVA1;
	private int notaVA2;
	private String[] trabalhos;
	private int[] notasTrabalhos;
	private int indiceTrabalhos, indiceNotas;	
	
	public RendimentoEscolar() {
		this.trabalhos = new String[4];
		this.notasTrabalhos = new int[4];
		this.indiceTrabalhos = 0;
		this.indiceNotas = 0;
	}
	
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public int getNotaVA1() {
		return notaVA1;
	}
	public void setNotaVA1(int notaVA1) {
		this.notaVA1 = notaVA1;
	}
	public int getNotaVA2() {
		return notaVA2;
	}
	public void setNotaVA2(int notaVA2) {
		this.notaVA2 = notaVA2;
	}
	public String[] getTrabalhos() {
		return trabalhos;
	}
	public void setTrabalhos(String trabalhos) {
		this.trabalhos[this.indiceTrabalhos] = trabalhos;
		this.indiceTrabalhos++;
	}
	public int[] getNotasTrabalhos() {
		return notasTrabalhos;
	}
	public void setNotasTrabalhos(int notasTrabalhos) {
		this.notasTrabalhos[this.indiceNotas] = notasTrabalhos;
		this.indiceNotas++;
	}

	@Override
	public String toString() {
		return "RendimentoEscolar [turma=" + turma + ", aluno=" + aluno + ", notaVA1=" + notaVA1 + ", notaVA2="
				+ notaVA2 + ", trabalhos=" + Arrays.toString(trabalhos) + ", notasTrabalhos="
				+ Arrays.toString(notasTrabalhos) + ", indiceTrabalhos=" + indiceTrabalhos + ", indiceNotas="
				+ indiceNotas + "]";
	}

}
