package questao04;

import java.util.Scanner;

public class AplicacaoImpostoDeRenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ImpostoDeRenda impostoRenda;
		Deducao deducao; 
		
		System.out.println("Digite o nome: ");
		String nomeContribuinte = scan.nextLine();
		
		System.out.println("Digite o cpf: ");
		String cpf = scan.nextLine();
		
		System.out.println("Digite a renda anual: ");
		float rendaAnual = scan.nextFloat();
		
		impostoRenda = new ImpostoDeRenda(nomeContribuinte, cpf, rendaAnual);
		
		int opcao = 0;
		do {
			System.out.println("\n\n###                      SISBS - Sistema Comercial de Imposto de Renda                  ###");
			System.out.println("\n                  ===========================================================================");
			System.out.println("                  |     1 - Incluir dedu��o                                                   |");
			System.out.println("                  |     2 - Imprimir	resumo	da	dedu��o	de	imposto	de	renda             |");
			System.out.println("                  |     0 - Sair                                                              |");
			System.out.println("                  ===========================================================================\n");
			System.out.println("Digite uma op��o: ");
			opcao = scan.nextInt();
			System.out.print("\n");
			switch (opcao) {
			case 1:
				System.out.println("Digite a descri��o da dedu��o: ");
				String descricaoDeducao = scan.next();
				
				System.out.println("\nDigite o valor da dedu��o: ");
				float valorDeducao = scan.nextFloat();
				
				deducao = new Deducao(descricaoDeducao, valorDeducao);
				impostoRenda.inserirDeducao(deducao);
				
				break;
			case 2:
				System.out.println("###### Resumo ######\n");
				System.out.println("Nome do Contribuinte: " + impostoRenda.getNomeContribuinte());
				System.out.println("CPF do Contribuinte: " + impostoRenda.getCpf());
				System.out.println("Renda Anual do Contribuinte: " + impostoRenda.getRendaAnual());
				System.out.println("Imposto de Renda do Contribuinte: " + impostoRenda.calculaImposto(impostoRenda.getDeducoes()));
				System.out.println("***Dedu��es do Contribuinte***");
				impostoRenda.imprimeDeducoes();
				break;
			case 0:
				break;
			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
		} while (opcao != 0);
		
	}

}
