package br.com.bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		// Primeira conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Primeira conta: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Primeira conta: " + primeiraConta.saldo);
		
		// Segunda conta
		Conta segundaConta = new Conta();
		segundaConta.saldo = 100;
		System.out.println("Segunda conta: " + segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("contas iguais");
		} else {
			System.out.println("contas diferentes");
		}

	}

}
