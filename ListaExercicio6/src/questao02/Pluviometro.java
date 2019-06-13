package questao02;

public class Pluviometro {
	
	protected String tipo;
	protected String peso;
	protected String capacidade;
	//Recebe como par�metro o tipo de equipamento.
	public Pluviometro(String tipo) {
		super();
		this.tipo = tipo;
	}
	//Retorna o tipo do pluvi�metro.
	public String getTipo() {
		return tipo;
	}
    //Retorna o peso do pluvi�metro em quilos. Este peso � calculado automaticamente pela classe a partir do tipo.
	public String getPeso() {
		return peso;
	}
	//Retorna a capacidade do pluvi�metro em mililitros. Esta capacidade � calculada automaticamente pela classe a partir do tipo.
	public String getCapacidade() {
		return capacidade;
	}

	
}
