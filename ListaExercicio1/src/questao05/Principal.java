package questao05;

/*
 	* Escreva um programa que receba uma String e verifique se �
um pal�ndromo, isto �, da esquerda para direita ou da direita
para a esquerda t�m-se a mesma seq��ncia de caracteres.
Exemplos: �ama�, �ovo�, �asa�, �A DIVA EM ARGEL ALEGRA-ME
A VIDA�. 

	OBS 1: Lembre-se de eliminar os caracteres diferentes de letras
	e d�gitos para verificar se uma frase pode ser um pal�ndromo.
	
	OBS 2: Java � O m�todo boolean Character.IsLetter(char c)
	permite verificar se um caractere � uma letra.
	
	OBS 3: Java � O m�todo boolean Character.IsDigit(char c)
	permite verificar se um caractere � um d�gito. 
*/

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int y = 1; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1� Digite algo: ");
		String string = scan.nextLine();
		
		for(int x = 0; x < string.length(); x++) {
			if(string.charAt(x) == string.charAt(string.length()-y)) {
				y++;
			}
		}
		
		if((y-1) == string.length()) {
			System.out.println("� um pal�ndromo!");
		} else {
			System.out.println("N�O � um pal�ndromo!");
		}
		

	}

}
