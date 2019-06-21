package com.controleAcademico.controller;

import com.controleAcademico.util.AlunoInexistenteException;
import com.controleAcademico.util.DisciplinaInexistenteException;
import com.controleAcademico.util.ProfessorInexistenteException;
import com.controleAcademico.util.RendimentoEscolarInexistenteException;
import com.controleAcademico.util.TurmaInexistenteException;

public class Fachada {
	
	private ControleAlunos alunos;
	private ControleDisciplinas disciplinas;
	private ControleProfessores professores;
	private ControleRendimentosEscolar rendimentos;
	private ControleTurmas turmas;
	private static Fachada instance;
	
	public Fachada() {
		this.alunos = new ControleAlunos();
		this.disciplinas = new ControleDisciplinas();
		this.professores = new ControleProfessores();
		this.rendimentos = new ControleRendimentosEscolar();
		this.turmas = new ControleTurmas();
	}
	
	public static Fachada getInstance() {
		if(Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	
	public void cadastrarAluno(Aluno aluno) {
		this.alunos.cadastrar(aluno);
	}
	
	public void removerAluno(String nomeAluno) {
		this.alunos.remover(nomeAluno);
	}
	
	public Aluno procurarAluno(String nomeAluno) throws AlunoInexistenteException {
		return this.alunos.procurar(nomeAluno);	
	}
	
	public void atualizarAluno(Aluno aluno) {
		this.alunos.atualizar(aluno);
	}
	
	public void cadastrarDisciplina(Disciplina disciplina) {
		this.disciplinas.cadastrar(disciplina);
	}
	
	public void removerDisciplina(String nomeDisciplina) {
		this.disciplinas.remover(nomeDisciplina);
	}
	
	public Disciplina procurarDisciplina(String nomeDisciplina) throws DisciplinaInexistenteException {
		if(this.disciplinas.procurar(nomeDisciplina) != null) {
			return this.disciplinas.procurar(nomeDisciplina);	
		}
		return null;
	}
	
	public void atualizarDisciplina(Disciplina disciplina) {
		this.disciplinas.atualizar(disciplina);
	}
	
	public void cadastrarProfessor(Professor professor) {
		this.professores.cadastrar(professor);
	}

	public void removerProfessor(String nomeProfessor) {
		this.professores.remover(nomeProfessor);
	}

	public Professor procurarProfessor(String nomeProfessor) throws ProfessorInexistenteException {
		return this.professores.procurar(nomeProfessor);	
	}

	public void atualizarProfessor(Professor professor) {
		this.professores.atualizar(professor);
	}
	
	public void cadastrarRendimento(RendimentoEscolar rendimento) {
		this.rendimentos.cadastrar(rendimento);
	}

	public void removerRendimento(String nomeRendimento) {
		this.rendimentos.remover(nomeRendimento);
	}

	public RendimentoEscolar procurarRendimento(int idAluno) throws RendimentoEscolarInexistenteException {
		return this.rendimentos.procurar(idAluno);	
	}

	public void atualizarRendimento(RendimentoEscolar rendimento) {
		this.rendimentos.atualizar(rendimento);
	}
	
	public void cadastrarTurma(Turma turma) {
		this.turmas.cadastrar(turma);
	}

	public void removerTurma(int idTurma) {
		this.turmas.remover(idTurma);
	}

	public Turma procurarTurma(int idTurma) throws TurmaInexistenteException {
		return this.turmas.procurar(idTurma);	
	}

	public void atualizarTurma(Turma turma) {
		this.turmas.atualizar(turma);
	}

}
