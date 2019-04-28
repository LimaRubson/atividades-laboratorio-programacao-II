package questao03;

/*
 	*Escreva um programa que recebe duas Strings s1 e s2, e gera
uma terceira String s3 que é a mistura de s1 e s2 do seguinte
modo:

	O 1º caractere de s3 é o 1º caractere de s1
	O 2º caractere de s3 é o 1º caractere de s2
	O 3º caractere de s3 é o 2º caractere de  s1
	E assim sucessivamente

 OBS: As Strings s1 e s2 podem ter tamanhos diferentes, por exemplo:
	s1 = “abcde”
	s2 = “012”
	String resultante (s3) = “a0b1c2de”

*/

import java.util.Scanner;

public class Principal {
	
	private static int indice1, indice2;
	private static String stringResultante = "";
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1º Entrada: ");
		String string1 = scan.nextLine();
		
		System.out.println("2º Entrada: ");
		String string2 = scan.nextLine();
		
	
		for(indice1 = 0; indice1 < (string1.length() + string2.length()); indice1++) {
			
			if(string2.length() <= string1.length()) {
				
				if (indice1 < string2.length()) {
					stringResultante = stringResultante + string1.charAt(indice1) + string2.charAt(indice1);
				} else if(indice1 < string1.length()) {
					stringResultante = stringResultante + string1.charAt(indice1);
				}
				
			}	
			
			if(string1.length() <= string2.length()) {
				
				if (indice1 < string1.length()) {
					stringResultante = stringResultante + string1.charAt(indice1) + string2.charAt(indice1);
				} else if(indice1 < string2.length()) {
					stringResultante = stringResultante + string2.charAt(indice1);
				}
				
			}
			
		}
		
		System.out.println("String resultante: " + stringResultante);
		
	}
}
