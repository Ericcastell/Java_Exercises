public class MainClass {
	public static void main(String[] args){
		
		/* Condicionais:
		 * 
		 * Condicional Simples:
		 * 
		 * Forma geral:
		 * 
		 * 1) if (condicao)
		 *     comando;
		 *     
		 * 2) if(condicao){
		 * comando1;
		 * comando2;
		 * ...
		 * comandoN;
		 * }
		 * 
		 * Condicional Composta:
		 * 
		 * Forma Geral:
		 * 
		 * 1) if (condicao)
		 * comando1;
		 * else
		 * comando2;
		 * 
		 * 2) if (condicao){
		 * comando1;
		 * comando2;
		 * ...
		 * comandoN;
		 * }
		 * else
		 * comandoZ;
		 * 
		 * 3) if (condicao)
		 * comando1;
		 * else{
		 * comando2;
		 * comando3;
		 * ...
		 * comandoN;
		 * }
		 * 
		 * 4) if (condicao){
		 * comando1;
		 * comando2;
		 * ...
		 * comandoN;
		 * }
		 * else{
		 * comandoP;
		 * comandoQ;
		 * comandoZ;
		 * }
		 * 
		 * Aritm�ticos:
		 *"+"
		 *"-"
		 *"*"
		 *"/"
		 *"%"
		 *
		 *Relacionais:
		 *"=="
		 *">"
		 *">="
		 *"<"
		 *"<="
		 *"!="
		 *
		 *Logicos:
		 *&& -> e (and)
		 *|| -> ou (or)
		 *! -> Nao (not)
		 */
		
		/*Ex.1(06/05/2022):
		 * Fa�a um programa que receba como argumentos o sal�rio de uma pessoa, calcule e exiba o valor do desconto do imposto de renda.
		 * O desconto do imposto de renda � calculado da seguinte forma:
		 * Sal�rio < R$2000,00, o desconto do imposto de renda � 0
		 * Se o sal�rio for >= R$2000,00 e < R$4000,00, desconto de 7,5% do sal�rio
		 * Sal�rio for >= R$4000,00 e < R$7000,00, o desconto � de 15% do sal�rio.
		 * Sal�rio for >= R$7000,00, descconto ser� de 27,5% do sal�rio. */
		
		double salario = Double.parseDouble(args[0]);
		System.out.print(salario);
		if (salario < 2000)
			System.out.println("O Desconto do salario foi de R$0");
		else if (salario < 4000)
			System.out.println("O desconto do salario foi de R$"  +  (salario * 0.075));
		else if (salario >= 4000 && salario <= 7000)
			System.out.println("O desconto do salario foi de R$" + (salario * 0.15));
		else if (salario >= 7000)
			System.out.println("O desconto do salario foi de R$" + (salario * 0.275));
		}
	}




