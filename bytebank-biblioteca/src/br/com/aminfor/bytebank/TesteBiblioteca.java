package br.com.aminfor.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(354, 7586);
				
		c.deposita(200.0);
		
		try {
			c.saca(220.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente");
		}		
	}

}
