package questao01;

import java.util.Scanner;

public class AplicacaoDisciplina {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o código do Departamento: ");
		int codigoDepartamento = scan.nextInt();
		
		System.out.println("Digite o nome do Departamento: ");
		String nomeDepartamento = scan.next();
		
		System.out.println("Digite o dia: ");
		int dia = scan.nextInt();
		
		System.out.println("Digite o m�s: ");
		int mes = scan.nextInt();
		
		System.out.println("Digite o ano: ");
		int ano = scan.nextInt();
		
		System.out.println("Digite o c�digo do professor: ");
		int codigoProfessor = scan.nextInt();
		
		System.out.println("Digite o nome do professor: ");
		String nomeProfessor = scan.next();
		
		System.out.println("Digite o nome da disciplina: ");
		String nomeDisciplina = scan.next();
		
		System.out.println("Digite o curso da disciplina: ");
		String curso = scan.next();
		
		System.out.println("Digite a quantidade da disciplina: ");
		int quantidadeAlunos = scan.nextInt();
		
		Departamento departamento = new Departamento(codigoDepartamento, nomeDepartamento);
		Data dataAdmissao = new Data(dia, mes, ano);
		Professor professor = new Professor(codigoProfessor, nomeProfessor, dataAdmissao, departamento);
		Disciplina disciplina = new Disciplina(nomeDisciplina, curso, professor, quantidadeAlunos);
		

		int opcao = 0;
		do {
			System.out.println("\n\n###                      SISEDU - Sistema Educacional                  ###");
			System.out.println("\n ===========================================================================");
			System.out.println("                  |     1 - Alterar os dados gerais da disciplina            |");
			System.out.println("                  |     2 - Alterar o professor da disciplina                |");
			System.out.println("                  |     3 - Imprimir os dados da disciplina                  |");
			System.out.println("                  |     0 - Sair                                             |");
			System.out.println(" ===========================================================================\n");
			System.out.println("Digite uma op��o: ");
			opcao = scan.nextInt();
			System.out.print("\n");
			switch (opcao) {
			case 1:
				
				alteraDadosGerais(disciplina);
				
				break;
			case 2:
				
				alteraProfessor(disciplina);
				
				break;
			case 3:
				
				imprime(disciplina);
				
				break;
			case 0:
				break;
			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
		} while (opcao != 0);
		
		
	}
	
	static void alteraDadosGerais(Disciplina d) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da disciplina: ");
		String nomeDisciplina = scan.nextLine();
		
		d.setNome(nomeDisciplina);
		
		System.out.println("Digite o curso da disciplina: ");
		String curso = scan.nextLine();
		
		d.setCurso(curso);
		
		System.out.println("Digite a quantidade da disciplina: ");
		int quantidadeAlunos = scan.nextInt();
		
		d.setQuantidadeAlunos(quantidadeAlunos);
	
	}
	
	static void alteraProfessor(Disciplina d) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o c�digo do professor: ");
		int codigoProfessor = scan.nextInt();
		
		d.getProfessor().setCodigo(codigoProfessor);
		
		System.out.println("Digite o nome do professor: ");
		String nomeProfessor = scan.nextLine();
		
		d.getProfessor().setNome(nomeProfessor);
	}
	
	static void imprime(Disciplina d) {
		
		System.out.println("Nome da disciplina: " + d.getNome());
		System.out.println("Curso: " + d.getCurso());
		System.out.println("C�digo do professor da disciplina: " + d.getProfessor().getCodigo());
		System.out.println("Nome do professor da disciplina: " + d.getProfessor().getNome());
		System.out.println("Data de Admiss�o: " + "Dia: " + d.getProfessor().getDataAdmissao().getDia() + " M�s: " + d.getProfessor().getDataAdmissao().getMes() + " Ano: " + d.getProfessor().getDataAdmissao().getAno());
		System.out.println("C�digo do departamento: " + d.getProfessor().getDepartamento().getCodigo());
		System.out.println("Nome do departamento: " + d.getProfessor().getDepartamento().getNome());
		System.out.println("Quantidade de estudantes na disciplina: " + d.getQuantidadeAlunos());
		
	}

}
