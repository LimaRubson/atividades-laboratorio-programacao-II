package questao02;

import java.util.Scanner;

public class Aplicacaocontas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nome1 = scan.nextLine();
		
		System.out.println("Digite o cpf: ");
		int cpf1 = scan.nextInt();
		
		ContaCorrente conta1 = new ContaCorrente(cpf1, nome1);
		
		System.out.println("Digite o nome: ");
		String nome2 = scan.next();
		
		System.out.println("Digite o cpf: ");
		int cpf2 = scan.nextInt();
		
		ContaCorrente conta2 = new ContaCorrente(cpf2, nome2);
		
		int numeroConta;
		int numeroContaOrigem, numeroContaDestino;
		float valor;
		int opcao = 0;
		do {
			System.out.println("\n\n###     SISBS - Sistema Comercial Banco Santander   ###");
			System.out.println("\n                  =======================================");
			System.out.println("                  |     1 - Imprimir dados de uma conta   |");
			System.out.println("                  |     2 - Realizar dep�sito             |");
			System.out.println("                  |     3 - Realizar saque                |");
			System.out.println("                  |     4 - Realizar transfer�ncia        |");
			System.out.println("                  |     0 - Sair                          |");
			System.out.println("                  =======================================\n");
			System.out.println("Digite uma op��o: ");
			opcao = scan.nextInt();
			System.out.print("\n");
			switch (opcao) {
			case 1:
				System.out.println("Digite o n�mero da sua conta: ");
				numeroConta = scan.nextInt();
				conta1.imprime(numeroConta);
				conta2.imprime(numeroConta);
				break;
			case 2:
				System.out.println("Digite o n�mero da sua conta: ");
				numeroConta = scan.nextInt();
				System.out.println("Valor do dep�sito: ");
				valor = scan.nextLong();
				if(conta1.getNumeroConta() == numeroConta) {
					if(conta1.deposita(valor)) {
						System.out.println("Dep�sito realizado com sucesso!");
					} else {
						System.out.println("Dep�sito n�o realizado com sucesso!");
					}
				} else if(conta2.getNumeroConta() == numeroConta) {
					if(conta2.deposita(valor)) {
						System.out.println("Dep�sito realizado com sucesso!");
					} else {
						System.out.println("Dep�sito n�o realizado com sucesso!");
					}
				}
				break;
			case 3:
				System.out.println("Digite o n�mero da sua conta: ");
				numeroConta = scan.nextInt();
				System.out.println("Valor do saque: ");
				valor = scan.nextLong();
				if(conta1.getNumeroConta() == numeroConta) {
					if(conta1.saque(valor)) {
						System.out.println("Saque realizado com sucesso!");
					} else {
						System.out.println("Saque n�o realizado com sucesso!");
					}
				} else if(conta2.getNumeroConta() == numeroConta) {
					if(conta2.saque(valor)) {
						System.out.println("Saque realizado com sucesso!");
					} else {
						System.out.println("Saque n�o realizado com sucesso!");
					}
				}
				break;
			case 4:
				System.out.println("Digite o n�mero da conta origem: ");
				numeroContaOrigem = scan.nextInt();
				System.out.println("Digite o n�mero da conta destino: ");
				numeroContaDestino = scan.nextInt();
				System.out.println("Valor da transfer�ncia: ");
				valor = scan.nextLong();
				if(conta1.getNumeroConta() == numeroContaOrigem && conta2.getNumeroConta() == numeroContaDestino) {
					if(conta1.transfere(valor, conta2)) {
						System.out.println("Transfer�ncia realizada com sucesso!");
					} else {
						System.out.println("Tranfer�ncia n�o realizada com sucesso!");
					}
				} else if(conta2.getNumeroConta() == numeroContaOrigem && conta1.getNumeroConta() == numeroContaDestino) {
					if(conta2.transfere(valor, conta1)) {
						System.out.println("Transfer�ncia realizada com sucesso!");
					} else {
						System.out.println("Transfer�ncia n�o realizada com sucesso!");
					}
				}
				break;
			case 0:
				break;
			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
		} while (opcao != 0);
	}

}
