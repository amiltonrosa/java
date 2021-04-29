
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente funcionario = new Gerente();
		funcionario.setNome("Amilton Rosa");
		funcionario.setCpf("222.657.435-32");
		funcionario.setSalario(2500);
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("Bonificação: " + funcionario.getBonificacao());

	}

}
