/* 
 * Essa classe é responsável por criar todas as conexões a partir de um arquivo de entrada. 
 * Ela é a classe de maior nível e controla toda a rede telefônica. 
 * Após a leitura do arquivo, ela cria as centrais e seus respectivos clientes, as linhas que conectam duas centrais e 
      recebe todas as tentativas de chamada. Tem o papel de relacionar os módulos, consultar a central, 
      retornar a central desejada com os clientes, fazer a conexão entre dois clientes e remover esta conexão. 
*/

package tppm;

import java.util.ArrayList;

public class Rede {
	
	public boolean consultaCentral (String id) {
		
		return false;
	}
	
	public String getCentral (String id) {  //Dúvida no tipo de retorno (deve retornar uma central)
		
		return null;
	}
	
	public String getConexao (String assinanteA, String centralA, String assinanteB, String centralB){  //Dúvida no tipo de retorno (deve retornar o caminho ou null)
		
		return " ";
	}
	
	public boolean fechaConexao (String assinanteA, String AssinanteB, String central, ArrayList<Integer> caminho, int tempo) {
		
		return false;		
	}
	
	
}
