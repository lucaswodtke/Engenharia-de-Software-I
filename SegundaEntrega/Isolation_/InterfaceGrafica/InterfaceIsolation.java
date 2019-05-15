package InterfaceGrafica;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.lang.reflect.Array;
import java.util.Arrays;

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

public class InterfaceIsolation extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	protected AtorJogador jogo;
	protected Tabuleiro tabuleiro = new Tabuleiro();
	protected Posicao posicao = new Posicao();
	
	protected JLabel mapaVPosicao[][] = new JLabel[17][13];
	
	protected int valorInicialX = 170;
	protected int valorInicialY = 75;
	protected int alturaPeca = 27;
	protected int larguraPeca = 27;
	
	protected boolean clicado = false;
	protected JLabel posicaoSelecionada[] = new JLabel[2];
	protected Icon imagemPecaSelecionada = new ImageIcon();
	
	protected boolean emRede = false;
	private JLabel vMensagem = null;
	
	public InterfaceIsolation() throws HeadlessException {
		super();
		initialize();
	}

	public InterfaceIsolation(GraphicsConfiguration arg0) {
		super(arg0);
		initialize();
	}

	public InterfaceIsolation(String arg0) throws HeadlessException {
		super(arg0);
		initialize();
	}

	public InterfaceIsolation(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		initialize();
	}
	
	private void initialize() {
		this.setSize(700, 610);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("Damas Chinesa");
		
		jogo = new AtorJogador(this);
	}
	
	private JPanel jContentPane = null;
	
	private JPanel getJContentPane() {
		if(jContentPane == null) {
			
			jContentPane = new JPanel();
			
			int[][] ordem = tabuleiro.getPorcaoAtivaTabuleiro();
			
			int largura = this.valorInicialX;
			int altura = this.valorInicialY;
			boolean par = true;
			
			JMenuBar menuBar = new JMenuBar();
			menuBar.add(getMenu());
		    this.setJMenuBar(menuBar);
			
			// Inicializa a posição das peças
		    int[][] posicaoInicialPeca = posicao.getPosicaoInicialPecas();
			
			for(int x = 0; x < 17; x++){
					for(int y = 0; y < 13; y++){
					
					JLabel posicaoPeca = new JLabel();
					posicaoPeca.setBounds(new Rectangle(largura, altura, 27, 27));
					
					Icon imagemPeca;
					switch (posicaoInicialPeca[x][y]) {
					case 1:
						imagemPeca = new ImageIcon(getClass().getResource("pecaVermelha.png"));
						break;
					case 2:
						imagemPeca = new ImageIcon(getClass().getResource("pecaAzul.png"));
						break;
					default:
						imagemPeca = new ImageIcon(getClass().getResource("casaVazia.png"));
						break;
					}
					
					if (ordem[x][y] == 1) {
						posicaoPeca.setIcon(imagemPeca);
					} else {
						posicaoPeca.setIcon(null);
					}
					
					jContentPane.setLayout(null);
					jContentPane.add(posicaoPeca, null);
					
					mapaVPosicao[x][y] = posicaoPeca;
					largura += larguraPeca;
					
					// Adiciona a função de clique, caso seja uma posição válida do tabuleiro 
					if (ordem[x][y] == 1) {
						int posX = x;
						int posY = y;
						posicaoPeca.addMouseListener(new java.awt.event.MouseAdapter() {
							public void mouseClicked(java.awt.event.MouseEvent evento) {
								
								if (clicado == false) {
									clicado = true;
									posicaoSelecionada[0] = posicaoPeca;
									imagemPecaSelecionada = imagemPeca;

									pos[0][0] = posX;
									pos[0][1] = posY;
								} else {
									clicado = false;
									posicaoSelecionada[1] = posicaoPeca;
									pos[1][0] = posX;
									pos[1][1] = posY;
//									desenhaSelecionado();
									click(pos[1][0],pos[1][1]);
								}
							}
						});
					}
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
		return jContentPane;
	}
	
	int pos[][] = new int[2][2];
	
	private JMenu getMenu() {
		JMenu menu = new JMenu();
		menu.setText("Jogo");
		menu.setBounds(new Rectangle(1, 0, 57, 21));
		menu.add(getJMenuItem1());
		menu.add(getJMenuItem2());
		menu.add(getJMenuItem3());
		
		return menu;
	}

	private JMenuItem getJMenuItem1() {
		JMenuItem itemMenu = new JMenuItem();
		itemMenu.setText("Iniciar Nova Partida");
		itemMenu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				iniciarPartida();
			}
		});
		
		return itemMenu;
	}

	private JMenuItem getJMenuItem2() {
		JMenuItem itemMenu = new JMenuItem();
		itemMenu.setText("Conectar");
		itemMenu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				conectar();
			}
		});
		
		return itemMenu;
	}

	private JMenuItem getJMenuItem3() {
		JMenuItem itemMenu = new JMenuItem();
		itemMenu.setText("Desconectar");
		itemMenu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				desconectar();
			}
		});
		
		return itemMenu;
	}

	public void conectar() {
		int resultado = jogo.conectar();
		this.notificarResultado(resultado);
	}

	public String obterServidor() {
		String idServidor = ("netgames.labsoft.ufsc.br");
		idServidor = JOptionPane.showInputDialog(this, ("Insira o endereço do servidor"), idServidor);
		
		return idServidor;
	}

	public String obterIdJogador() {
		String idJogador = ("jogador");
		idJogador = JOptionPane.showInputDialog(this, ("Insira o nome do jogador"));
		
		return idJogador;
	}

	/**
	 * 
	 * @param resultado
	 */
	public void notificarResultado(int resultado) {
		switch (resultado) {
			case 0:
				JOptionPane.showMessageDialog(this, "Conexão efetuada com sucesso!");
				break;        	
			case 1:
				JOptionPane.showMessageDialog(this, "Tentativa de conexão com conexão previamente estabelecida");
				break;
			case 2:
				JOptionPane.showMessageDialog(this, "Tentativa de conexao falhou!");
				break;
			case 3:
				JOptionPane.showMessageDialog(this, "Desonexão efetuada com sucesso");
				break;
			case 4:
				JOptionPane.showMessageDialog(this, "Tentativa de desconexao sem conexao previamente estabelecida");
				break;
			case 5:
				JOptionPane.showMessageDialog(this, "Tentativa de desconexao falhou!");
				break;
			case 6:
				JOptionPane.showMessageDialog(this, "Solicitação de inicio procedida com sucesso");
				break;
			case 7:
				JOptionPane.showMessageDialog(this, "Tentativa de inicio sem conexao previamente estabelecida");
				break;
			case 8:
				JOptionPane.showMessageDialog(this, "Não é a sua vez");
				break;
			case 9:
				JOptionPane.showMessageDialog(this, "Partida encerrada");
				break;
			case 10:
				JOptionPane.showMessageDialog(this, "Lance OK");
				break;
			case 11:
				JOptionPane.showMessageDialog(this, "Posição ocupada");
				break;
			case 12:
				JOptionPane.showMessageDialog(this, "Posição ilegal");
				break;
			case 13:
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
//		this.desenhaSelecionado();
		System.out.println("AHHH");
	}

	/**
	 * 
	 * @param linha
	 * @param coluna
	 */
	public void click(int linha, int coluna) {
		int resultado = 0;
		resultado = jogo.click(linha, coluna);
		if ((resultado == 10) || (resultado == 9)){
			this.exibirEstado();
		}else{
			this.notificarResultado(resultado);
		}
	}

	/**
	 * @param estado
	 */
	public void atualizar(ImagemTabuleiro estado) {
		int valor = 0;
		Icon pecaVermelha = new ImageIcon(getClass().getResource("pecaVermelha.png"));
		Icon pecaAzul = new ImageIcon(getClass().getResource("pecaAzul.png"));
		Icon casaVazia = new ImageIcon(getClass().getResource("casaVazia.png"));
		
//		vMensagem.setText(estado.informarMensagem());
		
		for (int linha=0; linha < 17; linha++){
			for (int coluna=0; coluna < 13; coluna++){
				valor = estado.informarValor(linha, coluna);
				switch (valor){
					case 1:
						mapaVPosicao[linha][coluna].setIcon(pecaVermelha);
					break;
					case 2:
						mapaVPosicao[linha][coluna].setIcon(pecaAzul);
					break;
					default:
						mapaVPosicao[linha][coluna].setIcon(casaVazia);
				}
			};
		};
	}
	
	/**
	 * Desenha a peça selecionada
	 */
	protected void desenhaSelecionado() {
		Icon casaVazia = new ImageIcon(getClass().getResource("casaVazia.png"));
		Icon icone = mapaVPosicao[pos[0][0]][pos[0][1]].getIcon();
		System.out.println("PASSOU");
		mapaVPosicao[pos[0][0]][pos[0][1]].setIcon(casaVazia);
		mapaVPosicao[pos[1][0]][pos[1][1]].setIcon(icone);
	}
}