/*Faça um programa que receba como argumento de duas notas de um aluno, calcule e exiba a média, a situação do aluno e caso a média do aluno seja superior a 9.5, exiba também a mensagem de parabéns. A situação pode ser;
 * Aprovado, caso a média seja igual ou maior 6;
 * Final, caso a média seha igual ou maior a 3 e inferior a 6;
 * Reprovado, caso a média seja menor que 3;
 */

public class MainClass2 {
	
	public static void main (String [] args) {
		double nota1 = Double.parseDouble (args[0]);
		double nota2 = Double.parseDouble (args[1]);
		double media = (nota1 + nota2)/2;
		
		System.out.println("\nMedia: " + media);
		if (media >= 6) {
			System.out.println("\tAprovado!");
			if (media > 9.5)
			System.out.println("\tParabéns!");
		}
		else
			if (media >= 3)
			System.out.println("\tFinal!");
			else
			System.out.println("\tReprovado!");
		
	}
	
}
