package questao01;

/*
   * Informar todos os números de 1000 a 1999 que quando
divididos por 11 obtemos resto = 5. 
*/

public class Principal {
	
	private static int numero;
	private static int indice;

	public static void main(String[] args) {
		
		for(indice = 1000; indice <= 1999; indice++) {
			if(indice % 11 == 5) {
				numero = indice;
				System.out.println(numero);
			}
		}

	}

}
