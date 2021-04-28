
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Método de bonificação Editor de Video");
		return super.getBonificacao() + 100;
	}

}
