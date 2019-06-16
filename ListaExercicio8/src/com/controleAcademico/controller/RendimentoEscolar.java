package com.controleAcademico.controller;

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
	public void setTrabalhos(String[] trabalhos) {
		this.trabalhos = trabalhos;
	}
	public int[] getNotasTrabalhos() {
		return notasTrabalhos;
	}
	public void setNotasTrabalhos(int[] notasTrabalhos) {
		this.notasTrabalhos = notasTrabalhos;
	}

}
