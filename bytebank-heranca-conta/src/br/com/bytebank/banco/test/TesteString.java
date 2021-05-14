package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String vazio = " Aminfor ";
		System.out.println(vazio.contains("Ami"));

		vazio = vazio.trim();
		System.out.println(vazio);

		String nome = "Amilton"; // Object Literal

		System.out.println(nome.length());

		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

		// String sub = nome.substring(4);

		// char c = 'A';
		// char b = 'a';

		// nome = nome.replace(c, b);

		// nome = nome.toLowerCase();

		// System.out.println(sub);
	}

}
