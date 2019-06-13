package questao01;

/*
  *  O código abaixo lança uma exceção (propositalmente) e
	interrompe sua exceção. Utilizando o tratamento de exceções, corrija a
	classe com o objetivo de não parar sua execução.

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
			System.out.println("Exceção ao acessar um índice do vetor que não existe");
		}
		System.out.println("fim do metodo2");
	}

}
