import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Cpf: ");
		String cpf = sc.nextLine();
		System.out.println("Telefone: ");
		String telefone = sc.nextLine();
		System.out.println("Matricula: ");
		String mat = sc.nextLine();
		System.out.println("Nota1: ");
		float nota1 = sc.nextFloat();
		System.out.println("Nota2: ");
		float nota2 = sc.nextFloat();
		System.out.println("Horas De Aula do Mestrado: ");
		int horasDeAulaMe = sc.nextInt();
		sc.nextLine();
		System.out.println("Valor Hora: ");
		int valorHora = sc.nextInt();
		System.out.println("Tema do Mestrado: ");
		sc.nextLine();
	    	String temaDoMestrado = sc.nextLine();
		
		Pessoa pessoa = new Pessoa(cpf);
		pessoa.setNome(nome);
		pessoa.setTelefone(telefone);
		pessoa.exibirPes();
		
		Aluno aluno = new Aluno(cpf, nota1, nota2, mat);
		aluno.setNome(nome);
		aluno.setTelefone(telefone);
		aluno.calcMedia();
		aluno.exibirAluno();
		
		Professor professor = new Professor(cpf, horasDeAulaMe, valorHora);
		professor.setNome(nome);
		professor.setTelefone(telefone);
		professor.calcularSalario();
		professor.exibirProf();		
		
		ProfessorMestre professorMestre = new ProfessorMestre(cpf, horasDeAulaMe, valorHora, temaDoMestrado);
		professorMestre.setNome(nome);
		professorMestre.setTelefone(telefone);
		professorMestre.exibirProfMestre();

		sc.close();
	}
}
