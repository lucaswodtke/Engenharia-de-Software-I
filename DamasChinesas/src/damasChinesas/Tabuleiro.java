package damasChinesas;

public class Tabuleiro extends TabuleiroAbstrato {

	protected Campo[][] campos;

	/**
	 * Constructor
	 */
	public Tabuleiro() {
		super();
		
		int[] ordem = {
                0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,
                0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,
                0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
                0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
                0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
                0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0,
        };

		campos = new Campo[13][17];

		int contador = 0;

		for (int y = 0; y < 17; y++) {
			for (int x = 0; x < 13; x++) {
				Campo posicao;
				
				if (ordem[contador] == 1) {
					posicao = new Campo(true, x, y);
				} else {
					posicao = new Campo(false, x, y);
				}
				
				campos[x][y] = posicao;
				contador++;
			}
		}

		configuracaoJogadores();
	}

	public Campo[][] getPosicoes() {
		return campos;
	}

	public void mover() {
		proximoJogador();
	}

	/**
	 * Adiciona os jogadores
	 */
	private void configuracaoJogadores() {
		adicionarJogador("Jogador 1");
		campos[6][0].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[5][1].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[6][1].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[5][2].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[6][2].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[7][2].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[4][3].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[5][3].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[6][3].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[7][3].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		
		adicionarJogador("Jogador 2");
		campos[6][16].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[5][15].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[6][15].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[5][14].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[6][14].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[7][14].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[4][13].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[5][13].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[6][13].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
		campos[7][13].setPeca(new Peca(getListaJogadores().get(getListaJogadores().size() - 1)));
	}
}