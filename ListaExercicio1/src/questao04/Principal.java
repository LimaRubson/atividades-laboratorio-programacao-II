package questao04;


/*
 	* Escreva um programa que lê uma String e imprime a String na
tela substituindo cada vogal encontrada por N vogais iguais,
onde N representa o número de vogais encontradas até então.
Para os demais caracteres, o programa deve imprimir apenas o próprio caractere. Exemplo: 

	Entrada (Texto lido): apenas um exemplo!
	Saída (Impressão): apeenaaas uuuum eeeeexeeeeeemplooooooo!

*/

import java.util.Scanner;

public class Principal {
	
	private static String resultado = "";
    private static int indice;
    private static int cont = 0;
    
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entrada (Texto lido): ");
		String string1 = scan.nextLine();
		
		for(indice = 0; indice < string1.length(); indice++) {
			if(string1.charAt(indice) == 'a' || string1.charAt(indice) == 'A') {
				cont++;
				for(int x = 0; x < cont-1; x++) {
					resultado += string1.charAt(indice);
				}
			}
			if(string1.charAt(indice) == 'e' || string1.charAt(indice) == 'E') {
				cont++;
				for(int y = 0; y < cont-1; y++) {
					resultado += string1.charAt(indice);
				}
			}
			if(string1.charAt(indice) == 'i' || string1.charAt(indice) == 'I') {
				cont++;
				for(int z = 0; z < cont-1; z++) {
					resultado += string1.charAt(indice);
				}
			}
			if(string1.charAt(indice) == 'o' || string1.charAt(indice) == 'O') {
				cont++;
				for(int j = 0; j < cont-1; j++) {
					resultado += string1.charAt(indice);
				}
			}
			if(string1.charAt(indice) == 'u' || string1.charAt(indice) == 'U') {
				cont++;
				for(int h = 0; h < cont-1; h++) {
					resultado += string1.charAt(indice);
				}
			}
			if(string1.charAt(indice) != 'a' || string1.charAt(indice) != 'A' && string1.charAt(indice) != 'e' || string1.charAt(indice) != 'E' &&
					string1.charAt(indice) != 'i' || string1.charAt(indice) != 'I' && string1.charAt(indice) != 'o' || string1.charAt(indice) != 'O' &&
					string1.charAt(indice) != 'o' || string1.charAt(indice) != 'O' && string1.charAt(indice) != 'u' || string1.charAt(indice) != 'U' &&
					string1.charAt(indice) != 'u' || string1.charAt(indice) != 'U') {
				resultado += string1.charAt(indice);
			}
		}
		
		System.out.println("Saída (Impressão): " + resultado);

	}

}
