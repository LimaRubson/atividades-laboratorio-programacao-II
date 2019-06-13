package questao04;

public class Resultado {
	private String nomeEspecie; //Nome da especie
	private int quantidade; //Quantidade de animais da especie
	public Resultado(String nomeEspecie, int quantidade) {
		super();
		this.nomeEspecie = nomeEspecie;
		this.quantidade = quantidade;
	}
	public String getNomeEspecie() {
		return nomeEspecie;
	}
	public int getQuantidade() {
		return quantidade;
	}
}
