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
	//Pesquisa em todas as centrais. Se encontrar, faz a atribuição do label e retorna true. Caso contrário retorna false.
	public boolean consultaCentral (String label) {		
		return false;
	}
	
	//Pesquisa em todas as centrais. Se encontrar, faz a atribuição do label e retorna a central. Caso contrário retorna null.
	public String getCentral (String label) {  //Dúvida no tipo de retorno (deve retornar uma central)
		
		return null;
	}
	
	//Pesquisa. Se a centralA ou a centralB não existir, não é estabelecido a conexão e retorna null. Se existir, deve-se olhar o status do AssinanteA e do AssinanteB (se existem e estão disponíveis) e se há um caminho entre eles. Se sim, o cliente recebe o tom de discagem/tocando e a função retorna o caminho. Se não, envia o sinal de ocupado e retorna null.
	public String getConexao (String assinanteA, String centralA, String assinanteB, String centralB){  //Dúvida no tipo de retorno (deve retornar o caminho ou null)
		
		return " ";
	}
	
	//Pesquisa se a central e o caminho existem. Se não, indica que não existe conexão e retorna falso. Se existir e o cliente que ligou desligar ou o cliente que recebeu a ligação desligá-a e passar os 90 segundos, a conexão é encerrada, retornando true. Se o cliente que recebeu a ligação desligar e pegar o telefone novamente dentro dos 90 segundos, a conexão continua, retornando false. 
	public boolean fechaConexao (String assinanteA, String AssinanteB, String central, ArrayList<Integer> caminho, int tempo) {	
		return false;		
	}
}
