package lala;

public class Funcionario {
	private String cargo;
	private double salario;
	private double descontoDoIr;
	private double inss;
	private double auxilioCreche;
	private double salarioLiquido;
	private int qntDep;
	private Pessoa pessoa;
	
	Funcionario(String cargo, double salario, int qntDep, Pessoa p1){
		this.cargo = cargo;
		this.salario = salario;
		this.qntDep = qntDep;
		this.pessoa = p1;
		calcDescontoIr();
		calcDescontoInss();
		calcAuxilioCreche();
		calcLiq();
		
	}
	
	private void calcDescontoIr(){
		if (salario < 1000) {
			descontoDoIr = 0;
		}
		else if(salario < 3000){
			descontoDoIr = salario * 0.15D;
		}
		else {
			descontoDoIr = salario * 0.275;
		}
		
	}
	
	private void calcDescontoInss() {
		inss = salario * 0.11D;
		if (inss > 500) {
			inss = 500;
		}
	}
	
	private void calcAuxilioCreche() {
		auxilioCreche = qntDep * 55;
	}
	
	private void calcLiq() {
		salarioLiquido = salario - inss - descontoDoIr + auxilioCreche;
	}
	
	public void exibirDados() {
		this.pessoa.exibirDados();
		System.out.println("\n"+cargo);
		System.out.println(salario);
		System.out.println(descontoDoIr);
		System.out.println(inss);
		System.out.println(auxilioCreche);
		System.out.println(salarioLiquido);
		System.out.println(qntDep);
	}
}
	



