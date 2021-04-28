
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaDanielle = new Conta();
		System.out.println(contaDaDanielle.getSaldo());
		
		contaDaDanielle.setTitular(new Cliente());
		System.out.println(contaDaDanielle.getTitular());
		
		contaDaDanielle.getTitular().nome = "Danielle";
		System.out.println(contaDaDanielle.getTitular().nome);
	}
}
