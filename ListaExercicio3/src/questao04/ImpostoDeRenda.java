package questao04;

public class ImpostoDeRenda {
	private String nomeContribuinte; //Não pode receber um valor nulo ou string vazia
	private String cpf; //Não pode receber um valor nulo ou string vazia
	private float rendaAnual; //Não pode receber um valor menor ou igual a zero
	private Deducao[] deducoes; //Não pode manter um array nulo
	private int indice;
	public ImpostoDeRenda(String nomeContribuinte, String cpf, float rendaAnual) {
		super();
		this.nomeContribuinte = nomeContribuinte;
		this.cpf = cpf;
		this.rendaAnual = rendaAnual;
		this.deducoes = new Deducao[3];
	}
	public String getNomeContribuinte() {
		return nomeContribuinte;
	}
	public void setNomeContribuinte(String nomeContribuinte) {
		this.nomeContribuinte = nomeContribuinte;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(float rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	public Deducao[] getDeducoes() {
		return deducoes;
	}
	
	public boolean inserirDeducao(Deducao deducao) {
		
		for(this.indice = 1; this.indice < this.getDeducoes().length; this.indice++) {
			if(this.deducoes[this.indice] == null && deducao != null) {
				this.deducoes[this.indice] = deducao;
				return true;
			}
		}
		
		return false;
	}
	
	private float soma(Deducao[] deducao) {
		float soma = 0;
		if(deducao != null)  {
			for(this.indice = 1; this.indice < deducao.length; this.indice++) {
				if(deducao[this.indice] != null) {
					soma += deducao[this.indice].getValor();
				}
			}
		}
		return soma;
	}
	
	public double calculaImposto(Deducao[] deducao) {
		double impostoRenda = 0;
		if(this.getRendaAnual() >= 0 && this.getRendaAnual() <= 13968) {
			impostoRenda = this.getRendaAnual() - this.soma(deducao) * 0; 
		} else if(this.getRendaAnual() >= 13968.01 && this.getRendaAnual() <= 27912) {
			impostoRenda = this.getRendaAnual() - this.soma(deducao) * 0.15;
		} else if(this.getRendaAnual() > 27912) {
			impostoRenda = this.getRendaAnual() - this.soma(deducao) * 0.275;
		}
		
		return impostoRenda;
	}
	
	public void imprimeDeducoes() {
		if(this.getDeducoes() != null)  {
			for(this.indice = 1; this.indice < this.getDeducoes().length; this.indice++) {
				if(this.getDeducoes()[this.indice] != null) {
					System.out.println("Descrição: " + this.getDeducoes()[this.indice].getDescricao());
					System.out.println("Valor: " + this.getDeducoes()[this.indice].getValor());
					System.out.println("Tamanho: " + this.indice);
				}
			}
		}
	}
}
