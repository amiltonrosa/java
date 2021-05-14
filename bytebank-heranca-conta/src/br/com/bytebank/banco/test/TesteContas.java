package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
		
// Full  Qualified Name - FQN
// br.com.bytebank.banco.test.TesteContas
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(9354, 54890);
		ContaPoupanca cp = new ContaPoupanca(9354, 65897);
		
		cc.deposita(200.0);
		
		try {
			cc.transfere(80, cp);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		cp.deposita(100.0);
		
		System.out.println("\nSaldo Conta Corrente: " + cc.getSaldo());
		System.out.println("\nSaldo Conta Poupança: " + cp.getSaldo());

	}

}
