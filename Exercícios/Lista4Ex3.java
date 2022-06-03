import java.util.Scanner;
public class Lista4Ex3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[] qtd = new int[11];
		int i, nota;
		for(i = 0; i < 50; i++) {
			System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
			nota = ent.nextInt();
			qtd[nota]++;
		}
		for(i = 0; i < qtd.length; i++)
			System.out.println("Nota " + i + ": "  + qtd[i]);
		ent.close();
	}
}
