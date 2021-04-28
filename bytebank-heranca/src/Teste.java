
public class Teste {

	public static void main(String[] args) {

		System.out.println("Programador");

		FuncionarioTeste f1 = new FuncionarioTeste();
		f1.setSalario(2500);

		System.out.println("Tipo: " + f1.getTipo());
		System.out.println("Bonificação: " + f1.getBonificacao());

		System.out.println("\nGerente");

		FuncionarioTeste f2 = new FuncionarioTeste();
		f2.setTipo(1);
		f2.setSalario(4500);

		System.out.println("Tipo:" + f2.getTipo());
		System.out.println("Bonificação: " + f2.getBonificacao());

		System.out.println("\nDiretor");

		FuncionarioTeste f3 = new FuncionarioTeste();
		f3.setTipo(2);
		f3.setSalario(12000);

		System.out.println("Tipo:" + f3.getTipo());
		System.out.println("Bonificação: " + f3.getBonificacao());
	}

}
