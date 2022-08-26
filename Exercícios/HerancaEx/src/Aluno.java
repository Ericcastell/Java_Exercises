public class Aluno extends Pessoa{
	private float nota1;
	private float nota2;
	private String mat;
	private float media;
	
	Aluno(String cpf, float nota1, float nota2, String mat){
		super(cpf);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.mat = mat;
	}
	
	public void calcMedia(){
		this.media = (this.nota1 + this.nota2)/2;
	}	
	
	void exibirAluno() {
		exibirPes();
		System.out.println("Matricula: " + mat);
		System.out.println("Nota1: " + nota1);
		System.out.println("Nota2: " + nota2);
		System.out.println("Media: "+ media);
		
	}
}

