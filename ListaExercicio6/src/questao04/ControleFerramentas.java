package questao04;

public class ControleFerramentas {
	
	Ferramentas animais = new RepositorioFerramentas();
	
	public void filtrar(Animal[] completo, String especieFiltrar) {
		animais.filtraEspecie(completo, especieFiltrar);
	}
	
	public void classificacao(Animal[] completo) {
		animais.classificaEspecies(completo);
	}
	
	public void contabilizar(Animal[] A, Ferramentas B) {
		B = animais;
		int count = 0;
		Resultado[] resultado = new Resultado[A.length];
		for(int x = 0; x < animais.classificaEspecies(A).length; x++) {
			animais.filtraEspecie(A, animais.classificaEspecies(A)[x]);
			resultado[count] = new Resultado(animais.classificaEspecies(A)[x], animais.classificaEspecies(A)[x].length());
			count++;
		}
	}
}
