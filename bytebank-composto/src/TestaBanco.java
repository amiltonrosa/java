
public class TestaBanco {

	public static void main(String[] args) {

		Cliente amilton = new Cliente();
		
		amilton.nome = "Amilton Rosa";
		amilton.cpf = "267.157.968-31";
		amilton.profissao = "Programador";
		
		Conta contaDoAmilton = new Conta();
		
		contaDoAmilton.deposita(100);
		
		contaDoAmilton.setTitular(amilton);
		
		System.out.println(contaDoAmilton.getTitular());
	}

}
