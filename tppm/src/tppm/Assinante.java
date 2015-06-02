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
	
	public Assinante() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public boolean getDisponivel () {
		if (!isEmLigacao() && !isTelTocando())
			return true;
		else
			return false;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public boolean isEmLigacao() {
		return emLigacao;
	}
	public void setEmLigacao(boolean emLigacao) {
		this.emLigacao = emLigacao;
	}
	public boolean isTelTocando() {
		return telTocando;
	}
	public void setTelTocando(boolean telTocando) {
		this.telTocando = telTocando;
	}
	public int getImpulsos() {
		return impulsos;
	}
	public void setImpulsos(int impulsos) {
		this.impulsos = impulsos;
	}
	public void imprimeMsg(String msg){
		System.out.println("Assinante: " + getNome() + " Mensagem: " + msg);
	}
	
	
}
