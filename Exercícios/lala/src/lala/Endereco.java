package lala;

public class Endereco {
	private String tipoLogradouro;
	private String nomeLogradouro;
	private int numeroLogradouro;
	private int apartamento;
	private String complemento;
	Endereco(String tipoLogradouro,String nomeLogradouro, int numeroLogradouro){
		this.tipoLogradouro=tipoLogradouro;
		this.nomeLogradouro=nomeLogradouro;
		this.numeroLogradouro=numeroLogradouro;
	}
	Endereco(String tipoLogradouro,String nomeLogradouro, int numeroLogradouro,String complemento){
		this.tipoLogradouro=tipoLogradouro;
		this.nomeLogradouro=nomeLogradouro;
		this.numeroLogradouro=numeroLogradouro;
		this.complemento=complemento;
	}
	Endereco(String tipoLogradouro,String nomeLogradouro, int numeroLogradouro,int apartamento){
		this.tipoLogradouro=tipoLogradouro;
		this.nomeLogradouro=nomeLogradouro;
		this.numeroLogradouro=numeroLogradouro;
		this.apartamento=apartamento;
	}
	Endereco(String tipoLogradouro,String nomeLogradouro, int numeroLogradouro,String complemento, int apartamento){
		this.tipoLogradouro=tipoLogradouro;
		this.nomeLogradouro=nomeLogradouro;
		this.numeroLogradouro=numeroLogradouro;
		this.complemento=complemento;
		this.apartamento=apartamento;
	}
	public void exibirDados() {
		System.out.print(tipoLogradouro+" ");
		System.out.print(nomeLogradouro+", ");
		System.out.print(numeroLogradouro);
		if(apartamento!=0) {
			System.out.print(" apto "+apartamento);
		}
		if(complemento!=null) {
			System.out.print(complemento);
		}
	}
}