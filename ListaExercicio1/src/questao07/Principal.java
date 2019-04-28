package questao07;


/*
   *Escreva um programa que compacte uma String lida segundo o
seguinte algoritmo:

	a. Se houver 4 ou mais caracteres repetidos em seq��ncia, o
	programa dever� imprimir o caractere �@� seguido do
	n�mero de caracteres repetidos e do caractere repetido;
	
	b. Se n�o houver mais do que tr�s repeti��es, o pr�prio
	caractere dever� ser impresso tantas vezes quanto ele
	apareceu;  
	
	Exemplo: 
	  
	  Entrada de dados: abccccdeeeee
	  Sa�da de dados: ab@4cd@5e
*/

import java.util.Scanner;

public class Principal {
	
	private static int indice = 0;
	private static String resultado = "";
	private static char c = '0';
	private static char v = '0';
	private static int aux = 0;
	private static int cont = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entrada de dados: ");
		String string1 = scan.nextLine();
		
		while(indice < string1.length()) {
			if(string1.charAt(aux) == string1.charAt(indice) && (aux != 0 && indice != 0)) {
				if(string1.charAt(aux) != string1.charAt(aux-1)) {
					cont++;
				}
			    indice++;					
			} else {
				indice++;
			}
			
			if(indice == string1.length()) {
				v = string1.charAt(aux);
				if(4 <= cont) {
					c = string1.charAt(aux);
					resultado += "@" + Integer.toString(cont) + string1.charAt(aux);
				} 
				if(cont <= 3 && v != c) {
					resultado += string1.charAt(aux);
				}
				cont = 0;
				aux++;
				indice = 0;
			}
			
			if(aux == string1.length()) {
				break;
			}
		}
		
		System.out.println("Sa�da de dados: " + resultado);

	}

}
