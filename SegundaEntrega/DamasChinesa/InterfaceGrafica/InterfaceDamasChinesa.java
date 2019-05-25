package InterfaceGrafica;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Rectangle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import DominioDoProblema.ImagemTabuleiro;
import DominioDoProblema.Posicao;
import DominioDoProblema.Tabuleiro;
import InterfaceGrafica.AtorJogador;

public class InterfaceDamasChinesa extends JFrame implements Constantes {

	private static final long serialVersionUID = 1L;

	protected AtorJogador jogo;
	protected Tabuleiro tabuleiro = new Tabuleiro();

	protected int valorInicialX = 170;
	protected int valorInicialY = 75;
	protected int alturaPeca = 27;
	protected int larguraPeca = 27;
	protected boolean posicaoSelecionada = false;

	private JPanel jContentPane = null;

	protected boolean emRede = false;

	private JLabel vPosicao[][] = new JLabel[17][13];

	protected JLabel mapaVPosicao[][] = new JLabel[17][13];

	private JMenuBar jMenuBar1 = null;

	private JMenu menuJogo = null;

	private JMenuItem jMenuItem1 = null;

	private JMenuItem jMenuItem2 = null;

	private JMenuItem jMenuItem3 = null;

	private JLabel vMensagem = null;
	
	protected Tabuleiro tab;

	public InterfaceDamasChinesa() throws HeadlessException {
		super();
		initialize();
	}

	public InterfaceDamasChinesa(GraphicsConfiguration arg0) {
		super(arg0);
		initialize();
	}

	public InterfaceDamasChinesa(String arg0) throws HeadlessException {
		super(arg0);
		initialize();
	}

	public InterfaceDamasChinesa(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		initialize();
	}

	private void initialize() {
		this.setSize(720, 630);
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("Damas Chinesa");

		jogo = new AtorJogador(this);
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {

			int[][] ordem = tabuleiro.getPorcaoAtivaTabuleiro();
			int[][] posicaoXY = new int[2][2];
			Icon[][] posicaoAnterior = new Icon[17][13];

			int largura = this.valorInicialX;
			int altura = this.valorInicialY;
			boolean par = true;

			Icon vazia = new ImageIcon(getClass().getResource("/Imagens/casaVazia.png"));
			Icon selecionada = new ImageIcon(getClass().getResource("/Imagens/pecaSelecionada.png"));

			vMensagem = new JLabel();
			vMensagem.setBounds(new Rectangle(25, 10, 500, 20));
			vMensagem.setText("Damas Chinesa");

			jContentPane = new JPanel();
			jContentPane.setLayout(null);

			for (int x = 0; x < 17; x++) {
				for (int y = 0; y < 13; y++) {
					vPosicao[x][y] = new JLabel();
					vPosicao[x][y].setBounds(new Rectangle(largura, altura, 27, 27));

					if (ordem[x][y] == 1) {
						vPosicao[x][y].setIcon(vazia);
					} else {
						vPosicao[x][y].setIcon(null);
					}

					int posX = x;
					int posY = y;
					vPosicao[x][y].addMouseListener(new java.awt.event.MouseAdapter() {
						public void mouseClicked(java.awt.event.MouseEvent e) {
							if (!posicaoSelecionada) {
								posicaoSelecionada = true;

								posicaoXY[0][0] = posX;
								posicaoXY[0][1] = posY;

								posicaoAnterior[posX][posY] = mapaVPosicao[posX][posY].getIcon();
								
								String iconeSelecionado = posicaoAnterior[posicaoXY[0][0]][posicaoXY[0][1]].toString();
								Icon selecionado = new ImageIcon();
								
								if (iconeSelecionado.contains("pecaVermelha")) {
									selecionado = new ImageIcon(getClass().getResource("/Imagens/pecaVermelhaSelecionada.png"));
								} else if (iconeSelecionado.contains("pecaAzul")) {
									selecionado = new ImageIcon(getClass().getResource("/Imagens/pecaAzulSelecionada.png"));
								} else {
									selecionado = new ImageIcon(getClass().getResource("/Imagens/casaVaziaSelecionada.png"));
								}
								
								mapaVPosicao[posX][posY].setIcon(selecionado);
							} else {
								posicaoSelecionada = false;

								posicaoXY[1][0] = posX;
								posicaoXY[1][1] = posY;

								if ((posicaoXY[0][0] == posX) && (posicaoXY[0][1] == posY)) {
									mapaVPosicao[posicaoXY[0][0]][posicaoXY[0][1]].setIcon(posicaoAnterior[posicaoXY[0][0]][posicaoXY[0][1]]);
								} else {
									click(posicaoXY[0][0], posicaoXY[0][1], posX, posY);
								}
							}
						}
					});

					jContentPane.add(vPosicao[x][y], null);
					mapaVPosicao[x][y] = vPosicao[x][y];

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

			jMenuBar1 = new JMenuBar();
			jMenuBar1.add(getMenu());
			this.setJMenuBar(jMenuBar1);

			jContentPane.add(vMensagem, null);
		}
		return jContentPane;
	}

	private JMenu getMenu() {
		if (menuJogo == null) {
			menuJogo = new JMenu();
			menuJogo.setText("Jogo");
			menuJogo.setBounds(new Rectangle(1, 0, 57, 21));
			menuJogo.add(getJMenuItem1());
			menuJogo.add(getJMenuItem2());
			menuJogo.add(getJMenuItem3());

		}
		return menuJogo;
	}

	private JMenuItem getJMenuItem1() {
		if (jMenuItem1 == null) {
			jMenuItem1 = new JMenuItem();
			jMenuItem1.setText("Iniciar Nova Partida");
			jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					iniciarPartida();
				}
			});
		}
		return jMenuItem1;
	}

	private JMenuItem getJMenuItem2() {
		if (jMenuItem2 == null) {
			jMenuItem2 = new JMenuItem();
			jMenuItem2.setText("Conectar");
			jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					conectar();
				}
			});
		}
		return jMenuItem2;
	}

	private JMenuItem getJMenuItem3() {
		if (jMenuItem3 == null) {
			jMenuItem3 = new JMenuItem();
			jMenuItem3.setText("Desconectar");
			jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					desconectar();
				}
			});
		}
		return jMenuItem3;
	}

	public void conectar() {
		int resultado = jogo.conectar();
		this.notificarResultado(resultado);
	}

	public String obterServidor() {
		String idServidor = ("netgames.labsoft.ufsc.br");
//		idServidor = JOptionPane.showInputDialog(this, ("Insira o endereço do servidor"), idServidor);
		return idServidor;
	}

	public String obterIdJogador() {
		String idJogador = ("jogador");
//		idJogador = JOptionPane.showInputDialog(this, ("Insira o nome do jogador"));
		return idJogador;
	}

	/**
	 * @param resultado
	 */
	public void notificarResultado(int resultado) {
		switch (resultado) {
		case SUCESSO_CONEXAO:
			JOptionPane.showMessageDialog(this, "Conexão efetuada com sucesso");
			break;
		case CONEXAO_ESTABELECIDA:
			JOptionPane.showMessageDialog(this, "Tentativa de conexão com conexão previamente estabelecida");
			break;
		case ERRO_CONEXAO:
			JOptionPane.showMessageDialog(this, "Tentativa de conexao falhou");
			break;
		case DESCONEXAO_SUCESSO:
			JOptionPane.showMessageDialog(this, "Desonexão efetuada com sucesso");
			break;
		case DESCONEXAO_ESTABELECIDA:
			JOptionPane.showMessageDialog(this, "Tentativa de desconexao sem conexao previamente estabelecida");
			break;
		case ERRO_DESCONEXAO:
			JOptionPane.showMessageDialog(this, "Tentativa de desconexao falhou");
			break;
		case INICIO_PARTIDA_SUCESSO:
			JOptionPane.showMessageDialog(this, "Solicitação de inicio procedida com sucesso!");
			break;
		case INICIO_PARTIDA_ESTABELECIDA:
			JOptionPane.showMessageDialog(this, "Tentativa de inicio sem conexao previamente estabelecida");
			break;
		case NAO_EH_VEZ:
			JOptionPane.showMessageDialog(this, "Não é a sua vez");
			break;
		case PARTIDA_ENCERRADA:
			JOptionPane.showMessageDialog(this, "Partida encerrada");
			break;
		case LANCE_OK:
			JOptionPane.showMessageDialog(this, "Lance OK");
			break;
		case POSICAO_OCUPADA:
			JOptionPane.showMessageDialog(this, "Posição ocupada");
			break;
		case POSICAO_ILEGAL:
			JOptionPane.showMessageDialog(this, "Posição ilegal");
			break;
		case PARTIDA_NAO_INTERROMPIDA:
			JOptionPane.showMessageDialog(this, "Partida corrente não interrompida");
			break;
		};
	}

	public void desconectar() {
		int resultado = jogo.desconectar();
		this.notificarResultado(resultado);
	}

	public void iniciarPartida() {
		int resultado = jogo.iniciarPartida();
		this.notificarResultado(resultado);
	}

	public void exibirEstado() {
		ImagemTabuleiro estado;
		estado = jogo.informarEstado();
		this.atualizar(estado);
	}
	
	/**
	 * @param linha
	 * @param coluna
	 */
	public void click(int linha1, int coluna1, int linha2, int coluna2) {
		int resultado = 0;
		resultado = jogo.click(linha1, coluna1, linha2, coluna2);
		
		if ((resultado == LANCE_OK) || (resultado == PARTIDA_ENCERRADA)) {
			this.exibirEstado();
		} else {
			this.notificarResultado(resultado);
		}
	}

	/**
	 * @param estado
	 */
	public void atualizar(ImagemTabuleiro estado) {
		int valor = 0;

		vMensagem.setText(estado.informarMensagem());

		Icon vermelha = new ImageIcon(getClass().getResource("/Imagens/pecaVermelha.png"));
		Icon azul = new ImageIcon(getClass().getResource("/Imagens/pecaAzul.png"));
		Icon vazia = new ImageIcon(getClass().getResource("/Imagens/casaVazia.png"));


		for (int linha = 0; linha < 17; linha++) {
			for (int coluna = 0; coluna < 13; coluna++) {
				valor = estado.informarValor(linha, coluna);

				switch (valor) {
				case 0:
					if (tabuleiro.informarEmAndamento()) {
						mapaVPosicao[linha][coluna].setIcon(vazia);
					}
					break;
				case 1:
					mapaVPosicao[linha][coluna].setIcon(vermelha);
					break;
				case 2:
					mapaVPosicao[linha][coluna].setIcon(azul);
					break;
				case 3:
					mapaVPosicao[linha][coluna].setIcon(vazia);
					break;
				}
			};
		};
	}
}