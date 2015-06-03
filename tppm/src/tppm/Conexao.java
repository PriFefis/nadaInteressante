/* 
 * Essa classe e responsavel por armazenar as duas centrais conectadas por uma linha, retorna-las quando necessario e 
      informar se a linha esta ou nao ocupada.
*/

package tppm;

public class Conexao {
	private String central_A;
	private String central_B;
	//O construtor cria uma linha desocupada entre as centrais A e B.
	public Conexao(String centralA, String centralB) {
		this.central_A = centralA;
		this.central_B = centralB;
	}
	//Retorna central conectada com central de label
	public Central getCentralConectada (String label){
		return null;
	}
	public String getCentral_A() {
		return central_A;
	}
	public void setCentral_A(String central_A) {
		this.central_A = central_A;
	}
}
