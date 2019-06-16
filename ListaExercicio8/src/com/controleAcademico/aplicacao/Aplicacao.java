package com.controleAcademico.aplicacao;

import java.util.Date;

import com.controleAcademico.controller.Aluno;
import com.controleAcademico.controller.Disciplina;
import com.controleAcademico.controller.Fachada;
import com.controleAcademico.controller.Professor;
import com.controleAcademico.controller.Turma;
import com.controleAcademico.util.DisciplinaInexistenteException;
import com.controleAcademico.util.TurmaInexistenteException;

public class Aplicacao {

	public static void main(String[] args) {
		
		Disciplina disciplina1 = new Disciplina();
		Disciplina disciplina2 = new Disciplina();
		Disciplina disciplina3 = new Disciplina();
		
		Professor professor1 = new Professor(10/07/1989);
		Professor professor2 = new Professor(9/12/1984);
		
		Aluno aluno1 = new Aluno(02/04/1990);
		Aluno aluno2 = new Aluno(03/07/1997);
		
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();
		Turma turma3 = new Turma();
		Turma turma4 = new Turma();
		Turma turma5 = new Turma();
		Turma turma6 = new Turma();
		Turma turma7 = new Turma();
		
		disciplina1.setId(0);
		disciplina1.setNome("Pensamento Computacional");
		disciplina1.setEmenta("Conceitos. Elementos do PC. Escopo e Natureza do PC. Aplicação Teórica. Aplicação Prática.");
		
		disciplina2.setId(1);
		disciplina2.setNome("Matemática Discreta");
		disciplina2.setEmenta("Métodos de Prova.");
		
		disciplina3.setId(2);
		disciplina3.setNome("Laboratório de Programação I");
		disciplina3.setEmenta("Conceitos da Linguagem de Programção Python. Lista de exercícios.");
		
		professor1.setId(0);
		professor1.setNome("Taciana Pontual");
		professor1.setCargo("Coordenadora");
		professor1.setNomeUsuario("Taciana");
		professor1.setSenha("12345");
		
		professor2.setId(1);
		professor2.setNome("Felipe Carvalho");
		professor2.setCargo("Professor");
		professor2.setNomeUsuario("Felipe");
		professor2.setSenha("14236");
		
		turma1.setId(0);
		turma1.setDisciplina(disciplina1);
		turma1.setProfessor(professor1);
		turma1.setCapacidadeTurma(30);
		
		turma2.setId(1);
		turma2.setDisciplina(disciplina2);
		turma2.setProfessor(professor1);
		turma2.setCapacidadeTurma(50);
		
		turma3.setId(2);
		turma3.setDisciplina(disciplina3);
		turma3.setProfessor(professor1);
		turma3.setCapacidadeTurma(49);
		
		turma4.setId(3);
		turma4.setDisciplina(disciplina1);
		turma4.setProfessor(professor2);
		turma4.setCapacidadeTurma(42);
		
		turma5.setId(4);
		turma5.setDisciplina(disciplina2);
		turma5.setProfessor(professor2);
		turma5.setCapacidadeTurma(50);
		
		turma6.setId(5);
		turma6.setDisciplina(disciplina3);
		turma6.setProfessor(professor2);
		turma6.setCapacidadeTurma(35);
		
		Fachada.getInstance().cadastrarDisciplina(disciplina1);
		Fachada.getInstance().cadastrarDisciplina(disciplina2);
		Fachada.getInstance().cadastrarDisciplina(disciplina3);
		
		Fachada.getInstance().cadastrarProfessor(professor1);
		
		Fachada.getInstance().cadastrarTurma(turma1);
		Fachada.getInstance().cadastrarTurma(turma2);
		Fachada.getInstance().cadastrarTurma(turma3);
		Fachada.getInstance().cadastrarTurma(turma4);
		Fachada.getInstance().cadastrarTurma(turma5);
		Fachada.getInstance().cadastrarTurma(turma6);
		Fachada.getInstance().cadastrarTurma(turma7); //Turma Inexistente
		
		try {
			System.out.println(Fachada.getInstance().procurarDisciplina("Pensamento Computacional"));
		} catch (DisciplinaInexistenteException e) {
			System.out.println("Disciplina inexistente!");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(Fachada.getInstance().procurarDisciplina("Matemática Discreta"));
		} catch (DisciplinaInexistenteException e) {
			System.out.println("Disciplina inexistente!");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(Fachada.getInstance().procurarDisciplina("Laboratório de Programação I"));
		} catch (DisciplinaInexistenteException e) {
			System.out.println("Disciplina inexistente!");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(Fachada.getInstance().procurarTurma(0));
		} catch (TurmaInexistenteException e) {
			System.out.println("Turma inexistente!");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(Fachada.getInstance().procurarTurma(1));
		} catch (TurmaInexistenteException e) {
			System.out.println("Turma Inexistente!");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(Fachada.getInstance().procurarTurma(2));
		} catch (TurmaInexistenteException e) {
			System.out.println("Turma Inexistente!");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(Fachada.getInstance().procurarTurma(3));
		} catch (TurmaInexistenteException e) {
			System.out.println("Turma Inexistente!");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(Fachada.getInstance().procurarTurma(4));
		} catch (TurmaInexistenteException e) {
			System.out.println("Turma Inexistente!");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(Fachada.getInstance().procurarTurma(5));
		} catch (TurmaInexistenteException e) {
			System.out.println("Turma Inexistente!");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(Fachada.getInstance().procurarTurma(6));
		} catch (TurmaInexistenteException e) {
			System.out.println("Turma Inexistente!");
			//e.printStackTrace();
		}
		
	}

}
