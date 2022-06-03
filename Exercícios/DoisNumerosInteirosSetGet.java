public class DoisNumerosInteirosSetGet {
	int numero1, numero2;
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public int getNumero1() {
		return this.numero1;
	}
	public int getNumero2() {
		return this.numero2;
	}	
	public int somar(){
		int soma;
		soma = this.numero1 + this.numero2;
		return soma;
	}
	public int multiplicar() {
		int produto;
		produto = this.numero1 * this.numero2;
		return produto;
	}
	public int subtrair() {
		int sub;
		sub = this.numero1 - this.numero2;
		return sub;
	}
	public float dividir() {
		int div;
		div = this.numero1 / this.numero2;
		return div;
	}
	public int descobrirMaior() {
		if (this.numero1 > this.numero2)
			return numero1;
		else
			return numero2;
		}
	}
