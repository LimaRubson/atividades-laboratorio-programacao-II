package questao01;

public class Data {
	
	private int dia; //Não pode receber um valor menor que 1 ou maior que 31
	private int mes; //Não pode receber um valor menor que 1 e maoir que 12
	private int ano; //Não pode receber um valor maior que 
	
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
