package DominioDoProblema;

public class Jogador {

	protected String nome;
	protected int fase;
	protected boolean vencedor;
	protected int simbolo;
	protected Posicao ocupando;

	public void iniciar() {
		vencedor = false;
		fase = 0;
	}

	/**
	 * @param idJogador
	 */
	public void assumirNome(String idJogador) {
		this.nome = idJogador;
	}

	/**
	 * @param cor
	 */
	public void assumirCor(int cor) {
		this.simbolo = cor;
	}

	public boolean informarDaVez() {
		return fase != 0;
	}

	public int verificarFase() {
		return fase;
	}
	
//	/**
//	 * @param linha
//	 * @param coluna
//	 */
//	public boolean verificarAdjacente(int linha1, int coluna1, int linha2, int coluna2) {
//		return this.ocupando.verificarAdjacente(linha1, coluna1, linha2, coluna2);
//	}
	
	/**
	 * @param linha
	 * @param coluna
	 */
	public boolean verificarAdjacente(int linha1, int coluna1, int linha2, int coluna2, boolean linha2MaiorLinha1, Posicao[][] posicoes) {
		return this.ocupando.verificarAdjacente(linha1, coluna1, linha2, coluna2, linha2MaiorLinha1, posicoes);
	}

	/**
	 * @param nova
	 */
	public void atualizar(Posicao nova) {
		if (this.ocupando == null) {
			this.ocupando = nova;
		} else {
			this.ocupando.esvaziar();
			this.ocupando = nova;
			this.ocupando.modOcupacao(simbolo);
		}
	}
	
	/**
	 * @param nova
	 */
	public void atualizar(Posicao antiga, Posicao nova, Jogador jog) {
		jog.ocupando = nova;
		antiga.ocupante = 0;
		nova.ocupante = jog.simbolo;
	}
	
	public void mudarFase() {
		if (this.fase == 1) {
			this.fase = 0;
		} else {
			this.fase = 1;
		}
	}

	public Posicao informarPosicao() {
		return this.ocupando;
	}

	public void assumirVencedor() {
		this.vencedor = true;
	}

	public String informarNome() {
		return this.nome;
	}

	public boolean informarVencedor() {
		return this.vencedor;
	}

	public void desabilitar() {
		this.fase = 0;
	}

	public int informarSimbolo() {
		return this.simbolo;
	}
}