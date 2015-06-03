/* 
 * Essa classe e responsavel por armazenar as duas centrais conectadas por uma linha, retorna-las quando 
    necessario e informar se a linha esta ou nao ocupada.
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
	
	//Retorna true se a central label existir e false se não existir.
	public String getCentral(String label) {
		return " ";
	}
	
	//Retorna se a linha está ocupada.
	public boolean getDisponivel() {
		
		return false;		
	}
	
	//Altera o valor da variável disponivel.
	public void setDisponivel(boolean disponivel){  
		
	}
}
