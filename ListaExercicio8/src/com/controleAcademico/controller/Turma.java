package com.controleAcademico.controller;

/*
   * A classe turma possui os atributos id (int), disciplina (Disciplina), professor (Professor) e
	capacidade da turma 
*/

public class Turma {
	
	private int id;
	private Disciplina disciplina;
	private Professor professor;
	private int CapacidadeTurma;
	
	public Turma() {
		
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
		CapacidadeTurma = capacidadeTurma;
	}

	@Override
	public String toString() {
		return "Turma [id=" + id + ", disciplina=" + disciplina + ", professor=" + professor + ", CapacidadeTurma="
				+ CapacidadeTurma + "]";
	}
	

}
