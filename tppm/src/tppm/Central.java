/*
 * Essa classe e responsavel por armazenar o nome da central, todos os seus assinantes e 
   todas as linhas que esta central possui. Tambem e responsavel pela manutencao dos 
   assinantes e linhas entre as centrais, enviar contas para os assinantes e conectar 
   seus assinantes com os assinantes de outras centrais.
*/

package tppm;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Central 
{
	private String id;
	private ArrayList<Assinante> assinante;
	private ArrayList<Linha> linha;
	
	//O construtor cria uma central sem nenhuma conexao ou assinantes.
	public Central(String id) 
	{
		this.id = id;
		this.assinante = new ArrayList<Assinante>();
		this.linha = new ArrayList<Linha>();		
	}

    //Retorna o nome da central.
	public String getId() 
	{
		return this.id;
	}
	
	//Retorna as linhas da central, se houver, ou null se nao houver.	
	public Linha getLinha(String central) 
	{ 
		Linha linha;
		int i=0;
		while (i < this.linha.size())
		{
			linha = this.linha.get(i);
			boolean id = linha.getCentral(this.id);
			boolean cent = linha.getCentral(central);
			if (id && cent) return linha;
			i++;
		}
		return null;  		
	}
	
	private static int retIndice(String in, String... args) 
	{
		for (int i = 0; i < args.length; i++) 
		{
			if (in.equals(args[i])) return i;
		}
		return -1;
	}
	
	/* Envia o sinal "sinal" para o assinante "nome". Se o sinal nao existir, imprime sinal 
	   nao existente. Sinal pode ser: ocupado, discar, chamando... */
	public void enviaSinal(String nome, String sinal) 
	{
		if (!consultaAssinante(nome)) return;
		Assinante assinante = this.getAssinante(nome);
		switch (retIndice(sinal, "ocupado", "discar", "chamar")) {

		case 0:
			assinante.imprimeMsg("O sinal eh " + sinal);
			break;

		case 1:
			assinante.imprimeMsg("O sinal eh " + sinal);
			break;

		case 2:
			assinante.imprimeMsg("O sinal eh " + sinal);
			break;

		default:
			assinante.imprimeMsg("Sinal Invalido!");
		}
	}	
	
	//Pesquisa na central A se existe uma conexao com a central B.
	public void encontraLinha(String centralA, String centralB, ArrayList<Integer> caminho) 
	{
		Linha linha;
		int tam = this.linha.size();
		int i=0;
		while (i < tam) {
			linha = this.linha.get(i) ;
			boolean linhaDisp = linha.getDisponivel();
			boolean centA = linha.getCentral(centralA);
			boolean centB = linha.getCentral(centralB);
			boolean contI = caminho.contains(i);
			if (!contI && linhaDisp && centA && centB) 
			{
				caminho.add(i);
				return;
			}
			i++;
		}

		//Busca em profundidade.
		for (i = 0; i < this.linha.size(); i++) 
		{
			linha = this.linha.get(i);
			if (caminho.contains(i)) continue;
			//Verifica se a linha esta ocupada.
			if (!linha.getDisponivel()) continue;
			//Conecta com a central A.
			if (!linha.getCentral(centralA)) continue;
			//Conecta com a central B.
			caminho.add(i);
			if (linha.getCentral(centralB)) return;
			else 
			{ 
				encontraLinha(linha.getCentralConectada(centralA), centralB, caminho);
				Integer l = caminho.get(caminho.size()-1);
				Linha ultLinha = this.linha.get(l);
				if (ultLinha.getCentral(centralB)) return;
				else caminho.remove(caminho.size()-1);
			}
		}
	}
	
	//Altera o estado da linha.
	public void setLinha(ArrayList<Integer> caminho, boolean estado) 
	{
		Linha linha;
		int i = 0;
		while (i < caminho.size()) 
		{
			linha = this.linha.get(caminho.get(i));
			linha.setDisponivel(estado);
			i++;
		}		
	}	
	
	//Adiciona uma linha entre as centrais A e B.
	public void addLinha(String centralOrig, String centralDest)
	{
		Linha linha;
		linha = new Linha(centralOrig, centralDest);
		this.linha.add(linha);
	}
	
	//Remove uma linha da central.
	public void removeLinha(String central) 
	{
		Linha linha;
		int tam = this.linha.size();
		int i=0;
		while (i < tam) 
		{
			linha = this.linha.get(i);
			boolean id = linha.getCentral(this.id);
			boolean cent = linha.getCentral(central);
			if (id && cent) 
			{
				this.linha.remove(i);
				break;
			}
			i++;
		}
	}
	
	//Se o assinante existir, retorna o assinante. Caso contrario retorna null.
	public Assinante getAssinante(String nome) 
	{ 
		Assinante assinante;
		int i = 0;
		while (i < this.assinante.size()) 
		{
			assinante = this.assinante.get(i);
			if (assinante.getNome() == nome) return assinante;
			i++;
		}
		return null;
	}
	
	//Se o assinante existir, retorna true. Caso contrario retorna false.
	public boolean consultaAssinante(String nome) 
	{
		Assinante assinante;
		int i = 0;
		while(i < this.assinante.size())
		{
			assinante = this.assinante.get(i);
			if (assinante.getNome() == nome) return true;
			i++;
		}
		return false;
	}
	
	//Adiciona um assinante na central.
	public void addAssinante(String nome) 
	{
		Assinante assinante = new Assinante(nome);
		this.assinante.add(assinante);	
	}
	
	//Remove um assinante da central.
	public void removeAssinante(String nome) 
	{
		Assinante assinante;
		int i = 0;
		while (i < this.assinante.size())
		{
			assinante = this.assinante.get(i);
			if (assinante.getNome() == nome) 
			{
				this.assinante.remove(i);
				break;
			}
			i++;
		}		
	}
	
	//Verifica se o assinante existe e retorna se ele esta disponivel ou nao.
	public boolean checaAssinante(String nome) 
	{
		if (!consultaAssinante(nome)) return false;
		Assinante assinante = getAssinante(nome);
		return assinante.getDisponivel();
	}
	
	//Chama as funcoes do assinante: setOcupado e setTelTocando.
	public void setAssinante(String nome, boolean estaOcupado, boolean estaTocando) 
	{
		if (!consultaAssinante(nome)) return;
		Assinante assinante = getAssinante(nome);
		assinante.setOcupado(estaOcupado);
		assinante.setTelTocando(estaTocando);
	}
	
	//Pesquisa todos os assinantes e retorna uma lista com seus nomes.
	public String[] listaAssinante(String nome) 
	{
		Assinante assinante;
		int i = 0;
		String[] assinantes = new String[this.assinante.size()];
		while (i < this.assinante.size())
		{
			assinante = this.assinante.get(i);
			assinantes[i] = assinante.getNome();
			i++;
		}
		return assinantes;
	}
	
	//Envia a conta para o assinante e abre uma nova para o proximo mes.
	public void faturaAssinante(String nome) 
	{
		if (consultaAssinante(nome)) 
		{
			Assinante assinante;
			assinante = getAssinante(nome);
			assinante.imprimeMsg("voce consumiu " + assinante.getImpulsos() + ". ");
			assinante.imprimeMsg("O valor da sua fatura eh R$" + calculaValor(assinante.getImpulsos())+ ".");
		}
	}
	
	//Calcula valor da conta de acordo com o consumo de impulsos do assinante.
	//O valor de um impulso é R$0,30.
	public String calculaValor (int impulsos) 
	{
		DecimalFormat df = new DecimalFormat("0.00");   
		double valor = (double) (0.3 * impulsos);
		String s = df.format(valor);  
		return s;
	}
	
	//Envia a respectiva conta para cada assinante da central e abre novas contas para o proximo mes.
	public void enviaFaturaParaAssinantes() 
	{
		for (int i = 0; i < this.assinante.size(); i++) 
		{
			String nome = this.assinante.get(i).getNome(); 
			int impulsos = this.assinante.get(i).getImpulsos();
			this.assinante.get(i).imprimeMsg("Prezado(a) " + nome + ", voce consumiu " + impulsos + ". ");
			this.assinante.get(i).imprimeMsg("O valor da sua fatura eh R$" + calculaValor(impulsos));
		}
	}
	
	/* Estabelece conexao entre os assinantes A e B, soma o valor da ligacao na conta do 
	   que fez a ligacao e retorna o caminho percorrido entre os mesmos. */
	public boolean conectaAssinante(String assinanteA, String assinanteB, String central) 
	{
		ArrayList<Integer> caminho;
		caminho = new ArrayList<Integer>();
		encontraLinha(this.id, central, caminho);
		if (caminho.size() < 0) 
		{
			enviaSinal(assinanteA, "ocupado");
			return false;
		}
		else 
		{
			setLinha(caminho, false);
			return true;
		}
	}
}
