package lala;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("CPF: ");
		String cpf = sc.nextLine();
		
		System.out.println("Tipo do Logradouro: ");
		String tipoLogradouro = sc.nextLine();
		System.out.println("Nome do Logradouro: ");
		String nomeLogradouro = sc.nextLine();
		System.out.println("Complemento: ");
		String complemento = sc.nextLine();		
		System.out.println("Apartamento: ");
		int apartamento = sc.nextInt();
		System.out.println("Numero do Logradouro: ");
		int numeroLogradouro = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Cargo do Funcionario: ");
		String cargo = sc.nextLine();
		System.out.println("Salario do Funcionario: ");
		double salario = sc.nextDouble();
		System.out.println("Quantidade de dependentes: ");
		int qntDep = sc.nextInt();
		sc.nextLine();
		
		Endereco e1 =  new Endereco(tipoLogradouro,nomeLogradouro,numeroLogradouro,complemento,apartamento);
		Pessoa p1 = new Pessoa(nome,cpf,e1);
		Funcionario f1 = new Funcionario(cargo,salario,qntDep,p1);
	
		System.out.println("Nome: ");
		String nome2 = sc.nextLine();
		System.out.println("CPF: ");
		String cpf2 = sc.nextLine();
		
		System.out.println("Tipo do Logradouro: ");
		String tipoLogradouro2 = sc.nextLine();
		System.out.println("Nome do Logradouro: ");
		String nomeLogradouro2 = sc.nextLine();
		System.out.println("Complemento: ");
		String complemento2 = sc.nextLine();	
		System.out.println("Numero do Logradouro: ");
		int numeroLogradouro2 = sc.nextInt();
		System.out.println("Apartamento: ");
		int apartamento2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Cargo do Funcionario: ");
		String cargo2 = sc.nextLine();
		System.out.println("Salario do Funcionario: ");
		double salario2 = sc.nextDouble();
		System.out.println("Quantidade de Dependentes: ");
		int qntDep2 = sc.nextInt();
		
		sc.close();
		
		Endereco e2 =  new Endereco(tipoLogradouro2,nomeLogradouro2,numeroLogradouro2,complemento2,apartamento2);
		Pessoa p2 = new Pessoa(nome2,cpf2,e2);
		Funcionario f2 = new Funcionario(cargo2,salario2,qntDep2,p2);
		f1.exibirDados();
		System.out.println();
		f2.exibirDados();
		
	}
}
