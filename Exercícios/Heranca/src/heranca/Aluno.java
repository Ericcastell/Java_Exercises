package heranca;

public class Aluno extends Pessoa{
	public double nota1, nota2, media;
	public Aluno(String nome, String endereco, double nota1, double nota2){
		super(nome,endereco);
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	public void calcmedia() {
		media = (nota1+nota2)/2;
	}
	public void exibirMedia() {
		System.out.println("Media:" + this.media);
	}
}
