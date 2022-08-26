package heranca2;

public class Pessoa {
	private String nome;
	private String endereco;
	
	Pessoa(String nome, String endereco){
		this.nome = nome;
		this.endereco = endereco;
	}
	public void exibirPessoa() {
		System.out.println("Nome: "+ nome);
		System.out.println("Endereco:"+ endereco);
	}
}
