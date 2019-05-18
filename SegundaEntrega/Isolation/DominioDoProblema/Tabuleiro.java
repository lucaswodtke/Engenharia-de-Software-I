package DominioDoProblema;

import InterfaceGrafica.Constantes;

public class Tabuleiro implements Constantes {

	protected Jogador jogador1;
	protected Jogador jogador2;
	protected Posicao posicoes[][] = new Posicao[17][13];
	protected boolean conectado;
	protected boolean partidaEmAndamento;

	public boolean informarConectado() {
		return conectado;
	}

	/**
	 * @param valor
	 */
	public void estabelecerConectado(boolean valor) {
		conectado = valor;
	}

	public boolean informarEmAndamento() {
		return partidaEmAndamento;
	}

	public void esvaziar() {
		for (int i = 0; i < 17; i++) {
			for (int n = 0; n < 13; n++) {
				posicoes[i][n].esvaziar();
			}
		}

		jogador1 = null;
		jogador2 = null;
		partidaEmAndamento = false;
	}

	/**
	 * @param idJogador
	 */
	public void criarJogador(String idJogador) {
		if (jogador1 == null) {
			jogador1 = new Jogador();
			jogador1.iniciar();
			jogador1.assumirNome(idJogador);
		} else {
			jogador2 = new Jogador();
			jogador2.iniciar();
			jogador2.assumirNome(idJogador);
		}
	}

	/**
	 * @param posicao
	 */
	public void habilitar(Integer posicao) {
		if (posicao == 1) {
			jogador1.mudarFase();
			jogador1.assumirCor(1);
			jogador2.assumirCor(2);
			posicionarPeca(jogador1, jogador2);
		} else {
			jogador2.mudarFase();
			jogador2.assumirCor(1);
			jogador1.assumirCor(2);
			posicionarPeca(jogador2, jogador1);
		}
		
		partidaEmAndamento = true;
	}

	/**
	 * @param jog1
	 * @param jog2
	 */
	public void posicionarPeca(Jogador jog1, Jogador jog2) {
		int peca1;
		int peca2;
		
		// POSIÇÃO INICIAL JOGADOR 1

		peca1 = jog1.simbolo;

		jog1.atualizar(posicoes[0][6]);
		posicoes[0][6].modOcupacao(peca1);

		jog1.atualizar(posicoes[1][5]);
		posicoes[1][5].modOcupacao(peca1);

		jog1.atualizar(posicoes[1][6]);
		posicoes[1][6].modOcupacao(peca1);

		jog1.atualizar(posicoes[2][5]);
		posicoes[2][5].modOcupacao(peca1);

		jog1.atualizar(posicoes[2][6]);
		posicoes[2][6].modOcupacao(peca1);

		jog1.atualizar(posicoes[2][7]);
		posicoes[2][7].modOcupacao(peca1);

		jog1.atualizar(posicoes[3][4]);
		posicoes[3][4].modOcupacao(peca1);

		jog1.atualizar(posicoes[3][5]);
		posicoes[3][5].modOcupacao(peca1);

		jog1.atualizar(posicoes[3][6]);
		posicoes[3][6].modOcupacao(peca1);

		jog1.atualizar(posicoes[3][7]);
		posicoes[3][7].modOcupacao(peca1);

		// POSIÇÃO INICIAL JOGADOR 2

		peca2 = jog2.simbolo;

		jog2.atualizar(posicoes[16][6]);
		posicoes[16][6].modOcupacao(peca2);

		jog2.atualizar(posicoes[15][5]);
		posicoes[15][5].modOcupacao(peca2);

		jog2.atualizar(posicoes[15][6]);
		posicoes[15][6].modOcupacao(peca2);

		jog2.atualizar(posicoes[14][5]);
		posicoes[14][5].modOcupacao(peca2);

		jog2.atualizar(posicoes[14][6]);
		posicoes[14][6].modOcupacao(peca2);

		jog2.atualizar(posicoes[14][7]);
		posicoes[14][7].modOcupacao(peca2);

		jog2.atualizar(posicoes[13][4]);
		posicoes[13][4].modOcupacao(peca2);

		jog2.atualizar(posicoes[13][5]);
		posicoes[13][5].modOcupacao(peca2);

		jog2.atualizar(posicoes[13][6]);
		posicoes[13][6].modOcupacao(peca2);

		jog2.atualizar(posicoes[13][7]);
		posicoes[13][7].modOcupacao(peca2);
	}
	
	/**
	 * @param linha
	 * @param coluna
	 */
	public int click(int linha1, int coluna1, int linha2, int coluna2) {
		int resultado;
		boolean vez;

		vez = jogador1.informarDaVez();
		if (vez) {
			resultado = tratarLance(linha1, coluna1, linha2, coluna2, jogador1);
		} else {
			resultado = NAO_EH_VEZ;
		}

		return resultado;
	}

	/**
	 * @param linha
	 * @param coluna
	 */
	public Lance informarJogada(int linha, int coluna) {
		Lance lance;

		lance = new Lance();
		lance.assumir(linha, coluna);

		return lance;
	}
	
	/**
	 * @param linha
	 * @param coluna
	 */
	public Lance informarJogada(int linha1, int coluna1, int linha2, int coluna2) {
		Lance lance;

		lance = new Lance();
		lance.assumir(linha1, coluna1, linha2, coluna2);

		return lance;
	}
	
	/**
	 * @param lance
	 */
	public void receberJogada(Lance lance) {
		int linha1, coluna1, linha2, coluna2;
		
		linha1 = lance.informarLinha1();
		coluna1 = lance.informarColuna1();
		
		linha2 = lance.informarLinha2();
		coluna2 = lance.informarColuna2();

		tratarLance(linha1, coluna1, linha2, coluna2, jogador2);
	}

	public void finalizarPartida() {
		partidaEmAndamento = false;

		jogador1.desabilitar();
		jogador2.desabilitar();
	}
	
	/**
	 * @param linha
	 * @param coluna
	 * @param jog
	 */
	public int tratarLance(int linha1, int coluna1, int linha2, int coluna2, Jogador jog) {
		int resultado;
		boolean ocupada = posicoes[linha2][coluna2].verificarOcupada();
		int[][] porcaoAtivaTabuleiro = this.getPorcaoAtivaTabuleiro();

		if (ocupada || porcaoAtivaTabuleiro[linha2][coluna2] == 0) {
			resultado = POSICAO_OCUPADA;
		} else {
			boolean linha2MaiorLinha1 = linha2 > linha1;
			boolean adjacente = jog.verificarAdjacente(linha1, coluna1, linha2, coluna2, linha2MaiorLinha1, posicoes);
			
			if (adjacente) {
				jog.atualizar(posicoes[linha2][coluna2]);
				
//				boolean vencedor = verificarVencedor();
				boolean vencedor = false;
				
				if (vencedor) {
					resultado = PARTIDA_ENCERRADA;
					finalizarPartida();
				} else {
					resultado = LANCE_OK;
					passarVez();
				}
			} else {
				resultado = POSICAO_ILEGAL;
			}
		}
		
		return resultado;
	}

	public boolean verificarVencedor() {
		Posicao posicao = jogador1.informarPosicao();
		boolean perdeu = verificarPerdeu(posicao);
		
		if (perdeu) {
			jogador2.assumirVencedor();
			return true;
		}
		
		posicao = jogador2.informarPosicao();
		perdeu = verificarPerdeu(posicao);
		
		if (perdeu) {
			jogador1.assumirVencedor();
			return true;
		}
		
		return false;
	}

	public void passarVez() {
		jogador1.mudarFase();
		jogador2.mudarFase();
	}

	/**
	 * @param posicao
	 */
	public boolean verificarPerdeu(Posicao posicao) {
		int x, y, l, c, yI;
		
		x = posicao.informarLinha() - 1;
		y = posicao.informarColuna() - 1;
		
		if (x < 0) {
			x = 0;
		}
		
		if (y < 0) {
			y = 0;
		}
		
		yI = y;
		l = posicao.informarLinha() + 1;
		c = posicao.informarColuna() + 1;
		
		if (l > 6) {
			l = 6;
		}
		
		if (c > 6) {
			c = 6;
		}
		
		while (x <= l) {
			while (y <= c) {
				boolean ocupada = false;
				ocupada = posicoes[x][y].verificarOcupada();
				
				if (!ocupada) {
					return false;
				}
				
				y++;
			}
			
			x++;
			y = yI;
		}
		
		return true;
	}

	public ImagemTabuleiro informarEstado() {
		ImagemTabuleiro retorno = new ImagemTabuleiro();
		String mensagem;
		
		if (partidaEmAndamento) {
			boolean vez = jogador1.informarDaVez();
			
			if (vez) {
				int peca = jogador1.informarSimbolo();
				String cor = (peca == 1) ? "Vermelha" : "Azul";
				
				mensagem = "Vez do jogador " + jogador1.informarNome() + " com peças da cor " + cor;
			} else {
				int peca = jogador2.informarSimbolo();
				String cor = (peca == 1) ? "Vermelha" : "Azul";
				
				mensagem = "Vez do jogador " + jogador2.informarNome() + " com peças da cor " + cor;
			}
		} else {
			boolean vencedor = jogador2.informarVencedor();
			
			mensagem = "VENCEDOR: " + jogador2.informarNome();
			if (vencedor) {
				mensagem = "VENCEDOR: " + jogador1.informarNome();
			}
		}

		retorno.assumirMensagem(mensagem);

		int[][] porcaoAtivaTabuleiro = this.getPorcaoAtivaTabuleiro();

		for (int linha = 0; linha < 17; linha++) {
			for (int coluna = 0; coluna < 13; coluna++) {
				
				if (porcaoAtivaTabuleiro[linha][coluna] == 1) {
					int valor = posicoes[linha][coluna].informarOcupacao();
					retorno.assumirValor(linha, coluna, valor);
				}
			}
		}
		
		return retorno;
	}

	public void iniciar() {
		for (int linha = 0; linha < 17; linha++) {
			for (int coluna = 0; coluna < 13; coluna++) {
				posicoes[linha][coluna] = new Posicao(linha, coluna);
			}
		}
	}

	/**
	 * Retorna, com 1, a porção ativa do tabuleiro
	 */
	public int[][] getPorcaoAtivaTabuleiro() {
		int[][] ordem = { 
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, 
			{ 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 }, 
			{ 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
			{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, 
			{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
			{ 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 }, 
			{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
			{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, 
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
			{ 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 }, 
			{ 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 } 
		};

		return ordem;
	}
}