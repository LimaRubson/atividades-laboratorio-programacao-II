package com.controleAcademico.controller;

/*
   *A classe aluno possui os atributos: id (int), nome (String), data de nascimento (java.util.Date), per�odo (int), 
    nome de usu�rio (String) e senha (String).  
*/

public class Aluno {
	
	private int id;
	private String nome;
	private java.util.Date DataNascimento;
	private int periodo;
	private String nomeUsuario;
	private String senha;
	
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
	public java.util.Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(java.util.Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
