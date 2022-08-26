package heranca2;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - Pessoa\n2 - Prof DE\n3 - Prof H");
		int op = sc.nextInt();		
		sc.nextLine();
		if(op == 1) {
			
			String nome; nome = sc.nextLine();
			String endereco; endereco = sc.nextLine();
			Pessoa pessoa = new Pessoa(nome,endereco);
			
			pessoa.exibirPessoa();
		}
		else if(op == 2) {
			
			float sal; sal = sc.nextFloat();
			sc.nextLine();
			String nome; nome = sc.nextLine();
			String end; end = sc.nextLine();
			String mat; mat = sc.nextLine();
			
			ProfessorDE professorDE = new ProfessorDE(mat,sal,nome,end);
			
			professorDE.exibirProfDE();
		}
		else if(op == 3) {
	
			float valorHora; valorHora = sc.nextFloat();
			int qtdHora; qtdHora = sc.nextInt();
			sc.nextLine();
			String nome; nome = sc.nextLine();
			String endereco; endereco = sc.nextLine();
			String mat; mat = sc.nextLine();
			
			ProfessorHorista professorHorista = new ProfessorHorista(mat,qtdHora,valorHora,nome,endereco);
			
			professorHorista.exibirProfHorista();
		}
		
		sc.close();
	}
}
