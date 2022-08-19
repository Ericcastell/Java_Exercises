package heranca;

public class Pessoa {
	public String nome, endereco;
	Pessoa(String nome, String endereco){
		this.nome = nome;
		this.endereco = endereco;
	}
	public void exibir() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Endereco: "+this.endereco);
	}
}
