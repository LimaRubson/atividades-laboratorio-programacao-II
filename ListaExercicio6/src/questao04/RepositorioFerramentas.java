package questao04;

public class RepositorioFerramentas implements Ferramentas {

	@Override
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
		Animal[] animalEspecie = new Animal[1000];
		for(int x = 0; x < completo.length; x++) {
			if(completo[x].getNomeEspecie() == especieFiltrar) {
				animalEspecie[x] = completo[x];
			}
		}
		return animalEspecie;
	}

	@Override
	public String[] classificaEspecies(Animal[] completo) {
		String[] especies = new String[1000];
		
		for(int y = 0; y < completo.length; y++) {
			for(int i = 0; i < especies.length; i++) {
				if(completo[y].getNomeEspecie() != especies[i]) {
					especies[i] = completo[y].getNomeEspecie();
				}
			}
		}
		return especies;
	}
	
}
