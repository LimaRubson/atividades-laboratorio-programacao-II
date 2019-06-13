package questao02;

public class Pluviometro {
	
	protected String tipo;
	protected String peso;
	protected String capacidade;
	//Recebe como parâmetro o tipo de equipamento.
	public Pluviometro(String tipo) {
		super();
		this.tipo = tipo;
	}
	//Retorna o tipo do pluviômetro.
	public String getTipo() {
		return tipo;
	}
    //Retorna o peso do pluviômetro em quilos. Este peso é calculado automaticamente pela classe a partir do tipo.
	public String getPeso() {
		return peso;
	}
	//Retorna a capacidade do pluviômetro em mililitros. Esta capacidade é calculada automaticamente pela classe a partir do tipo.
	public String getCapacidade() {
		return capacidade;
	}

	
}
