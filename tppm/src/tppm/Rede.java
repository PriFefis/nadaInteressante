/* 
 * Essa classe � respons�vel por criar todas as conex�es a partir de um arquivo de entrada. 
 * Ela � a classe de maior n�vel e controla toda a rede telef�nica. 
 * Ap�s a leitura do arquivo, ela cria as centrais e seus respectivos clientes, as linhas que conectam duas centrais e 
      recebe todas as tentativas de chamada. Tem o papel de relacionar os m�dulos, consultar a central, 
      retornar a central desejada com os clientes, fazer a conex�o entre dois clientes e remover esta conex�o. 
*/

package tppm;

import java.util.ArrayList;

public class Rede {
	//Pesquisa em todas as centrais. Se encontrar, faz a atribui��o do label e retorna true. Caso contr�rio retorna false.
	public boolean consultaCentral (String label) {		
		return false;
	}
	
	//Pesquisa em todas as centrais. Se encontrar, faz a atribui��o do label e retorna a central. Caso contr�rio retorna null.
	public String getCentral (String label) {  //D�vida no tipo de retorno (deve retornar uma central)
		
		return null;
	}
	
	//Pesquisa. Se a centralA ou a centralB n�o existir, n�o � estabelecido a conex�o e retorna null. Se existir, deve-se olhar o status do AssinanteA e do AssinanteB (se existem e est�o dispon�veis) e se h� um caminho entre eles. Se sim, o cliente recebe o tom de discagem/tocando e a fun��o retorna o caminho. Se n�o, envia o sinal de ocupado e retorna null.
	public String getConexao (String assinanteA, String centralA, String assinanteB, String centralB){  //D�vida no tipo de retorno (deve retornar o caminho ou null)
		
		return " ";
	}
	
	//Pesquisa se a central e o caminho existem. Se n�o, indica que n�o existe conex�o e retorna falso. Se existir e o cliente que ligou desligar ou o cliente que recebeu a liga��o deslig�-a e passar os 90 segundos, a conex�o � encerrada, retornando true. Se o cliente que recebeu a liga��o desligar e pegar o telefone novamente dentro dos 90 segundos, a conex�o continua, retornando false. 
	public boolean fechaConexao (String assinanteA, String AssinanteB, String central, ArrayList<Integer> caminho, int tempo) {	
		return false;		
	}
}
