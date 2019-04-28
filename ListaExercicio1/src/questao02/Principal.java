package questao02;

/*
	*Colocar estas duas linhas iniciais no m�todo Main():
	
	Random rnd = new Random(); //Inicia Aleat�rio
	
	int x = rnd.nextInt(100); //Gera um n�mero aleat�rio (0 � 99)
	
	1. Fa�a um la�o de repeti��o que solicite ao usu�rio digitar um n�mero;
	
	2. O la�o encerra quando o usu�rio acertar o n�mero;
	
	3. Se o n�mero do usu�rio for menor que o oculto, escrever: �MAIOR�, se o n�mero do usu�rio for maior que o oculto,
	escrever: �MENOR�. 
*/

import java.util.Random;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Random rnd = new Random(); //Inicia Aleat�rio
		int x = rnd.nextInt(100); //Gera um n�mero aleat�rio (0 - 99)
		int number;
		
		do {
			System.out.println("Digite um n�mero: ");
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
