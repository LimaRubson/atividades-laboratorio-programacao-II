package questao06;

/*
   *Escreva um programa que leia o nome completo de uma
pessoa e o imprima na tela obedecendo ao seguinte formato
(exemplo): 

	 Entrada: Maria José da Silva
	 Saída: Silva, M. J. D
*/

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	
	private static String[] nomeSeparado;
	private static String nome = "";
	private static String resultado = "";
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entrada: ");
		String string1 = scan.nextLine();
		
		nome = string1.toUpperCase();
		
		nomeSeparado = nome.split(" ");
		
		resultado += nomeSeparado[nomeSeparado.length - 1] + ", ";
		
		for(int x = 0; x < nomeSeparado.length - 1; x++) {
			resultado += nomeSeparado[x].charAt(0) + ". ";
		}
		
		System.out.println("Saída: " + resultado);
	}

}
