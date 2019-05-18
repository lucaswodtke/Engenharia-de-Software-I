package DominioDoProblema;

public class Posicao {

	protected int posicaoInicialPeca[][] = new int[17][13];
	protected int ocupante = 0;
	protected int linha;
	protected int coluna;

	public Posicao() {}
	
	public Posicao(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public boolean verificarOcupada() {
		return ocupante != 0;
	}

	/**
	 * @param linhaAdj
	 * @param colunaAdj
	 */
	public boolean verificarAdjacente(int linhaAdj, int colunaAdj) {
		int x1 = this.linha;
		int y1 = this.coluna;
		int x2 = linhaAdj;
		int y2 = colunaAdj;
		
		if(x1 == x2 && y1 == y2) {
			return false;
		}
		if(x2 >= x1-1 && x2 <= x1+1) {
			if(y2 >= y1-1 && y2 <= y1+1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param simbolo
	 */
	public void modOcupacao(int simbolo) {
		this.ocupante = simbolo;
	}

	public void esvaziar() {
		this.ocupante = 0;
	}

	public int informarOcupacao() {
		return this.ocupante;
	}

	public int informarLinha() {
		return this.linha;
	}

	public int informarColuna() {
		return this.coluna;
	}

	/**
	 * Define a posição incial das peças
	 */
	public int[][] getPosicaoInicialPecas() {
		// Posição inicial jogador 1
		posicaoInicialPeca[0][6] = 1;
		posicaoInicialPeca[1][5] = 1;
		posicaoInicialPeca[1][6] = 1;
		posicaoInicialPeca[2][5] = 1;
		posicaoInicialPeca[2][6] = 1;
		posicaoInicialPeca[2][7] = 1;
		posicaoInicialPeca[3][4] = 1;
		posicaoInicialPeca[3][5] = 1;
		posicaoInicialPeca[3][6] = 1;
		posicaoInicialPeca[3][7] = 1;

		// Posição inicial jogador 2
		posicaoInicialPeca[16][6] = 2;
		posicaoInicialPeca[15][5] = 2;
		posicaoInicialPeca[15][6] = 2;
		posicaoInicialPeca[14][5] = 2;
		posicaoInicialPeca[14][6] = 2;
		posicaoInicialPeca[14][7] = 2;
		posicaoInicialPeca[13][4] = 2;
		posicaoInicialPeca[13][5] = 2;
		posicaoInicialPeca[13][6] = 2;
		posicaoInicialPeca[13][7] = 2;
		
		return posicaoInicialPeca;
	}
}