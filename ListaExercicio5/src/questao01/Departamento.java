package questao01;

public class Departamento {
	
	private int codigo; //Não pode receber um valor menor ou igual a zero
	private String nome; //Não pode receber um valor nulo ou string vazia
	
	public Departamento(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
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
	
}
