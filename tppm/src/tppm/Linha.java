 /* Essa classe e responsavel por armazenar as duas centrais conectadas por uma linha, 
    retorna-las quando necessario e informar se a linha esta ou nao ocupada.
*/

package tppm;

public class Linha 
{
	private boolean disponivel;
	private String[] centrais;

	//O construtor cria uma linha desocupada entre as centrais A e B.
	public Linha(String centralA, String centralB) 
	{
		this.disponivel = true;
		this.centrais = new String[2];
		this.centrais[0] = centralA;
		this.centrais[1] = centralB;
	}
	
	//Verifica se a linha esta ocupada ou nao.
	public boolean getDisponivel() 
	{
		return this.disponivel;		
	}
	
	//Retorna true se a central id existir e false se nao existir.
	public boolean getCentral(String id) 
	{
		boolean cond1 = this.centrais[0] == id;
		boolean cond2 = this.centrais[1] == id;
		if (cond1 || cond2) return true;
		return false;
	}
	
	//Retorna a central do outro lado da linha, conectada com a central id.
	public String getCentralConectada (String id)
	{
		if (id == this.centrais[0]) return this.centrais[1];
		else return this.centrais[0];
	}	
		
	//Altera o valor da variavel disponivel.
	public void setDisponivel(boolean disponivel) 
	{
		this.disponivel = disponivel;
	}
}
