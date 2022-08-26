public class Pessoa {
	private String nome;
	private String cpf;
	private String telefone;
	
	Pessoa(String cpf){
		this.cpf = cpf;
	}

	public void setNome(String n) {
		nome = n;
	}
	public void setTelefone(String t) {
		telefone = t;
	}
	
	void exibirPes() {
		System.out.println("Nome: "+ nome);
		System.out.println("Cpf: "+ cpf);
		System.out.println("Telefone: "+ telefone);
	}
}
