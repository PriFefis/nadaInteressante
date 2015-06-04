 /* Essa classe e responsavel por armazenar as duas centrais conectadas por uma linha, 
    retorna-las quando necessario e informar se a linha esta ou nao ocupada.
*/

package tppm;

public class Linha {
	private String central_A;
	private String central_B;
	private boolean disponivel;
	
	//O construtor cria uma linha desocupada entre as centrais A e B.
	public Linha(String centralA, String centralB) {
		this.disponivel = true;
		this.central_A[0] = centralA;
		this.central_B[1] = centralB;
	}
	
	//Retorna a central do outro lado da linha, conectada com a central label.
	public Central getCentralConectada (String label){
		if (label == this.central[0]) {
			return this.central[1];
		} else {
			return this.central[0];
		}
	}
	
	//Retorna true se a central label existir e false se nao existir.
	public boolean getCentral(String label) {
		if ((this.central[0] == label) ||
				(this.central[1] == label)) {
			return true;
		}
		return false;
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
