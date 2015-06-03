/* 
 * Essa classe é responsavel por armazenar as duas centrais conectadas por uma linha, retorna-las quando necessario e 
      informar se a linha esta ou nao ocupada.
*/
//Sol, essa classe nao e referente a uma ligacao feita por um assinante. Ela diz respeito a uma linha (conexao) 
//que existe entre duas centrais.

package tppm;

public class Ligacao {
	private String central_A;
	private String central_B;
	//O construtor cria uma linha desocupada entre as centrais A e B.
	public Ligacao(String centralA, String centralB) {
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
