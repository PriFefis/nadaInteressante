/* 
 * Essa classe e responsavel por criar todas as conexoes a partir de um arquivo de entrada. 
 * Ela e a classe de maior nivel e controla toda a rede telefonica. 
 * Apos a leitura do arquivo, cria as centrais e seus respectivos assinantes, as linhas que conectam duas centrais 
    e recebe todas as tentativas de chamada. Tem o papel de relacionar os modulos, consultar a central, 
    retornar a central desejada com os assinantes, fazer a conexao entre dois assinantes e remover esta conexao. 
*/

package tppm;

import java.util.ArrayList;

public class Rede {
	/*Pesquisa em todas as centrais. Se encontrar, faz a atribuicao do label e retorna true. 
	 Caso contrario retorna false. */
	public boolean consultaCentral (String label) {		
		return false;
	}
	
	/*Pesquisa em todas as centrais. Se encontrar, faz a atribuicao do label e retorna a central. 
	 Caso contrario retorna null. */
	public String getCentral (String label) {  //Duvida no tipo de retorno (deve retornar uma central)
		
		return null;
	}
	
	/*Pesquisa se a central A e a central B existem. Se nao existirem, nao e estabelecido a conexao e retorna null.
	 Se existirem, deve-se olhar o status do Assinante A e do Assinante B (se existem e estao disponiveis) e 
	 se ha um caminho entre eles. Se sim, o assinante recebe o tom de discagem/tocando e a funcao retorna o caminho. 
	 Se nao, envia o sinal de ocupado e retorna null. */
	public String getConexao (String assinanteA, String centralA, String assinanteB, String centralB){  //Duvida no tipo de retorno (deve retornar o caminho ou null)
		
		return " ";
	}
	
	/*Pesquisa se a central e o caminho existem. Se nao, indica que nao existe conexao e retorna falso. 
	 Se existir e o assinante que ligou desligar ou o assinante que recebeu a ligacao desliga-la e passar os 
	 90 segundos, a conexao e encerrada, retornando true. Se o assinante que recebeu a ligacao desligar e 
	 pegar o telefone novamente dentro dos 90 segundos, a conexao continua, retornando false. */
	public boolean fechaConexao (String assinanteA, String AssinanteB, String central, ArrayList<Integer> caminho, int tempo) {	
		return false;		
	}
}
