
public class TexteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();			
		} catch(IllegalStateException e) {
			System.out.println("Deu erro na conexão.");
		}

		//---------------------------------
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException e) {
//			System.out.println("Deu erro na conexão");
//		} finally {
//			System.out.println("Finally");
//			con.close();
//		}
	}

}
