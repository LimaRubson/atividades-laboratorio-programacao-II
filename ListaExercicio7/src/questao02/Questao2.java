package questao02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		try {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Eu sei dividir");
			System.out.println("Informe o primeiro valor: ");
			int x = teclado.nextInt();
			System.out.println("Informe o segundo valor: ");
			int y = teclado.nextInt();
			double r = (x/y);
			System.out.println("O resultado da soma � " + r);	
		} catch(InputMismatchException exception) {
			System.out.println("N�o aceitamos caracteres ou strings!");
		}
	}

}
