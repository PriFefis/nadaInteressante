/* 
 Essa classe � respons�vel por armazenar os dados do cliente, a quantidade de liga��es realizadas, 
     se este est� em uma liga��o, se seu telefone est� tocando e se est� ocupado. 
 * Tendo fun��es para retornar cada um destes elementos, fun��es para modificar as vari�veis que podem ser alteradas 
     e uma fun��o que retorna se o cliente pode receber ou n�o uma requisi��o de chamada (getAvailable).
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
	
//	public Assinante() {
//		// TODO Auto-generated constructor stub
//	}
	
	//Retorna o nome do assinante
	public String getNome() {
		return nome;
	}
	
	//"Configura" (setta) o nome do assinante.
	public void setNome(String nome) {
		this.nome = nome;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	
	//Retorna o n�mero do telefone do assinante.
	public String getTel() {
		return tel;
	}
	
	//"Configura" (setta) o telefone do assinante.
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//Se o assinante n�o estiver em uma liga��o e seu telefone n�o estiver tocando, retorna true. Retorna false se uma destas condi��es forem diferentes.
	public boolean getDisponivel () {
		if (!isEmLigacao() && !isTelTocando())
			return true;
		else
			return false;
	}
	
	//Retorna se o assinante est� ocupado ou n�o.
	public boolean isOcupado() {
		return ocupado;
	}
	
	//Altera o valor da vari�vel ocupado. Configura se o assinante est� ou n�o ocupado.
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	//Retorna se o assinante estabeleceu conex�o com outro assinante.
	public boolean isEmLigacao() {
		return emLigacao;
	}
	
	//Altera o valor da vari�vel emLiga��o. Configura se o assinante est� ou n�o em liga��o.
	public void setEmLigacao(boolean emLigacao) {
		this.emLigacao = emLigacao;
	}
	
	//Retorna se o telefone do assinante est� tocando.
	public boolean isTelTocando() {
		return telTocando;
	}
	
	//Altera o valor da vari�vel telTocando. Configura se o telefone do assinante est� ou n�o tocando.
	public void setTelTocando(boolean telTocando) {
		this.telTocando = telTocando;
	}
	
	//Retorna a quantidade de impulsos consumidos pelo assinante.
	public int getImpulsos() {
		return impulsos;
	}
	
	//Altera o valor da vari�vel impulsos. Configura a quantidade de impulsos consumidos pelo assinante.
	public void setImpulsos(int impulsos) {
		this.impulsos = impulsos;
	}
	
	//Imprime o nome do assinante e uma mensagem passada como par�metro.
	public void imprimeMsg(String msg){
		System.out.println("Assinante: " + getNome() + " Mensagem: " + msg);
	}
	
	
}
