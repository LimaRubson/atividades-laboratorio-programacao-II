package com.controleAcademico.controller;

import java.util.Date;

/*
   *A classe aluno possui os atributos: id (int), nome (String), data de nascimento (java.util.Date), período (int), 
    nome de usuário (String) e senha (String).  
*/

public class Aluno {
	
	private int id;
	private String nome;
	private Date dataNascimento;
	private int periodo;
	private String nomeUsuario;
	private String senha;
	
	public Aluno(int date) {
		this.dataNascimento = new Date(date);
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
	public Date getDataNascimento() {
		return this.dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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
