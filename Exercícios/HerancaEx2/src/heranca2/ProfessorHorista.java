package heranca2;

public class ProfessorHorista extends Pessoa {
	private String mat;
	private int qtdHora;
	private float valorHora;
	private float salario;
	
	ProfessorHorista(String mat, int qtdHora, float valorHora, String nome, String endereco){
		super(nome,endereco);
		this.mat = mat;
		this.qtdHora = qtdHora;
		this.valorHora = valorHora;
		calcularSalario();
	}
		public void calcularSalario() {
			salario = this.qtdHora * this.valorHora;
	}
	public void exibirProfHorista() {
		exibirPessoa();
		System.out.println("Matricula: " + mat);
		System.out.println("Quantidade de Horas: " + qtdHora);
		System.out.println("Hora da Aula: " + valorHora);
		System.out.println("Salario: " + salario);
	}
}
