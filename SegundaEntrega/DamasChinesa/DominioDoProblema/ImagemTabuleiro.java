package DominioDoProblema;

public class ImagemTabuleiro {

	protected String mensagem;
	protected int mapa[][] = new int[17][13];

	public void assumirMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void assumirValor(int linha, int coluna, int valor) {
		mapa[linha][coluna] = valor;
	}

	public String informarMensagem() {
		return this.mensagem;
	}

	public int informarValor(int linha, int coluna) {
		return this.mapa[linha][coluna];
	}
}