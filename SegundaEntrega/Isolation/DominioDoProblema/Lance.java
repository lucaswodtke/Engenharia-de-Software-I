package DominioDoProblema;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Lance implements Jogada {

	protected int linha1;
	protected int coluna1;
	
	protected int linha2;
	protected int coluna2;

	/**
	 * @param linha
	 * @param coluna
	 */
	public void assumir(int linha, int coluna) {
		this.linha1 = linha;
		this.coluna1 = coluna;
	}
	
	/**
	 * @param linha
	 * @param coluna
	 */
	public void assumir(int linha1, int coluna1, int linha2, int coluna2) {
		this.linha1 = linha1;
		this.coluna1 = coluna1;
		
		this.linha2 = linha2;
		this.coluna2 = coluna2;
	}

	public int informarLinha1() {
		return this.linha1;
	}

	public int informarColuna1() {
		return this.coluna1;
	}
	
	public int informarLinha2() {
		return this.linha2;
	}

	public int informarColuna2() {
		return this.coluna2;
	}
}