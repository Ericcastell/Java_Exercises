package heranca2;

public class ProfessorDE extends Pessoa {
	private String mat;
	private float salario;
	
	ProfessorDE(String mat, float salario, String nome, String endereco){
		super(nome,endereco);
		this.mat = mat;
		this.salario = salario;
	}
	public void exibirProfDE(){
		exibirPessoa();
		System.out.println("Matricula: " + mat);
		System.out.println("Salario: " + salario); 
	}
}
