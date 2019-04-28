package questao05;

/*
 	* Escreva um programa que receba uma String e verifique se é
um palíndromo, isto é, da esquerda para direita ou da direita
para a esquerda têm-se a mesma seqüência de caracteres.
Exemplos: “ama”, “ovo”, “asa”, “A DIVA EM ARGEL ALEGRA-ME
A VIDA”. 

	OBS 1: Lembre-se de eliminar os caracteres diferentes de letras
	e dígitos para verificar se uma frase pode ser um palíndromo.
	
	OBS 2: Java – O método boolean Character.IsLetter(char c)
	permite verificar se um caractere é uma letra.
	
	OBS 3: Java – O método boolean Character.IsDigit(char c)
	permite verificar se um caractere é um dígito. 
*/

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int y = 1; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1º Digite algo: ");
		String string = scan.nextLine();
		
		for(int x = 0; x < string.length(); x++) {
			if(string.charAt(x) == string.charAt(string.length()-y)) {
				y++;
			}
		}
		
		if((y-1) == string.length()) {
			System.out.println("É um palíndromo!");
		} else {
			System.out.println("NÃO é um palíndromo!");
		}
		

	}

}
