package DominioDoProblema;

public class Posicao {

	protected int ocupante = 0;
	protected int linha;
	protected int coluna;
	private boolean caminhoEncontrado = false;
	protected Tabuleiro tab = new Tabuleiro();

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
	public boolean verificarAdjacente(int linhaAdj1, int colunaAdj1, int linhaAdj2, int colunaAdj2, Posicao[][] posicoes) {
		int x1 = linhaAdj1;
		int y1 = colunaAdj1;
		int x2 = linhaAdj2;
		int y2 = colunaAdj2;
		boolean status = false;
		int[][] porcaoAtivaTabuleiro = tab.getPorcaoAtivaTabuleiro();
		
		// Verifica se a segunda posição clicada é uma parte válida do tabuleiro
		boolean posicaoAtiva = porcaoAtivaTabuleiro[x2][y2] == 1;
		
		if (x1 == x2 && y1 == y2) {
			status = false;
		}
		
		// TODO: Verificar se pertence a parte ativa do tabuleiro
		boolean ocupada = false;
		if (x2 > x1) {
			if (y2 > y1) {
				ocupada = posicoes[x1+1][y2].verificarOcupada();
				if (x1+1 == 4 || x1+1 == 12) {
					System.out.println("1");
					ocupada = posicoes[x1+1][y1].verificarOcupada();
				}
			} else {
				ocupada = posicoes[x1+1][y1-1].verificarOcupada();
				if (x1+1 == 4 || x1+1 == 12) {
					System.out.println("2");
					ocupada = posicoes[x1+1][y1].verificarOcupada();
				}
			}
		} else {
			if (y2 > y1) {
				ocupada = posicoes[x1-1][y2].verificarOcupada();
				if (x1-1 == 4 || x1-1 == 8 || x1-1 == 12) {
					System.out.println("3");
					ocupada = posicoes[x1-1][y1].verificarOcupada();
				}
			} else {
				ocupada = posicoes[x1-1][y1-1].verificarOcupada();
				if (x1-1 == 4 || x1-1 == 8 || x1-1 == 12) {
					System.out.println("4");
					ocupada = posicoes[x1-1][y1].verificarOcupada();
				}
			}
		}
		
		
		// Verifica se existe uma posição livre pulando por cima de UMA UNICA outra peça
		if (x1 == x2) {		
			if ((y2 == y1 + 1 || y2 == y1 - 1) && ocupada) {
				status = true;
			}
		} else if ((y2 == y1 - 1 || y2 == y1 + 1) && ocupada) {
			if (x1 % 2 == 0) {
				if ((x2 == x1 - 2 && y2 > y1) || (x2 == x1 - 2 && y2 < y1) || (x2 == x1 + 2 && y2 > y1) || (x2 == x1 + 2 && y2 < y1)){
					status = true;
				}
			} else {
				if ((x2 == x1 - 2 && y2 < y1) || (x2 == x1 - 2 && y2 > y1) || (x2 == x1 + 2 && y2 < y1) || (x2 == x1 + 2 && y2 > y1)){
					status = true;
				}
			}
		}
		
		return status && posicaoAtiva;
	}
	
	/**
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param maior
	 */
	public boolean verificarAdjacente(int x1, int y1, int x2, int y2, boolean maior, Posicao[][] posicoes) { // TODO: quebrar funções
		boolean status = false;
		
//		 Verifica se é adjacente
		if (x1 == x2) {
			if (y2 == y1 + 1 || y2 == y1 - 1) {
				status = true;
			}
		} else if (y2 == y1 || y2 == y1 - 1 || y2 == y1 + 1) {
			if (x1 % 2 == 0) {
				if ((x2 == x1 - 1 && y2 <= y1) || (x2 == x1 + 1 && y2 <= y1)){
					status = true;
				}
			} else {
				if ((x2 == x1 - 1 && y2 >= y1) || (x2 == x1 + 1 && y2 >= y1)){
					status = true;
				}
			}
		}
		
		// TODO: Colocar, em um array ou lista, se existe caminho entre (x1, y1) e (x2, x2) e depois usar isso para/como o retorno
		if (!status) {
			if (maior) {
				for (int linha = x1; linha <= x2; linha++) {
					if (y2 >= y1) {
						for (int coluna = y1; coluna <= y2; coluna++) {
							boolean valido = this.verificarAdjacente(x1, y1, linha, coluna, posicoes);
							
							if (valido) {
								if (linha == x2 && coluna == y2) {
									caminhoEncontrado = true;
									return true;
								} else {
									this.verificarAdjacente(linha, coluna, x2, y2, maior, posicoes);
								}
							}
						}
					} else {
						for (int coluna = y1; coluna >= y2; coluna--) {
							boolean valido = this.verificarAdjacente(x1, y1, linha, coluna, posicoes);
							
							if (valido) {
								if (linha == x2 && coluna == y2) {
									caminhoEncontrado = true;
									return true;
								} else {
									this.verificarAdjacente(linha, coluna, x2, y2, maior, posicoes);
								}
							}
						}
					}
				}
			} else {
				for (int linha = x1; linha >= x2; linha--) {
					if (y2 >= y1) {
						for (int coluna = y1; coluna <= y2; coluna++) {
							boolean valido = this.verificarAdjacente(x1, y1, linha, coluna, posicoes);
							
							if (valido) {
								if (linha == x2 && coluna == y2) {
									caminhoEncontrado = true;
									return true;
								} else {
									this.verificarAdjacente(linha, coluna, x2, y2, maior, posicoes);
								}
							}
						}
					} else {
						for (int coluna = y1; coluna >= y2; coluna--) {
							boolean valido = this.verificarAdjacente(x1, y1, linha, coluna, posicoes);
							
							if (valido) {
								if (linha == x2 && coluna == y2) {
									caminhoEncontrado = true;
									return true;
								} else {
									this.verificarAdjacente(linha, coluna, x2, y2, maior, posicoes);
								}
							}
						}
					}
				}
			}
		} else {
			caminhoEncontrado = true;
			return true;
		}

		if (!caminhoEncontrado) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * @param simbolo
	 */
	public void modOcupacao(int simbolo) {
		this.ocupante = simbolo;
	}

	public void esvaziar() {
//		this.ocupante=0;
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
}