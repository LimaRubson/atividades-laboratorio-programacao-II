package com.controleAcademico.controller;

import java.util.Date;

/*

   * A classe professor possui os atributos: id (int), nome (String), cargo (String), data de nascimento
   (java.util.Date), nome de usuário (String) e senha (String).
   
*/

public class Professor {
	
	private int id;
	private String nome;
	private String cargo;
	private Date dataNascimento;
	private String nomeUsuario;
	private String senha;
	
	public Professor(int date) {
		dataNascimento = new Date(date);
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
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	@Override
	public String toString() {
		return "Professor [id=" + id + ", nome=" + nome + ", cargo=" + cargo + ", dataNascimento=" + dataNascimento
				+ ", nomeUsuario=" + nomeUsuario + ", senha=" + senha + "]";
	}
	

}
