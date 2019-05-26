package InterfaceGrafica;

import DominioDoProblema.*;
import Rede.AtorNetGames;

public class AtorJogador implements Constantes {

	protected Tabuleiro tab;
	protected AtorNetGames rede;
	protected String idUsuario;
	protected InterfaceDamasChinesa janela;

	public AtorJogador(InterfaceDamasChinesa jan) {
		super();
		
		rede = new AtorNetGames(this);
		janela = jan;
		tab = new Tabuleiro();
		tab.iniciar();
	}

	public InterfaceDamasChinesa informarJanela() {
		return this.janela;
	}

	/**
	 * @param posicao
	 */
	public void iniciarNovaPartida(Integer posicao) {
		tab.esvaziar();
		tab.criarJogador(idUsuario);
		String idJogador = rede.informarNomeAdversario(idUsuario);
		tab.criarJogador(idJogador);
		tab.habilitar(posicao);
		janela.exibirEstado();
	}

	public int conectar() {
		boolean conectado = tab.informarConectado();
		
		if (!conectado) {
			String servidor = janela.obterServidor();
			idUsuario = janela.obterIdJogador();
			boolean exito = rede.conectar(servidor, idUsuario);
			
			if (exito) {
				tab.estabelecerConectado(true);
				return SUCESSO_CONEXAO;
			} else {
				return ERRO_CONEXAO;
			}
		}
		
		return CONEXAO_ESTABELECIDA;
	}

	public int desconectar() {
		boolean conectado = tab.informarConectado();
		
		if (conectado) {
			boolean exito = rede.desconectar();
			if (exito) {
				tab.estabelecerConectado(false);
				return DESCONEXAO_SUCESSO;
			} else {
				return ERRO_DESCONEXAO;
			}
		}
		
		return DESCONEXAO_ESTABELECIDA;
	}

	public int iniciarPartida() {
		boolean emAndamento = tab.informarEmAndamento();
		boolean interromper = false;
		boolean conectado = false;
		
		if (emAndamento) {
			interromper = avaliarInterrupcao();
		} else {
			conectado = tab.informarConectado();
		}
		
		if (interromper || (!emAndamento && conectado)) {
			rede.iniciarPartida();
			return INICIO_PARTIDA_SUCESSO;
		}
		
		if (!conectado) {
			return INICIO_PARTIDA_ESTABELECIDA;
		}
		
		return PARTIDA_NAO_INTERROMPIDA;
	}

	private boolean avaliarInterrupcao() {
		return true;
	}
	
	/**
	 * @param linha
	 * @param coluna
	 */
//	public int click(int linha1, int coluna1, int linha2, int coluna2) {
//		int resultado = tab.click(linha1, coluna1, linha2, coluna2);
//
//		if (resultado == LANCE_OK || resultado == PARTIDA_ENCERRADA) {
//			enviarJogada(linha1, coluna1, linha2, coluna2);
//		}
//
//		return resultado;
//	}
	
	/**
	 * @param linha
	 * @param coluna
	 */
	public int click(int linha1, int coluna1, int linha2, int coluna2) {
		int resultado = tab.click(linha1, coluna1, linha2, coluna2);

		if (resultado == LANCE_OK || resultado == PARTIDA_ENCERRADA) {
			enviarJogada(linha1, coluna1, linha2, coluna2);
		}

		return resultado;
	}

	/**
	 * @param linha
	 * @param coluna
	 */
	public void enviarJogada(int linha, int coluna) {
		Lance lance = tab.informarJogada(linha, coluna);
		rede.enviarJogada(lance);
	}
	
	/**
	 * @param linha
	 * @param coluna
	 */
	public void enviarJogada(int linha1, int coluna1, int linha2, int coluna2) {
		Lance lance = tab.informarJogada(linha1, coluna1, linha2, coluna2);
		rede.enviarJogada(lance);
	}
	

	/**
	 * 
	 * @param jogada
	 */
	public void receberJogada(Lance jogada) {
		tab.receberJogada(jogada);
		janela.exibirEstado();
	}

	public ImagemTabuleiro informarEstado() {
		return tab.informarEstado();
	}

}