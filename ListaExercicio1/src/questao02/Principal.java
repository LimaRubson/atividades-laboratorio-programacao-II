package questao02;

/*
	*Colocar estas duas linhas iniciais no método Main():
	
	Random rnd = new Random(); //Inicia Aleatório
	
	int x = rnd.nextInt(100); //Gera um número aleatório (0 – 99)
	
	1. Faça um laço de repetição que solicite ao usuário digitar um número;
	
	2. O laço encerra quando o usuário acertar o número;
	
	3. Se o número do usuário for menor que o oculto, escrever: “MAIOR”, se o número do usuário for maior que o oculto,
	escrever: “MENOR”. 
*/

import java.util.Random;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Random rnd = new Random(); //Inicia Aleatório
		int x = rnd.nextInt(100); //Gera um número aleatório (0 - 99)
		int number;
		
		do {
			System.out.println("Digite um número: ");
			number = scan.nextInt();
			
			if(number < x) {
				System.out.println("MAIOR");
			}
			
			if(number > x) {
				System.out.println("MENOR");
			}
			
		} while(number != x);

	}

}
