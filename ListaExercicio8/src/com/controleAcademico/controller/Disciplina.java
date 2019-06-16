package com.controleAcademico.controller;

/*
    *A classe disciplina possui os atributos: id (int), nome (String) e ementa (String) 
*/

public class Disciplina {
	
	private int id;
	private String nome;
	private String ementa;
	
	public Disciplina() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", nome=" + nome + ", ementa=" + ementa + "]";
	}
	
	
}
