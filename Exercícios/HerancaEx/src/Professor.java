public class Professor extends Pessoa{
		private int horasDeAulaMes;
		private int valorHora;
		private float salario;
	Professor(String cpf, int horasDeAulaMes, int valorHora){
		super(cpf);
		this.horasDeAulaMes = horasDeAulaMes;
		this.valorHora = valorHora;
		calcularSalario();
	}
	
	public void calcularSalario() {
		salario = this.horasDeAulaMes * this.valorHora;
	}
	
	void exibirProf() {
		exibirPes();
		System.out.println("Horas de aula do mestrado: "+ horasDeAulaMes);
		System.out.println("Valor Hora: "+ valorHora);
		System.out.println("Salario: "+ salario);
	}
}
