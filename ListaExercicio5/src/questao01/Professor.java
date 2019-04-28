package questao01;

public class Professor {
	
	private int codigo; //Não pode receber um valor menor ou igual a zero
	private String nome; //Não pode receber um valor nulo ou string vazia
	private Data dataAdmissao; //Não pode receber um valor nulo
	private Departamento departamento; //Não pode receber um valor nulo 
	
	public Professor(int codigo, String nome, Data dataAdmissao, Departamento departamento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.departamento = departamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Data dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
