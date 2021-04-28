
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Briareos");
		g1.setCpf("222.345.657-32");
		g1.setSalario(5000);
		
		g1.setSenha(8409);
		boolean autenticou = g1.autentica(8409);
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("CPF: " + g1.getCpf());
		System.out.println("Salário: " + g1.getSalario());
		System.out.println("Bonificação: " + g1.getBonificacao());
		System.out.println("Gerente autenticou: " + autenticou);
		System.out.println("Salário + bonificação: " + (g1.getSalario() + g1.getBonificacao()));
		

	}

}
