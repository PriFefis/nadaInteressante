public class Central {
	private String label;
	private ArrayList<Assinante> assinante;
	private ArrayList<Linha> linha;
	
	//O construtor cria uma central sem nenhuma conexao ou assinantes.
	public Central(String label) {
		this.label = label;
		this.linha = new ArrayList<Linha>;
		this.assinante = new ArrayList<Assinante>;
	}

    //Retorna o nome da central.
	public String getLabel() {
public class Central {
	private String label;
	private ArrayList<Assinante> assinante;
	private ArrayList<Linha> linha;
	
	//O construtor cria uma central sem nenhuma conexao ou assinantes.
	public Central(String label) {
		this.label = label;
		this.linha = new ArrayList<Linha>;
		this.assinante = new ArrayList<Assinante>;
	}

    //Retorna o nome da central.
	public String getLabel() {
		return label;
	}	
	private static int returnIndex(String toIndex, String... args) {

		for (int i = 0; i < args.length; i++) {
			if (toIndex.equals(args[i])) {
				return i;
			}
			return -1;
		}
	}
	
	//Envia o sinal "sinal" para o assinante "nome". Se o sinal nao existir, imprime sinal nao existente.
	//Sinal pode ser: ocupado, discar, chamando...
	public void enviaSinal(String nome, String sinal) {
		if (!consultA(nome)) {
			return;
		}

		Assinante assinante = this.getAssinante(nome);
		switch (returnIndex(sinal, "ocupado", "discar", "chamar")) {

		case 0:
			assinante.print("o sinal eh " + sinal);
			break;

		case 1:
			assinante.print("o sinal eh " + sinal);
			break;

		case 2:
			assinante.print("o sinal eh " + sinal);
			break;

		default:
			assinante.print("Sinal Invalido!");
		}
	}
		
	//Retorna as linhas da central, se houver, ou null se nao houver.	
	public ArrayList<Integer> getLinha(String central) { //nao sei o que retorna. Coloque ArrayList so para tirar o erro.
		return null;  
		
	}
	
	//Adiciona uma linha entre as centrais A e B.
	public void addLinha(String centralA, String centralB){
		Linha linha = new Line(centralA, centralB);
		this.linha.add(linha);
	}
	
	//Remove uma linha da central.
	public void removeLinha(String central) {
		Linha linha;
		for (int i = 0; i < this.linha.size(); i++) {

			linha = this.linha.get(i);
			if (linha.getCentral(this.label) &&
					linha.getCentral(central)) {
				this.linha.remove(i);
				break;
			}
		}
	}

	//Pesquisa na central A se existe uma conexao com a central B.
	public boolean encontraLinha(String centralA, String centralB, ArrayList<Integer> caminho) {

		Linha linha;

		for (int i = 0; i < this.linha.size(); i++) {

			Linha = this.get(i);
			if (!caminho.contains(i) &&
					linha.getDisponivel() &&
					linha.getCentral(centralA) && 
					linha.getCentral(centralB)) {

				caminho.append(i);
				return;

			}

		}

		//busca em profundidade
		for (int i = 0; i < this.linha.size(); i++) {

			Linha = this.linha.get(i);

			if (caminho.contains(i)) {
				continue;
			}

			//Checar se a linha esta ocupada
			if (!linha.getDisponivel()) {
				continue;
			}

			// Conecta com a centralA
			if (!linha.getCentral(centralA)) {
				continue;
			}

			// Conecta com a centralB
			caminho.add(i);
			if (linha.getCentral(centralB)) {

				return;

			} else {

				encontraLinha(linha.getEndCentral(centralA),
						centralB, caminho);

				Integer id = caminho.get(caminho.size() - 1);
				Linha ultima = this.linha.get(id);
				if (ultima.getCentral(centralB)) {
					return;
				} else {
					caminho.remove(caminho.size() - 1);
				}

			}

		}
	}

	//Altera o estado da linha.
	public void setLinha(ArrayList<Integer> caminho, boolean estado) {
		Linha linha;
		for (int i = 0; i < caminho.size(); i++) {
			linha = this.linha.get(caminho.get(i));
			linha.setDisponivel(estado);
		}		
	}
	
	//Se o assinante existir, retorna true. Caso contrario retorna false.
	public boolean consultaAssinante(String nome) {
		Assinante assinante;
		for (int i = 0; i < this.assinante.size(); i++) {
			client = this.assinante.get(i);
			if (assinante.getNome() == nome) {
				return true;
			}
		}
		return false;
	}
	
	//Se o assinante existir, retorna o assinante. Caso contrario retorna null.
	public Assinante getAssinante(String nome) { 
		Assinante assinante;
		for (int i = 0; i < this.assinante.size(); i++) {
			assinante = this.assinante.get(i);
			if (assinante.getNome() == nome) {
				return assinante;
			}
		}
		return null;
	}
	
	//Adiciona um assinante na central.
	public void addAssinante(String nome) {
		Assinante assinante = new Assinante(nome);
		this.assinante.add(assinante);	
	}
	
	//Remove um assinante da central.
	public void removeAssinante(String nome) {
		Assinante assinante;
		for (int i = 0; i < this.assinante.size(); i++) {
			assinante = this.assinante.get(i);
			if (assinante.getNome() == nome) {
				this.assinante.remove(i);
				break;
			}
		}		
	}
	
	//Verifica se o assinante existe e retorna se ele esta disponivel ou nao.
	public boolean checaAssinante(String nome) {
		if (!consultAssinante(nome)) {
			return false;
		}
		Assinante assinante = getAssinante(nome);
		return assinante.getDisponivel();
	}
	
	//Chama as funcoes do assinante: setOcupado e setTelTocando.
	public void setAssinante(String nome, boolean estaOcupado, boolean estaTocando) {
		if (!consultAssinante(nome)) {
			return;
		}
		Assinante assinante = getAssinantet(nome);
		assinante.setOcupado(estaOcupado);
		assinante.setTocando(estaTocando);
	}
	
	//Pesquisa todos os assinantes e retorna uma lista com seus nomes.
	public List<Assinante> listaAssinante(String nome) {
		Assinante assinante;
		String []assinantes = new String[this.assinante.size()];
		for (int i = 0; i < this.assinante.size(); i++) {
			assinante = this.assinante.get(i);
			assinantes[i] = assinante.getNome();
		}
		return assinantes;
	}
	
	//Envia a conta para o assinante e abre uma nova para o proximo mes.
	public void faturaAssinante(String nome) {
		if (consultAssinante(nome)) {
			Assinante assinante = getAssinante(nome);
			assinante.print("o valor da sua fatura é R$" +
					assinante.getImpulsos();
		}
	}
	
	//Envia a respectiva conta para cada assinante da central e abre novas contas para o proximo mes.
	public void faturaAssinantes() {
		
	}
	
	/* Estabelece conexao entre os assinantes A e B, soma o valor da ligacao na conta do que fez a ligacao e 
	  retorna o caminho percorrido entre os mesmos.*/
	public ArrayList<Integer> conectaAssinante(String assinanteA, String assinanteB, String central) {
		ArrayList<Integer> conexao = new ArrayList<Integer>();
		findconexao(this.label, central, conexao);
		if (conexao.size() < 0) {
			sendSinal(client_a, "ocupado");
		} else {
			setLinha(conexao, false);
			...;
		}
	}
}