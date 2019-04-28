package questao02;

public class ContaCorrente {
	
	private int numeroConta; //Não pode receber um valor menor ou igual a zero;
	private String correntista; //Não pode receber um valor nulo ou string vazia;
	private float saldo; //Não pode manter um valor menor quezero;
	
	public ContaCorrente(int numeroConta, String correntista) {
		super();
		this.numeroConta = numeroConta;
		this.correntista = correntista;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public float getSaldo() {
		return saldo;
	}
	
	public boolean deposita(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean saque(double valor) {
		if(valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, ContaCorrente conta) {
		if(valor > 0 && conta != null) {
			if(valor <= this.saldo) {
				this.saque(valor);
				conta.deposita(valor);
				return true;
			}
		}
		return false;
	}
	
	public void imprime(int numeroConta) {
		if(numeroConta == this.getNumeroConta()) {
			System.out.println("Digite o nome: " + this.getCorrentista());
			System.out.println("Digite o cpf: " + this.getNumeroConta());
			System.out.println("Digite o valor: " + this.getSaldo());
		}
	}

}
