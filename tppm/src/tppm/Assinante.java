/* 
 * Essa classe é responsável por armazenar os dados do cliente, a quantidade de ligações realizadas, 
     se este está em uma ligação, se seu telefone está tocando e se está ocupado. 
 * Tendo funções para retornar cada um destes elementos, funções para modificar as variáveis que podem ser alteradas 
     e uma função que retorna se o cliente pode receber ou não uma requisição de chamada (getAvailable).
*/

package tppm;

public class Assinante { 
	private String nome;
	private int id;
	private String tel;
	
	public Assinante() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
