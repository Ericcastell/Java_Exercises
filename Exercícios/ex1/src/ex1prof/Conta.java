package ex1prof;

	public class Conta {
		Cliente cliente;
		private int numeroDaConta;
		private float saldo;

	public Conta(int numeroDaConta, float saldo) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}
	
	public float efetuarSaque(float valor) {
		if (valor <= saldo) {
			return saldo =- valor;
		}
		else
			System.out.println("Seu saldo e insuficiente.");
		return saldo;
	}
	
	public float deposito(float valor) {
		saldo += valor;
		return saldo;
	}
	
	public void exibirDadosConta(Cliente cliente, int numeroDaConta, float saldo) {
		System.out.println("Informacoes do cliente: " + this.cliente);
		System.out.println("Numero da conta: " + this.numeroDaConta);
		System.out.println("Informacoes do cliente: " + this.saldo);
	}
}