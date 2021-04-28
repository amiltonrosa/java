package br.com.bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoAmilton = new Conta();
		contaDoAmilton.saldo = 300;
		contaDoAmilton.deposita(150);
		
		System.out.println("Saldo da conta do Amilton: " + contaDoAmilton.saldo);
		
		boolean conseguiuRetirar = contaDoAmilton.saca(500);
		
		System.out.println("Saldo da conta do Amilton: " + contaDoAmilton.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaDanielle = new Conta();
		contaDaDanielle.saldo = 800;
		
		System.out.println("Saldo conta da Danielle: " + contaDaDanielle.saldo);
		
		contaDaDanielle.transfere(250, contaDoAmilton);
		
		System.out.println("Saldo conta da Danielle: " + contaDaDanielle.saldo);
		
		System.out.println("Saldo conta da Amilton: " + contaDoAmilton.saldo);
	}

}
