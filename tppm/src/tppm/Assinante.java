/* 
 * Essa classe é responsável por armazenar os dados do cliente, a quantidade de ligações realizadas, 
     se este está em uma ligação, se seu telefone está tocando e se está ocupado. 
 * Tendo funções para retornar cada um destes elementos, funções para modificar as variáveis que podem ser alteradas 
     e uma função que retorna se o cliente pode receber ou não uma requisição de chamada (getAvailable).
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
