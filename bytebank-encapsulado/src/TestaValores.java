
public class TestaValores {

	public static void main(String[] args) {
		Conta contaTa  = new Conta(9354, 34447);
		Conta contaBo = new Conta(9354, 38567);
		Conta contaCa = new Conta(9354, 35678);
		
		System.out.println("Total de contas criada: " + Conta.getTotal());
	}
}
