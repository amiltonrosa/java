
public class TestaGetterESetter {

	public static void main(String[] args) {
		Conta conta = new Conta(9354, 34447);
		Cliente cliente = new Cliente();

		conta.setTitular(cliente);
		
		cliente.setNome("Amilton");
		cliente.setCpf("267.157.968-31");
		cliente.setProfissao("Programador");

		System.out.println("Nome: " + conta.getTitular().getNome());
		System.out.println("CPF: " + conta.getTitular().getCpf());
		System.out.println("Profissão: " + conta.getTitular().getProfissao());
		
		conta.getTitular().setNome("Jose");
		
		System.out.println(conta.getTitular().getNome());
	}

}
