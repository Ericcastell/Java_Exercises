package heranca;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual e o seu nome? ");
		String nome = sc.nextLine();	
		System.out.println("Qual e o seu endereco? ");
		String endereco = sc.nextLine();
		System.out.println("Qual e sua nota1? ");
		double nota1 = sc.nextDouble();
		System.out.println("Qual e sua nota2? ");
		double nota2 = sc.nextDouble();
		
		Aluno aluno = new Aluno(nome, endereco, nota1, nota2);
		aluno.calcmedia();
		aluno.exibir();
		aluno.exibirMedia();		
		sc.close();
	}
}