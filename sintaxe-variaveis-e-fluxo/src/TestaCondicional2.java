
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais...\n");

		int idade = 15;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar, pois esta acompanhado");
			} else {
				System.out.println("Você tem menos de 18 anos");
			}
		}

	}
}
