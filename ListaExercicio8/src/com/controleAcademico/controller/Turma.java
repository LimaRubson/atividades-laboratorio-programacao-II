package com.controleAcademico.controller;

import java.util.Arrays;

/*
   * A classe turma possui os atributos id (int), disciplina (Disciplina), professor (Professor) e
	capacidade da turma 
*/

public class Turma {
	
	private int id;
	private Disciplina disciplina;
	private Professor professor;
	private int CapacidadeTurma;
	private Aluno[] aluno;
	private int indice;
	
	public Turma() {
		this.indice = 0;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public int getCapacidadeTurma() {
		return CapacidadeTurma;
	}
	
	public void setCapacidadeTurma(int capacidadeTurma) {
		this.CapacidadeTurma = capacidadeTurma;
		this.aluno = new Aluno[capacidadeTurma];
	}
	
	public Aluno getAluno(int idAluno) {
		for(int i = 0; i < this.indice; i++) {
			if(this.aluno[i].getId() == idAluno) {
				return this.aluno[i];
			}
		}
		return null;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno[this.indice] = aluno;
		this.indice++;
	}
	
	public String alunosTurma() {
		Aluno[] alunoAtivo = new Aluno[this.indice];
		for(int i = 0; i < this.indice; i++) {
			if(this.aluno[i] != null) {
				alunoAtivo[i] = this.aluno[i];
				return alunoAtivo[i].toString();
			}
		}
		return null;
	}

	@Override
	public String toString() {
		String dados;
		Aluno[] alunoAtivo = new Aluno[this.indice];
		
		dados = "Turma [id=" + id + ", disciplina=" + disciplina + ", professor=" + professor + ", CapacidadeTurma="
				+ CapacidadeTurma + "Alunos: ";
		
		for(int i = 0; i < this.indice; i++) {
			if(this.aluno[i] != null) {
				alunoAtivo[i] = this.aluno[i];
				dados += alunoAtivo[i].toString() + ", ";
			}
		}
		
		dados += "]";
		
		return dados;
	}
	

}
