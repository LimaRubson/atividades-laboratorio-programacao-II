package questao03;

import java.util.Scanner;

public class AplicacaoDVD {

	public static void main(String[] args) {
		
		DVD dvd1 = new DVD();
		
		Scanner scan = new Scanner(System.in);

		int opcao = 0;
		do {
			System.out.println("\n\n###     SISDVD - Sistema de DVD   ###");
			System.out.println("\n=======================================");
			System.out.println(" |     1 - Liga                          |");
			System.out.println(" |     2 - Desliga                       |");
			System.out.println(" |     3 - Play                          |");
			System.out.println(" |     4 - Stop                          |");
			System.out.println(" |     5 - Pause                         |");
			System.out.println(" |     6 - Volta                         |");
			System.out.println(" |     7 - Avan�a                        |");
			System.out.println(" |     0 - Sair                          |");
			System.out.println(" =======================================\n");
			System.out.println("Digite uma op��o: ");
			opcao = scan.nextInt();
			System.out.print("\n");
			switch (opcao) {
			case 1:
				dvd1.ligar();
				System.out.println("Estado: " + dvd1.isEstado());
				System.out.println("Opera��o em execu��o: " + dvd1.getOperacaoEmExecucao());
				break;
			case 2:
				dvd1.desliga();
				System.out.println("Estado: " + dvd1.isEstado());
				System.out.println("Opera��o em execu��o: " + dvd1.getOperacaoEmExecucao());
				break;
			case 3:
				dvd1.play();
				System.out.println("Estado: " + dvd1.isEstado());
				System.out.println("Opera��o em execu��o: " + dvd1.getOperacaoEmExecucao());
				break;
			case 4:
				dvd1.stop();
				System.out.println("Estado: " + dvd1.isEstado());
				System.out.println("Opera��o em execu��o: " + dvd1.getOperacaoEmExecucao());
				break;
			case 5:
				dvd1.pause();
				System.out.println("Estado: " + dvd1.isEstado());
				System.out.println("Opera��o em execu��o: " + dvd1.getOperacaoEmExecucao());
				break;
			case 6:
				dvd1.volta();
				System.out.println("Estado: " + dvd1.isEstado());
				System.out.println("Opera��o em execu��o: " + dvd1.getOperacaoEmExecucao());
				break;
			case 7:
				dvd1.avanca();
				System.out.println("Estado: " + dvd1.isEstado());
				System.out.println("Opera��o em execu��o: " + dvd1.getOperacaoEmExecucao());
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
