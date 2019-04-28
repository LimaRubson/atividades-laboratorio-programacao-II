package questao01;

public class Disciplina {
	
	private String nome; //N�o pode receber um valor nulo ou string vazia
	private String curso; //N�o pode receber um valor nulo ou string vazia
	private Professor professor; //N�o pode receber um valor nulo
	private int quantidadeAlunos; //N�o pode receber um valor menor que 30
	
	public Disciplina(String nome, String curso, Professor professor, int quantidadeAlunos) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.professor = professor;
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}
	
}
