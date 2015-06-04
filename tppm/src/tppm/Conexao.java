/* 
 * Essa classe e responsavel por armazenar as duas centrais conectadas por uma linha, 
    retorna-las quando necessario e informar se a linha esta ou nao ocupada.
*/

package tppm;

public class Conexao {
	private String central_A;
	private String central_B;
	private boolean disponivel;
	
	//O construtor cria uma linha desocupada entre as centrais A e B.
	public Conexao(String centralA, String centralB) {
		this.central_A = centralA;
		this.central_B = centralB;
	}
	
	//Retorna a central do outro lado da linha, conectada com a central label.
	public Central getCentralConectada (String label){
		return null;
	}
	
	//Retorna true se a central label existir e false se nao existir.
	public String getCentral(String label) {
		return " ";
	}
	
	//Retorna se a linha esta ocupada.
	public boolean getDisponivel() {
		return disponivel;		
	}
	
	//Altera o valor da variavel disponivel.
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
