package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(8567, 908865);

		conta.deposita(200);
		try {
			conta.saca(250);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ex: "+ e.getMessage());
		}
		System.out.println(conta.getSaldo());
	}

}
