/* 
 * 
Essa classe � respons�vel por criar todas as conex�es a partir de um arquivo de entrada. 
 * Ela � a classe de maior n�vel e controla toda a rede telef�nica. 
 * Ap�s a leitura do arquivo, ela cria as centrais e seus respectivos clientes, as linhas que conectam duas centrais e 
      recebe todas as tentativas de chamada. Tem o papel de relacionar os m�dulos, consultar a central, 
      retornar a central desejada com os clientes, fazer a conex�o entre dois clientes e remover esta conex�o. 
*/

package tppm;

import java.util.ArrayList;

public class Rede {
	
	public boolean consultaCentral (String id) {
		
		return false;
	}
	
	public String getCentral (String id) {  //D�vida no tipo de retorno (deve retornar uma central)
		
		return null;
	}
	
	public String getConexao (String assinanteA, String centralA, String assinanteB, String centralB){  //D�vida no tipo de retorno (deve retornar o caminho ou null)
		
		return " ";
	}
	
	public boolean fechaConexao (String assinanteA, String AssinanteB, String central, ArrayList<Integer> caminho, int tempo) {
		
		return false;		
	}
	
	
}
