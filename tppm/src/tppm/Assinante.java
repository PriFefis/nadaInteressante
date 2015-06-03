/* 
 Essa classe e responsavel por armazenar os dados do cliente, a quantidade de ligacoes realizadas, 
     se este esta em uma ligacao, se seu telefone esta tocando e se esta ocupado. 
 * Tendo funcoes para retornar cada um destes elementos, funcoes para modificar as variaveis que podem ser alteradas 
     e uma funcao que retorna se o cliente pode receber ou nao uma requisicao de chamada (getAvailable).
*/

package tppm;

public class Assinante { 
	private String nome;
	//private int id;
	private String tel;
	private boolean ocupado;
	private boolean emLigacao;
	private boolean telTocando;
	private int impulsos;
	
	public Assinante() {
		// TODO Auto-generated constructor stub
	}
	
	//Retorna o nome do assinante
	public String getNome() {
		return nome;
	}
	
	//Configura (setta) o nome do assinante
	public void setNome(String nome) {
		this.nome = nome;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}

	//Retorna o número do telefone do assinante.
	public String getTel() {
		return tel;
	}
	
	//"Configura" (setta) o telefone do assinante.
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//Se o assinante não estiver em uma ligação e seu telefone não estiver tocando, retorna true. Retorna false se uma destas condições forem diferentes.
	public boolean getDisponivel () {
		if (!isEmLigacao() && !isTelTocando())
			return true;
		else
			return false;
	}
	
	//Retorna se o assinante está ocupado ou não.
	public boolean isOcupado() {
		return ocupado;
	}
		
	//Altera o valor da variavel ocupado. Configura se o assinante está ou não ocupado.
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	//Retorna se o assinante estabeleceu conexão com outro assinante.
	public boolean isEmLigacao() {
		return emLigacao;
	}
	
	//Altera o valor da variável emLigação. Configura se o assinante está ou não em ligação.
	public void setEmLigacao(boolean emLigacao) {
		this.emLigacao = emLigacao;
	}
	
	//Retorna se o telefone do assinante está tocando.
	public boolean isTelTocando() {
		return telTocando;
	}
	
	//Altera o valor da variável telTocando. Configura se o telefone do assinante está ou não tocando.
	public void setTelTocando(boolean telTocando) {
		this.telTocando = telTocando;
	}
	
	//Retorna a quantidade de impulsos consumidos pelo assinante.
	public int getImpulsos() {
		return impulsos;
	}
	
	//Altera o valor da variável impulsos. Configura a quantidade de impulsos consumidos pelo assinante.
	public void setImpulsos(int impulsos) {
		this.impulsos = impulsos;
	}
		
	//Imprime o nome do assinante e uma mensagem passada como parâmetro.
	public void imprimeMsg(String msg){
		System.out.println("Assinante: " + getNome() + " Mensagem: " + msg);
	}
	
	
}
