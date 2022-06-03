import java.util.Scanner;
	
public class Javajava{
	public static void main (String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int num1 = ent.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = ent.nextInt();
		
		Aoaoaoa2 dois = new Aoaoaoa2(num1, num2);
		int soma = dois.somar();
		System.out.println("Soma dos numeros é: " + soma);
		int produto = dois.multiplicar();
		System.out.println("Produto dos numeros é" + produto);
		int sub = dois.subtrair();
		System.out.println("Subtração dos numeros é" + sub);
		float div = dois.dividir();
		System.out.println("Divisão dos numeros é" + div);
		int maior = dois.descobrirMaior();
		System.out.println("O maior numero é" + maior);
		ent.close();
	}
	
}
