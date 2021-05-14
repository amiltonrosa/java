package br.com.bytebank.banco.modelo;

/**
 * 
 * @author Amilton Rosa
 *
 */

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("Criando conta...");
		// System.out.println("O total de contas é " + Conta.total);

		if (agencia <= 0) {
			System.out.println("Não pode agencia menor igual a 0");
			return;
		} else {
			this.agencia = agencia;
		}

		if (numero <= 0) {
			System.out.println("Não pode numero menor igual a 0");
			return;
		} else {
			this.numero = numero;
		}

		System.out.println("Agência: " + this.agencia + " Numero: " + this.numero);
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	/*
	 * public void setAgencia(int agencia) { if (agencia <= 0) {
	 * System.out.println("Não pode agencia menor igual a 0"); return; }
	 * this.agencia = agencia; }
	 */

	public int getNumero() {
		return numero;
	}

	/*
	 * public void setNumero(int numero) { if (numero <= 0) {
	 * System.out.println("Não pode numero menor igual a 0"); return; } this.numero
	 * = numero; }
	 */

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
}
