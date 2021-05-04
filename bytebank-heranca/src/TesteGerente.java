
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setNome("Briareos");
		g.setCpf("222.345.657-32");
		g.setSalario(5000);

		g.setSenha(8354);
		boolean autenticou = g.autentica(8354);

		System.out.println("Nome: " + g.getNome());
		System.out.println("CPF: " + g.getCpf());
		System.out.println("Salário: " + g.getSalario());
		System.out.println("Bonificação: " + g.getBonificacao());
		System.out.println("Gerente autenticou: " + autenticou);
		System.out.println("Salário + bonificação: " + (g.getSalario() + g.getBonificacao()));

	}

}
