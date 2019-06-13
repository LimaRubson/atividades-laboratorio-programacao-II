package questao01;

public class Utilitarios {

	
	public void duplica(Repositorio A, Repositorio B) {
		B.guarda(A.primeiro());
		
		while(A.proximo() != null) {
			B.guarda(A.proximo());
		}
	}
	
	public void diferenca(Repositorio A, Repositorio B, Repositorio C) {
		if(A.primeiro().getCpf() != B.primeiro().getCpf()) {
			C.guarda(A.primeiro());
		}
		
		while(A.proximo().getCpf() != B.proximo().getCpf()) {
			C.guarda(A.proximo());
		}
	}
}
