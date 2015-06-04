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
	private String tel;
	private boolean ocupado;
	private boolean emLigacao;
	private boolean telTocando;
	private int impulsos;
	private int quantLigacoesRealizadas;
	
	public Assinante() {
		// TODO Auto-generated constructor stub
	}
	
	//Retorna o nome do assinante.
	public String getNome() {
		return nome;
	}
	
	//Configura (setta) o nome do assinante.
	public void setNome(String nome) {
		this.nome = nome;
	}

	//Retorna o numero do telefone do assinante.
	public String getTel() {
		return tel;
	}
	
	//"Configura" (setta) o telefone do assinante.
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//Retorna a quantidade de ligacoes realizadas pelo assinante.
	public int getQuantLigacoesRealizadas() {
		return quantLigacoesRealizadas;
	}

	//configura a quantidade de ligacoes realizadas pelo assinante.
	public void setQuantLigacoesRealizadas(int quantLigacoesRealizadas) {
		this.quantLigacoesRealizadas = quantLigacoesRealizadas;
	}

	/*Se o assinante nao estiver em uma ligacao e seu telefone nao estiver tocando, retorna true. 
	 Retorna false se uma destas condicoes forem diferentes. */
	public boolean getDisponivel () {
		if (!isEmLigacao() && !isTelTocando())
			return true;
		else
			return false;
	}
	
	//Retorna se o assinante esta ocupado ou nao.
	public boolean isOcupado() {
		return ocupado;
	}
		
	//Altera o valor da variavel ocupado. Configura se o assinante esta ou nao ocupado.
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	//Retorna se o assinante estabeleceu conexao com outro assinante.
	public boolean isEmLigacao() {
		return emLigacao;
	}
	
	//Altera o valor da variavel emLigacao. Configura se o assinante esta ou nao em ligacao.
	public void setEmLigacao(boolean emLigacao) {
		this.emLigacao = emLigacao;
	}
	
	//Retorna se o telefone do assinante esta tocando.
	public boolean isTelTocando() {
		return telTocando;
	}
	
	//Altera o valor da variavel telTocando. Configura se o telefone do assinante esta ou nao tocando.
	public void setTelTocando(boolean telTocando) {
		this.telTocando = telTocando;
	}
	
	//Retorna a quantidade de impulsos consumidos pelo assinante.
	public int getImpulsos() {
		return impulsos;
	}
	
	//Altera o valor da variavel impulsos. Configura a quantidade de impulsos consumidos pelo assinante.
	public void setImpulsos(int impulsos) {
		this.impulsos = impulsos;
	}
		
	//Imprime o nome do assinante e uma mensagem passada como parametro.
	public void imprimeMsg(String msg){
		System.out.println("Assinante: " + getNome() + " Mensagem: " + msg);
	}
	
	
}
