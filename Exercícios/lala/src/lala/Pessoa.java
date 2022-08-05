package lala;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	Pessoa (String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public void exibirDados() {
		System.out.println(nome);
		System.out.println(cpf);
		endereco.exibirDados();
	}
}

