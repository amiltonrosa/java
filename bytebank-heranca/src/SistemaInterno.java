
public class SistemaInterno {

	private int senha = 2222;

	public void autentica(Autenticavel a) {
		if (a.autentica(this.senha)) {
			System.out.println("Acesso liberado.");
		} else {
			System.out.println("Acesso negado");
		}
	}

	/*
	 * public void autentica(Administrador adm) { boolean autenticou =
	 * adm.autentica(this.senha); if (autenticou) {
	 * System.out.println("Acesso liberado."); } else {
	 * System.out.println("Acesso negado"); } }
	 */

}
