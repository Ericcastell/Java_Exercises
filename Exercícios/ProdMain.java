public class Produto {
    private String nome;
    private int estq;
    private float und;
    
    Produto(String n, int q, float f){
    	nome = n;
    	estq = q;
    	und = f;
    }
    Produto(){
    	
    }
    
	public float calcProd(){
	    return this.estq*this.und;
	}

	public void console(float valor){
	    System.out.println("Nome do prod: " + this.nome);
	    System.out.println("Quantidade de estoque: " + this.estq);
	    System.out.println("Valor da unidade: " + this.und);
	}

	public void setNome(String a) {
		this.nome=a;
	}
	public void setQtd(int a) {
		this.estq=a;
	}
	public void setPreco(float a) {
		this.und=a;
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getQtd() {
		return this.estq;
	}
	public float getPreco() {
		return this.und;
	}
}
	
// Main:

import java.util.Scanner;
public class Principal {
	public void main (String[]args){
	    Scanner sc = new Scanner(System.in);
	    String nome;
	    System.out.println("Entre com o nome do produto: ");
	    nome = sc.next();
	    System.out.println("Entre com a quantidade de estoque: ");
	    int estq = sc.nextInt();
	    System.out.println("Entre com o preço da unidade dos produtos: ");
	    float und = sc.nextFloat();
	
	    Produto prod = new Produto(nome,estq,und);
	    
	    float valor = prod.calcProd();
	    prod.console(valor);
	
	    System.out.printf("Testando com getter e setter\n\n");
		
		Produto x = new Produto();
		
		x.setNome(nome);
		x.setQtd(estq);
		x.setPreco(und);
		
		x.console(valor);
	    sc.close();
	}
}
