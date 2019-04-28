package questao04;

public class Deducao {
	
	private String descricao; //N�o pode receber um valor nulo ou string vazia
	private float valor; //N�o pode receber um valor menor ou igual a zero
	public Deducao(String descricao, float valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Deducao [descricao=" + descricao + ", valor=" + valor + "]";
	}
	
	
}
