/*
 * Essa classe e responsavel por armazenar o nome da central, todos os seus assinantes e todas as linhas que esta 
    central possui. Tambem e responsavel pela manutencao dos assinantes e linhas entre as centrais, enviar contas 
    para os assinantes e conectar seus assinantes com os assinantes de outras centrais.
*/

package tppm;

import java.util.ArrayList;
import java.util.List;

public class Central {
	private String label;
	private List<Assinante> assinantes;
	private List<Conexao> conexoes;
	
	//O construtor cria uma central sem nenhuma conexao ou assinantes.
	public Central(String label) {
		this.label = label;
	}

    //Retorna o nome da central.
	public String getLabel() {
		return label;
	}	
	
	//Envia o sinal "sinal" para o assinante "nome". Se o sinal nao existir, imprime sinal nao existente.
	//Sinal pode ser: ocupado, discar, chamando...
	public void enviaSinal(String nome, String sinal) {
		
	}
		
	//Retorna as linhas da central, se houver, ou null se nao houver.	
	public ArrayList<Integer> getConexao(String central) { //nao sei o que retorna. Coloque ArrayList so para tirar o erro.
		return null;  
		
	}
	
	//Adiciona uma linha entre as centrais A e B.
	public void addConexao(String centralA, String centralB){
		
	}
	
	//Remove uma linha da central.
	public void removeConexao(String central) {
		
	}
	
	//Pesquisa na central A se existe uma conexao com a central B.
	public boolean encontraLinha(String centralA, String centralB, ArrayList<Integer> caminho) {
		
		return false; 		
	}
	
	//Altera o estado da linha.
	public void setConexao(ArrayList<Integer> caminho, boolean estado) {
		
	}
	
	//Se o assinante existir, retorna true. Caso contrario retorna false.
	public boolean consultaAssinante(String nome) {
		
		return false;		
	}
	
	//Se o assinante existir, retorna o assinante. Caso contrario retorna null.
	public Assinante getAssinante(String nome) { //Dúvida no tipo de retorno
		return null;   	
	}
	
	//Adiciona um assinante na central.
	public void addAssinante(String nome) {
		
	}
	
	//Remove um assinante da central.
	public void removeAssinante(String nome) {
		
	}
	
	//Verifica se o assinante existe e retorna se ele esta disponivel ou nao.
	public boolean checaAssinante(String nome) {
		return false;
		
	}
	
	//Chama as funcoes do assinante: setOcupado e setTelTocando.
	public void configuraAssinante(String nome, boolean estaOcupado, boolean estaTocando) {
		
	}
	
	//Pesquisa todos os assinantes e retorna uma lista com seus nomes.
	public List<Assinante> listaAssinante(String nome) {
		return null;	
	}
	
	//Envia a conta para o assinante e abre uma nova para o proximo mes.
	public void faturaAssinante(String nome) {
		
	}
	
	//Envia a respectiva conta para cada assinante da central e abre novas contas para o proximo mes.
	public void faturaAssinantes() {
		
	}
	
	/* Estabelece conexao entre os assinantes A e B, soma o valor da ligacao na conta do que fez a ligacao e 
	  retorna o caminho percorrido entre os mesmos.*/
	public ArrayList<Integer> conectaAssinante(String assinanteA, String assinanteB, String central) {
		return null;
		
	}
	
}
