
public class FluxoComTratamento {

	// Função Main
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (Exception e) {
			// System.out.println("Arithmetic Exception: ");
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
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			// int a = i / 0;
			Conta c = null;
			c.deposita();
		}
		System.out.println("Fim do metodo2");
	}
}
