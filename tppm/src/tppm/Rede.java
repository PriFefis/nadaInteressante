/* 
 Essa classe e responsavel por criar todas as conexoes a partir de um arquivo de entrada. 
 Ela e a classe de maior nivel e controla toda a rede telefonica. 
 Apos a leitura do arquivo, cria as centrais e seus respectivos assinantes, as linhas 
   que conectam duas centrais e recebe todas as tentativas de chamada. Tem o papel de 
   relacionar os modulos, consultar a central, retornar a central desejada com os 
   assinantes, fazer a conexao entre dois assinantes e remover esta conexao. 
*/

package tppm;

import java.io.IOException;
import java.util.ArrayList;

public class Rede 
{
	private Central[] c;
	public Rede(String arq) throws IOException 
	{
		Config config = new Config(arq);
		this.c = config.getCentrais();
	}
	
	/*Pesquisa em todas as centrais. Se encontrar, faz a atribuicao do label e retorna 
	  true. Caso contrario retorna false. */
	public boolean consultaCentral (String label) 
	{		
		int l=1;
		while (l < c.length)
		{
			if (this.c[l].getLabel()== label) return true;
			l = l+1;
		}
		return false;
	}
	
	/*Pesquisa em todas as centrais. Se encontrar, faz a atribuicao do label e retorna a 
	  central. Caso contrario retorna null. */
	public Central getCentral (String label) 
	{
		int l = 0;
		while (l < c.length)
		{
			if(this.c[l].getLabel()==label) return (this.c[l]);
			l++;
		}
		return null;
	}
	
	/*Pesquisa se a central A e a central B existem. Se nao existirem, nao e estabelecido 
	 a conexao e retorna null. Se existirem, deve-se olhar o status do Assinante A e do 
	 Assinante B (se existem e estao disponiveis) e se ha um caminho entre eles. Se sim, 
	 o assinante recebe o tom de discagem/tocando e a funcao retorna o caminho. 
	 Se nao, envia o sinal de ocupado e retorna null. */
	public void getConexao (String assinanteA, String centralA, String assinanteB, String centralB)
	{ 
		boolean estadoA, estadoB;
		Central a, b;
		a = getCentral(centralA);
		b = getCentral(centralB);
		estadoA = a.checaAssinante(assinanteA);
		estadoB = b.checaAssinante(assinanteB);
		if (estadoA && estadoB)
		{
			if (a.conectaAssinante(assinanteA, assinanteB, centralB)) //VERIFICAR RETORNO...
			{
				a.enviaSinal(assinanteA, "Telefone chamando...");
				b.enviaSinal(assinanteB, "Telefone tocando...");
				//return true;
			}
		}
		else 
			a.enviaSinal(assinanteA, "Ocupado!");
				
		//return false;
	}
	
//	/*Pesquisa se a central e o caminho existem. Se nao, indica que nao existe conexao e 
//	 retorna falso. Se existir e o assinante que ligou desligar ou o assinante que recebeu
//	 a ligacao desliga-la e passar os 90 segundos, a conexao e encerrada, retornando true. 
//	 Se o assinante que recebeu a ligacao desligar e pegar o telefone novamente dentro dos 
//	 90 segundos, a conexao continua, retornando false. */
//	public boolean fechaConexao (String assinanteA, String AssinanteB, String central, ArrayList<Integer> caminho, int tempo) 
//	{	
//		return false;		
//	}
	
}
