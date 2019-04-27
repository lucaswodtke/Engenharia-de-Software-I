package damasChinesas;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javax.imageio.ImageIO;

public class TabuleiroView extends TelaAbstrato implements Observer {

	protected int valorInicialX = 170;
	protected int valorInicialY = 75;
	protected int alturaPeca = 27;
	protected int larguraPeca = 27;
	protected BufferedImage imagemPecaJogadores;
	protected BufferedImage imagemSelecionada;
	protected Campo campoSelecionado;
	protected Tabuleiro tabuleiro;

	Tabuleiro getBoard() {
		return tabuleiro;
	}

	/**
	 * Constructor
	 */
	public TabuleiroView(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		imagemSelecionada = construirImagemPeca("imagens/pecaSelecionada.png");
		addMouseListener(new gridListener());
		tabuleiro.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object object) {
		paint(getGraphics()); // Redesenha o tabuleiro
	}

	@Override
	public void paint(Graphics grafico) {

		int largura = valorInicialX;
		int altura = valorInicialY;
		boolean par = true;
		int x, y;

		for (y = 0; y < 17; y++) {
			for (x = 0; x < 13; x++) {
				if (tabuleiro.getPosicoes()[x][y].getPeca() != null) {
					switch (tabuleiro.getListaJogadores().indexOf(tabuleiro.getPosicoes()[x][y].getPeca().getDono())) {
					case 0:
						imagemPecaJogadores = construirImagemPeca("imagens/pecaVermelha.png");
						break;
					case 1:
						imagemPecaJogadores = construirImagemPeca("imagens/pecaAzul.png");
						break;
					default:
						imagemPecaJogadores = construirImagemPeca("imagens/casaVazia.png");
						break;
					}

					grafico.drawImage(imagemPecaJogadores, largura, altura, null);

				} else if (tabuleiro.getPosicoes()[x][y].getDisponivel()) {
					imagemPecaJogadores = construirImagemPeca("imagens/casaVazia.png");

					grafico.drawImage(imagemPecaJogadores, largura, altura, null);
				}

				largura += larguraPeca;
			}

			altura += alturaPeca;
			largura = valorInicialX;
			
			if (par) {
				largura += (larguraPeca / 2);
				par = false;
			} else {
				par = true;
			}
		}
	}

	/**
	 * Mouse listener
	 */
	private class gridListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent evento) {
			int pos_x, pos_y;

			// Fora dos limites do tabuleiro
			if (!(evento.getX() > valorInicialX && evento.getX() < 525 && evento.getY() > valorInicialY && evento.getY() < 544)) {
				return;
			}

			// Converte od pixels para números
			pos_x = ((evento.getX() - valorInicialX) / larguraPeca);
			pos_y = ((evento.getY() - valorInicialY) / alturaPeca);

			// Se o campo for par
			if (!(pos_y % 2 == 0)) {
				pos_x = (((evento.getX() - valorInicialX) + (larguraPeca / 2)) / larguraPeca) - 1;
			}

			if (campoSelecionado == null) {
				campoSelecionado = tabuleiro.getPosicoes()[pos_x][pos_y];
				desenhaSelecionado(pos_x, pos_y);
			} else {
				tabuleiro.mover();
				campoSelecionado = null;
			}
		}
	}

	/**
	 * Desenha a peça selecionada
	 */
	protected void desenhaSelecionado(int pos_x, int pos_y) {
		int largura = valorInicialX + (pos_x * larguraPeca);
		int altura = valorInicialY + (pos_y * alturaPeca);

		// for odd row
		if (!(pos_y % 2 == 0)) {
			largura += (larguraPeca / 2);
		}

		getGraphics().drawImage(imagemSelecionada, largura, altura, null);
	}

	public BufferedImage construirImagemPeca(String caminhoImagem) {
		File arquivoDeImagem = new File(caminhoImagem);
		BufferedImage imagem = null;

		try {
			imagem = ImageIO.read(arquivoDeImagem);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return imagem;
	}
}
