
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("Criando conta...");
		//System.out.println("O total de contas é " + Conta.total);

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

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
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
