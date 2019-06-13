package questao01;

/*
  *  O c�digo abaixo lan�a uma exce��o (propositalmente) e
	interrompe sua exce��o. Utilizando o tratamento de exce��es, corrija a
	classe com o objetivo de n�o parar sua execu��o.

*/

public class TesteException {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");

	}
	static void metodo1() {
		System.out.println("inicio do metodo 1");
		metodo2();
		System.out.println("fim do metodo1");
	}
	static void metodo2() {
		System.out.println("inicio do metodo 2");
		try {
			int[] array = new int[10];
			for(int i=0; i<15; i++) {
				array[i] = i;
				System.out.println(i);
			}	
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao acessar um �ndice do vetor que n�o existe");
		}
		System.out.println("fim do metodo2");
	}

}
