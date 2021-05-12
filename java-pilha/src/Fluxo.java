
public class Fluxo {

	// Função Main
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	// Método 1
	public static void metodo1() throws MinhaExcecao {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	// Método 2
	public static void metodo2() throws MinhaExcecao {
		System.out.println("Inicio do metodo2");

		Conta c = null;

		throw new MinhaExcecao("Deu muito ruim!");

		// System.out.println("Fim do metodo2");
	}
}
