/*Ex.1(06/05/2022):
* Faça um programa que receba como argumentos o salário de uma pessoa, calcule e exiba o valor do desconto do imposto de renda.
* O desconto do imposto de renda é calculado da seguinte forma:
* Salário < R$2000,00, o desconto do imposto de renda é 0
* Se o salário for >= R$2000,00 e < R$4000,00, desconto de 7,5% do salário
* Salário for >= R$4000,00 e < R$7000,00, o desconto é de 15% do salário.
* Salário for >= R$7000,00, descconto será de 27,5% do salário. */

public class MainClass {
	public static void main(String[] args){

		double salario = Double.parseDouble (args[0]);
		double ir;
		if(salario < 2000)
			ir = 0;
		else
			if(salario < 4000)
				ir = salario * 0.075;
			else
				if(salario < 7000)
					ir = salario * 0.15;
				else
					ir = salario * 0.275;
		System.out.println("\nDesconto do IR: " + ir);
		
	}

}
