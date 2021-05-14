package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("a");
		System.out.println(7);
		System.out.println(true);
		
		ContaCorrente cc = new ContaCorrente(568, 9853);
		ContaPoupanca cp = new ContaPoupanca(345, 5467);
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());
		
		//println(cc.toString());
	}
	
	static void println(Object referencia) {
	}
	
}
