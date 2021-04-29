
public class Programador extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Método de bonificação Programador");
		return super.getSalario() * 0.05;
	}
}
