/* 
 Essa classe e responsavel por armazenar os dados do assinante, a quantidade de ligacoes 
   realizadas, se este esta em uma ligacao, se seu telefone esta tocando e se esta 
   ocupado. Ha funcoes para retornar cada um destes elementos, funcoes para modificar 
   as variaveis que podem ser alteradas e uma funcao que retorna se o assinante pode 
   receber ou nao uma requisicao de chamada (getAvailable).
*/

package tppm;

public class Assinante { 
	
	private String nome;
	//private String tel;
	private boolean ocupado;
	private boolean emLigacao;
	private boolean telTocando;
	private int impulsos;
	//private int quantLigacoesRealizadas;
	
	public Assinante(String nome) {
		this.nome = nome;
		this.ocupado = false;
		this.emLigacao = false;
		this.telTocando = false;
		this.impulsos = 0;
	}
	
<<<<<<< HEAD
	/* ---------------------- Metodos get ---------------------- */
=======
	/* ---------------------- M�todos get ---------------------- */
>>>>>>> branch 'master' of https://github.com/PriFefis/nadaInteressante.git
	
	//Retorna o nome do assinante.
	public String getNome() {
		return this.nome;
	}
	
	/*Se o assinante estiver em uma ligacao ou seu telefone estiver tocando, retorna false. 
	 Retorna true se uma destas condicoes forem diferentes. */
	public boolean getDisponivel () 
	{
		if (estaOcupado() || telEstaTocando())
			return false;
		else
			return true;
	}
	
//	//Retorna o numero do telefone do assinante.
//	public String getTel() 
//	{
//		return tel;
//	}
	
//	//Retorna a quantidade de ligacoes realizadas pelo assinante.
//	public int getQuantLigacoesRealizadas() 
//	{
//		return quantLigacoesRealizadas;
//	}	
	
	//Retorna a quantidade de impulsos consumidos pelo assinante.
	public int getImpulsos() 
	{
		return this.impulsos;
	}
	
	//Retorna se o assinante esta ocupado ou nao.
	public boolean estaOcupado() 
	{
		return this.ocupado;
	}
	
	//Retorna se o assinante estabeleceu conexao com outro assinante.
	public boolean estaEmLigacao() 
	{
		return this.emLigacao;
	}
	
	//Retorna se o telefone do assinante esta tocando ou nao.
	public boolean telEstaTocando() 
	{
		return this.telTocando;
	}	
	
<<<<<<< HEAD
	/* ---------------------- Metodos set ---------------------- */
=======
	/* ---------------------- M�todos set ---------------------- */
>>>>>>> branch 'master' of https://github.com/PriFefis/nadaInteressante.git
	
	//Configura (setta) o nome do assinante.
	public void setNome(String nome) {
		this.nome = nome;
	}
	
//	//"Configura" (setta) o telefone do assinante.
//	public void setTel(String tel) 
//	{
//		this.tel = tel;
//	}

//	//configura a quantidade de ligacoes realizadas pelo assinante.
//	public void setQuantLigacoesRealizadas(int quantLigacoesRealizadas) 
//	{
//		this.quantLigacoesRealizadas = quantLigacoesRealizadas;
//	}
		
	//Altera o valor da variavel ocupado. Configura se o assinante esta ou nao ocupado.
	public void setOcupado(boolean ocupado) 
	{
		this.ocupado = ocupado;
	}	
	
	//Altera o valor da variavel emLigacao. Configura se o assinante esta ou nao em ligacao.
	public void setEmLigacao(boolean emLigacao) 
	{
		this.emLigacao = emLigacao;
	}
	
	//Altera o valor da variavel telTocando. Configura se o telefone do assinante esta ou nao tocando.
	public void setTelTocando(boolean telTocando) 
	{
		this.telTocando = telTocando;
	}
	
	//Altera o valor da variavel impulsos. Configura a quantidade de impulsos consumidos pelo assinante.
	public void setImpulsos(int impulsos) 
	{
		this.impulsos = impulsos;
	}
	
	
	//Imprime o nome do assinante e uma mensagem passada como parametro.
	public void imprimeMsg(String msg)
	{
		System.out.println("Assinante: " + getNome() + ", Mensagem: " + msg);
	}

}
