package questao01;

public class Pessoa {
	
	private String cpf;
	private String nome;
	private int tipoCadeira;
	public Pessoa(String cpf, String nome, int tipoCadeira) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.tipoCadeira = tipoCadeira;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTipoCadeira() {
		return this.tipoCadeira;
	}
	
	
}
