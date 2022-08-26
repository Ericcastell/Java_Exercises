public class ProfessorMestre extends Professor{
		private String temaDoMestrado;
	
	ProfessorMestre(String cpf, int horasDeAulaMes, int valorHora, String temaDoMestrado){
		super(cpf, horasDeAulaMes, valorHora);
		this.temaDoMestrado = temaDoMestrado;
	}
	
	void exibirProfMestre(){
		exibirPes();
		System.out.println("Tema do Mestrado: "+ temaDoMestrado);
	}
}
