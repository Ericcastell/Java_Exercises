import java.util.Scanner;
	
public class Return{
	public static void main (String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int numero1 = ent.nextInt();
		System.out.println("Digite o segundo numero: ");
		int numero2 = ent.nextInt();
		
		DoisNumerosInteirosSetGet dois = new DoisNumerosInteirosSetGet();
		dois.setNumero1(numero1);
		dois.setNumero2(numero2);
		System.out.println("Primeiro numero é:" + dois.getNumero1());
		System.out.println("Segundo numero é: " + dois.getNumero2());
		int soma = dois.somar();
		System.out.println("Soma dos numeros é: " + soma);
		int produto = dois.multiplicar();
		System.out.println("Produto dos numeros é: " + produto);
		int sub = dois.subtrair();
		System.out.println("Subtração dos numeros é: " + sub);
		float div = dois.dividir();
		System.out.println("Divisão dos numeros é: " + div);
		int maior = dois.descobrirMaior();
		System.out.println("Maior dos numeros é: " + maior);
		
		ent.close();
	}
	
}
