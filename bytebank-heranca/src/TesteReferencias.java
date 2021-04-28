
public class TesteReferencias {

	public static void main(String[] args) {

		System.out.println("Funcionario:");

		Funcionario f = new Funcionario();
		f.setNome("Amilton");
		f.setCpf("354.654.768-84");
		f.setProfissao("Programador");
		f.setSalario(2000);

		System.out.println("Nome: " + f.getNome());
		System.out.println("Profissão: " + f.getProfissao());
		System.out.println("CPF: " + f.getCpf());
		System.out.println("Salário: " + f.getSalario());
		System.out.println("Bonificação: " + f.getBonificacao());

		System.out.println("\nGerente:");

		Gerente g = new Gerente();
		g.setNome("Lucas");
		g.setCpf("254.687.453-24");
		g.setProfissao("Administrador de Sistemas");
		g.setSalario(5000);
		g.setSenha(2342);

		System.out.println("Nome: " + g.getNome());
		System.out.println("CPF: " + g.getCpf());
		System.out.println("Profissão: " + g.getProfissao());
		System.out.println("Salário: " + g.getSalario());
		System.out.println("Bonificação: " + g.getBonificacao());

		System.out.println("\nEditor de Video:");

		EditorVideo ev = new EditorVideo();
		ev.setNome("Tobias");
		ev.setCpf("244.653.345-24");
		ev.setSalario(2500);

		System.out.println("Nome: " + ev.getNome());
		System.out.println("CPF: " + ev.getCpf());
		System.out.println("Salário: " + ev.getSalario());
		System.out.println("Bonificação: " + ev.getBonificacao());

		System.out.println("\nDesigner:");

		Designer d = new Designer();
		d.setNome("Dedé");
		d.setCpf("233.546.985-24");
		d.setSalario(2000);

		System.out.println("Nome: " + d.getNome());
		System.out.println("CPF: " + d.getCpf());
		System.out.println("Salário: " + d.getSalario());
		System.out.println("Bonificação: " + d.getBonificacao());

		System.out.println();

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(f);
		controle.registra(g);
		controle.registra(ev);
		controle.registra(d);

		System.out.println("\nSoma das bonificações: " + controle.getSoma());

	}

}
