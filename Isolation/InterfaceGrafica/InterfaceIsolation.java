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
import InterfaceGrafica.AtorJogador;

public class InterfaceIsolation extends JFrame {
	
	protected AtorJogador jogo;

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	
	protected boolean emRede = false;
	protected String idJ1 = "";
	
	private JLabel vPosicao0000 = null;
	private JLabel vPosicao0001 = null;
	private JLabel vPosicao0002 = null;	
	private JLabel vPosicao0003 = null;
	private JLabel vPosicao0004 = null;
	private JLabel vPosicao0005 = null;
	private JLabel vPosicao0006 = null;
	private JLabel vPosicao0007 = null;
	private JLabel vPosicao0008 = null;
	private JLabel vPosicao0009 = null;
	private JLabel vPosicao0010 = null;
	private JLabel vPosicao0011 = null;
	private JLabel vPosicao0012 = null;
	
	private JLabel vPosicao0100 = null;
	private JLabel vPosicao0101 = null;
	private JLabel vPosicao0102 = null;	
	private JLabel vPosicao0103 = null;
	private JLabel vPosicao0104 = null;
	private JLabel vPosicao0105 = null;
	private JLabel vPosicao0106 = null;
	private JLabel vPosicao0107 = null;
	private JLabel vPosicao0108 = null;
	private JLabel vPosicao0109 = null;
	private JLabel vPosicao0110 = null;
	private JLabel vPosicao0111 = null;
	private JLabel vPosicao0112 = null;
	
	private JLabel vPosicao0200 = null;
	private JLabel vPosicao0201 = null;
	private JLabel vPosicao0202 = null;	
	private JLabel vPosicao0203 = null;
	private JLabel vPosicao0204 = null;
	private JLabel vPosicao0205 = null;
	private JLabel vPosicao0206 = null;
	private JLabel vPosicao0207 = null;
	private JLabel vPosicao0208 = null;
	private JLabel vPosicao0209 = null;
	private JLabel vPosicao0210 = null;
	private JLabel vPosicao0211 = null;
	private JLabel vPosicao0212 = null;
	
	private JLabel vPosicao0300 = null;
	private JLabel vPosicao0301 = null;
	private JLabel vPosicao0302 = null;	
	private JLabel vPosicao0303 = null;
	private JLabel vPosicao0304 = null;
	private JLabel vPosicao0305 = null;
	private JLabel vPosicao0306 = null;
	private JLabel vPosicao0307 = null;
	private JLabel vPosicao0308 = null;
	private JLabel vPosicao0309 = null;
	private JLabel vPosicao0310 = null;
	private JLabel vPosicao0311 = null;
	private JLabel vPosicao0312 = null;
	                    
	private JLabel vPosicao0400 = null;
	private JLabel vPosicao0401 = null;
	private JLabel vPosicao0402 = null;	
	private JLabel vPosicao0403 = null;
	private JLabel vPosicao0404 = null;
	private JLabel vPosicao0405 = null;
	private JLabel vPosicao0406 = null;
	private JLabel vPosicao0407 = null;
	private JLabel vPosicao0408 = null;
	private JLabel vPosicao0409 = null;
	private JLabel vPosicao0410 = null;
	private JLabel vPosicao0411 = null;
	private JLabel vPosicao0412 = null;
    
	private JLabel vPosicao0500 = null;
	private JLabel vPosicao0501 = null;
	private JLabel vPosicao0502 = null;	
	private JLabel vPosicao0503 = null;
	private JLabel vPosicao0504 = null;
	private JLabel vPosicao0505 = null;
	private JLabel vPosicao0506 = null;
	private JLabel vPosicao0507 = null;
	private JLabel vPosicao0508 = null;
	private JLabel vPosicao0509 = null;
	private JLabel vPosicao0510 = null;
	private JLabel vPosicao0511 = null;
	private JLabel vPosicao0512 = null;
   
	private JLabel vPosicao0600 = null;
	private JLabel vPosicao0601 = null;
	private JLabel vPosicao0602 = null;	
	private JLabel vPosicao0603 = null;
	private JLabel vPosicao0604 = null;
	private JLabel vPosicao0605 = null;
	private JLabel vPosicao0606 = null;
	private JLabel vPosicao0607 = null;
	private JLabel vPosicao0608 = null;
	private JLabel vPosicao0609 = null;
	private JLabel vPosicao0610 = null;
	private JLabel vPosicao0611 = null;
	private JLabel vPosicao0612 = null;
	
	private JLabel vPosicao0700 = null;
	private JLabel vPosicao0701 = null;
	private JLabel vPosicao0702 = null;	
	private JLabel vPosicao0703 = null;
	private JLabel vPosicao0704 = null;
	private JLabel vPosicao0705 = null;
	private JLabel vPosicao0706 = null;
	private JLabel vPosicao0707 = null;
	private JLabel vPosicao0708 = null;
	private JLabel vPosicao0709 = null;
	private JLabel vPosicao0710 = null;
	private JLabel vPosicao0711 = null;
	private JLabel vPosicao0712 = null;
	
	private JLabel vPosicao0800 = null;
	private JLabel vPosicao0801 = null;
	private JLabel vPosicao0802 = null;	
	private JLabel vPosicao0803 = null;
	private JLabel vPosicao0804 = null;
	private JLabel vPosicao0805 = null;
	private JLabel vPosicao0806 = null;
	private JLabel vPosicao0807 = null;
	private JLabel vPosicao0808 = null;
	private JLabel vPosicao0809 = null;
	private JLabel vPosicao0810 = null;
	private JLabel vPosicao0811 = null;
	private JLabel vPosicao0812 = null;
	                        
	private JLabel vPosicao0900 = null;
	private JLabel vPosicao0901 = null;
	private JLabel vPosicao0902 = null;	
	private JLabel vPosicao0903 = null;
	private JLabel vPosicao0904 = null;
	private JLabel vPosicao0905 = null;
	private JLabel vPosicao0906 = null;
	private JLabel vPosicao0907 = null;
	private JLabel vPosicao0908 = null;
	private JLabel vPosicao0909 = null;
	private JLabel vPosicao0910 = null;
	private JLabel vPosicao0911 = null;
	private JLabel vPosicao0912 = null;
	
	private JLabel vPosicao1000 = null;
	private JLabel vPosicao1001 = null;
	private JLabel vPosicao1002 = null;	
	private JLabel vPosicao1003 = null;
	private JLabel vPosicao1004 = null;
	private JLabel vPosicao1005 = null;
	private JLabel vPosicao1006 = null;
	private JLabel vPosicao1007 = null;
	private JLabel vPosicao1008 = null;
	private JLabel vPosicao1009 = null;
	private JLabel vPosicao1010 = null;
	private JLabel vPosicao1011 = null;
	private JLabel vPosicao1012 = null;
	
	private JLabel vPosicao1100 = null;
	private JLabel vPosicao1101 = null;
	private JLabel vPosicao1102 = null;	
	private JLabel vPosicao1103 = null;
	private JLabel vPosicao1104 = null;
	private JLabel vPosicao1105 = null;
	private JLabel vPosicao1106 = null;
	private JLabel vPosicao1107 = null;
	private JLabel vPosicao1108 = null;
	private JLabel vPosicao1109 = null;
	private JLabel vPosicao1110 = null;
	private JLabel vPosicao1111 = null;
	private JLabel vPosicao1112 = null;
	
	private JLabel vPosicao1200 = null;
	private JLabel vPosicao1201 = null;
	private JLabel vPosicao1202 = null;	
	private JLabel vPosicao1203 = null;
	private JLabel vPosicao1204 = null;
	private JLabel vPosicao1205 = null;
	private JLabel vPosicao1206 = null;
	private JLabel vPosicao1207 = null;
	private JLabel vPosicao1208 = null;
	private JLabel vPosicao1209 = null;
	private JLabel vPosicao1210 = null;
	private JLabel vPosicao1211 = null;
	private JLabel vPosicao1212 = null;
	
	private JLabel vPosicao1300 = null;
	private JLabel vPosicao1301 = null;
	private JLabel vPosicao1302 = null;	
	private JLabel vPosicao1303 = null;
	private JLabel vPosicao1304 = null;
	private JLabel vPosicao1305 = null;
	private JLabel vPosicao1306 = null;
	private JLabel vPosicao1307 = null;
	private JLabel vPosicao1308 = null;
	private JLabel vPosicao1309 = null;
	private JLabel vPosicao1310 = null;
	private JLabel vPosicao1311 = null;
	private JLabel vPosicao1312 = null;
	
	private JLabel vPosicao1400 = null;
	private JLabel vPosicao1401 = null;
	private JLabel vPosicao1402 = null;	
	private JLabel vPosicao1403 = null;
	private JLabel vPosicao1404 = null;
	private JLabel vPosicao1405 = null;
	private JLabel vPosicao1406 = null;
	private JLabel vPosicao1407 = null;
	private JLabel vPosicao1408 = null;
	private JLabel vPosicao1409 = null;
	private JLabel vPosicao1410 = null;
	private JLabel vPosicao1411 = null;
	private JLabel vPosicao1412 = null;
	
	private JLabel vPosicao1500 = null;
	private JLabel vPosicao1501 = null;
	private JLabel vPosicao1502 = null;	
	private JLabel vPosicao1503 = null;
	private JLabel vPosicao1504 = null;
	private JLabel vPosicao1505 = null;
	private JLabel vPosicao1506 = null;
	private JLabel vPosicao1507 = null;
	private JLabel vPosicao1508 = null;
	private JLabel vPosicao1509 = null;
	private JLabel vPosicao1510 = null;
	private JLabel vPosicao1511 = null;
	private JLabel vPosicao1512 = null;
	
	private JLabel vPosicao1600 = null;
	private JLabel vPosicao1601 = null;
	private JLabel vPosicao1602 = null;	
	private JLabel vPosicao1603 = null;
	private JLabel vPosicao1604 = null;
	private JLabel vPosicao1605 = null;
	private JLabel vPosicao1606 = null;
	private JLabel vPosicao1607 = null;
	private JLabel vPosicao1608 = null;
	private JLabel vPosicao1609 = null;
	private JLabel vPosicao1610 = null;
	private JLabel vPosicao1611 = null;
	private JLabel vPosicao1612 = null;
	
	private JLabel vPosicao1700 = null;
	private JLabel vPosicao1701 = null;
	private JLabel vPosicao1702 = null;	
	private JLabel vPosicao1703 = null;
	private JLabel vPosicao1704 = null;
	private JLabel vPosicao1705 = null;
	private JLabel vPosicao1706 = null;
	private JLabel vPosicao1707 = null;
	private JLabel vPosicao1708 = null;
	private JLabel vPosicao1709 = null;
	private JLabel vPosicao1710 = null;
	private JLabel vPosicao1711 = null;
	private JLabel vPosicao1712 = null;
	                        
	
	
	protected JLabel mapaVPosicao[][] = new JLabel[17][13];

    private JMenuBar jMenuBar1 = null;
	
	private JMenu menuJogo = null;

	private JMenuItem jMenuItem1 = null;

	private JMenuItem jMenuItem2 = null;

	private JMenuItem jMenuItem3 = null;
	
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
		this.setSize(560, 630);
		this.setContentPane(getJContentPane());
		this.setTitle("Isolation");
		jogo = new AtorJogador(this);
	}
	
	private JPanel getJContentPane() {
		if(jContentPane==null) {
			
			Icon vazia =new ImageIcon(getClass().getResource("vazia.jpg"));
			
			vMensagem = new JLabel();
			vMensagem.setBounds(new Rectangle(25, 10, 300, 20));
			vMensagem.setText("Damas Chinesa");
			

			
			
			vPosicao0000 = new JLabel();
			vPosicao0000.setBounds(new Rectangle(27, 27, 27, 27));
			vPosicao0000.setIcon(vazia);				
			vPosicao0000.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(0,0); 
				}
			});
			
			vPosicao0001 = new JLabel();
			vPosicao0001.setBounds(new Rectangle(47, 40, 27, 27));
			vPosicao0001.setIcon(vazia);
			vPosicao0001.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(0,1); 
				}
			});
			
			vPosicao02 = new JLabel();
			vPosicao02.setIcon(vazia);
			vPosicao02.setBounds(new Rectangle(160, 40, 70, 70));
			vPosicao02.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(0,2); 
				}
			});
			
			vPosicao03 = new JLabel();
			vPosicao03.setIcon(vazia);
			vPosicao03.setBounds(new Rectangle(230, 40, 70, 70));
			vPosicao03.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(0,3); 
				}
			});
			
			vPosicao04 = new JLabel();
			vPosicao04.setIcon(vazia);
			vPosicao04.setBounds(new Rectangle(300, 40, 70, 70));
			vPosicao04.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(0,4); 
				}
			});

			vPosicao05 = new JLabel();
			vPosicao05.setIcon(vazia);
			vPosicao05.setBounds(new Rectangle(370, 40, 70, 70));
			vPosicao05.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(0,5); 
				}
			});

			vPosicao06 = new JLabel();
			vPosicao06.setIcon(vazia);
			vPosicao06.setBounds(new Rectangle(440, 40, 70, 70));
			vPosicao06.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(0,6); 
				}
			});
	
			
			vPosicao10 = new JLabel();
			vPosicao10.setBounds(new Rectangle(20, 110, 70, 70));
			vPosicao10.setIcon(vazia);
			vPosicao10.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(1,0); 
				}
			});
			
			vPosicao11 = new JLabel();
			vPosicao11.setBounds(new Rectangle(90, 110, 70, 70));
			vPosicao11.setIcon(vazia);
			vPosicao11.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(1,1); 
				}
			});
			
			vPosicao12 = new JLabel();
			vPosicao12.setBounds(new Rectangle(160, 110, 70, 70));
			vPosicao12.setIcon(vazia);
			vPosicao12.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(1,2); 
				}
			});
			
			vPosicao13 = new JLabel();
			vPosicao13.setIcon(vazia);
			vPosicao13.setBounds(new Rectangle(230, 110, 70, 70));
			vPosicao13.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(1,3); 
				}
			});
			
			vPosicao14 = new JLabel();
			vPosicao14.setIcon(vazia);
			vPosicao14.setBounds(new Rectangle(300, 110, 70, 70));
			vPosicao14.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(1,4); 
				}
			});

			vPosicao15 = new JLabel();
			vPosicao15.setIcon(vazia);
			vPosicao15.setBounds(new Rectangle(370, 110, 70, 70));
			vPosicao15.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(1,5); 
				}
			});

			vPosicao16 = new JLabel();
			vPosicao16.setIcon(vazia);
			vPosicao16.setBounds(new Rectangle(440, 110, 70, 70));
			vPosicao16.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(1,6); 
				}
			});
			
			vPosicao20 = new JLabel();
			vPosicao20.setBounds(new Rectangle(20, 180, 70, 70));
			vPosicao20.setIcon(vazia);
			vPosicao20.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(2,0);
				}
			});
			
			vPosicao21 = new JLabel();
			vPosicao21.setBounds(new Rectangle(90, 180, 70, 70));
			vPosicao21.setIcon(vazia);
			vPosicao21.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(2,1); 
				}
			});
			
			vPosicao22 = new JLabel();
			vPosicao22.setBounds(new Rectangle(160, 180, 70, 70));
			vPosicao22.setIcon(vazia);
			vPosicao22.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(2,2); 
				}
			});
			
			vPosicao23 = new JLabel();
			vPosicao23.setIcon(vazia);
			vPosicao23.setBounds(new Rectangle(230, 180, 70, 70));
			vPosicao23.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(2,3); 
				}
			});
			
			vPosicao24 = new JLabel();
			vPosicao24.setIcon(vazia);
			vPosicao24.setBounds(new Rectangle(300, 180, 70, 70));
			vPosicao24.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(2,4); 
				}
			});

			vPosicao25 = new JLabel();
			vPosicao25.setIcon(vazia);
			vPosicao25.setBounds(new Rectangle(370, 180, 70, 70));
			vPosicao25.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(2,5); 
				}
			});

			vPosicao26 = new JLabel();
			vPosicao26.setIcon(vazia);
			vPosicao26.setBounds(new Rectangle(440, 180, 70, 70));
			vPosicao26.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(2,6); 
				}
			});
			
			vPosicao30 = new JLabel();
			vPosicao30.setBounds(new Rectangle(20, 250, 70, 70));
			vPosicao30.setIcon(vazia);
			vPosicao30.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(3,0);
				}
			});
			
			vPosicao31 = new JLabel();
			vPosicao31.setBounds(new Rectangle(90, 250, 70, 70));
			vPosicao31.setIcon(vazia);
			vPosicao31.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(3,1); 
				}
			});
			
			vPosicao32 = new JLabel();
			vPosicao32.setBounds(new Rectangle(160, 250, 70, 70));
			vPosicao32.setIcon(vazia);
			vPosicao32.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(3,2); 
				}
			});
			
			vPosicao33 = new JLabel();
			vPosicao33.setIcon(vazia);
			vPosicao33.setBounds(new Rectangle(230, 250, 70, 70));
			vPosicao33.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(3,3); 
				}
			});
			
			vPosicao34 = new JLabel();
			vPosicao34.setIcon(vazia);
			vPosicao34.setBounds(new Rectangle(300, 250, 70, 70));
			vPosicao34.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(3,4); 
				}
			});

			vPosicao35 = new JLabel();
			vPosicao35.setIcon(vazia);
			vPosicao35.setBounds(new Rectangle(370, 250, 70, 70));
			vPosicao35.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(3,5); 
				}
			});

			vPosicao36 = new JLabel();
			vPosicao36.setIcon(vazia);
			vPosicao36.setBounds(new Rectangle(440, 250, 70, 70));
			vPosicao36.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(3,6); 
				}
			});
			
			vPosicao40 = new JLabel();
			vPosicao40.setBounds(new Rectangle(20, 320, 70, 70));
			vPosicao40.setIcon(vazia);
			vPosicao40.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(4,0);
				}
			});
			
			vPosicao41 = new JLabel();
			vPosicao41.setBounds(new Rectangle(90, 320, 70, 70));
			vPosicao41.setIcon(vazia);
			vPosicao41.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(4,1); 
				}
			});
			
			vPosicao42 = new JLabel();
			vPosicao42.setBounds(new Rectangle(160, 320, 70, 70));
			vPosicao42.setIcon(vazia);
			vPosicao42.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(4,2); 
				}
			});
			
			vPosicao43 = new JLabel();
			vPosicao43.setIcon(vazia);
			vPosicao43.setBounds(new Rectangle(230, 320, 70, 70));
			vPosicao43.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(4,3); 
				}
			});
			
			vPosicao44 = new JLabel();
			vPosicao44.setIcon(vazia);
			vPosicao44.setBounds(new Rectangle(300, 320, 70, 70));
			vPosicao44.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(4,4); 
				}
			});

			vPosicao45 = new JLabel();
			vPosicao45.setIcon(vazia);
			vPosicao45.setBounds(new Rectangle(370, 320, 70, 70));
			vPosicao45.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(4,5); 
				}
			});

			vPosicao46 = new JLabel();
			vPosicao46.setIcon(vazia);
			vPosicao46.setBounds(new Rectangle(440, 320, 70, 70));
			vPosicao46.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(4,6); 
				}
			});
			
			vPosicao50 = new JLabel();
			vPosicao50.setBounds(new Rectangle(20, 390, 70, 70));
			vPosicao50.setIcon(vazia);
			vPosicao50.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(5,0);
				}
			});
			
			vPosicao51 = new JLabel();
			vPosicao51.setBounds(new Rectangle(90, 390, 70, 70));
			vPosicao51.setIcon(vazia);
			vPosicao51.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(5,1); 
				}
			});
			
			vPosicao52 = new JLabel();
			vPosicao52.setBounds(new Rectangle(160, 390, 70, 70));
			vPosicao52.setIcon(vazia);
			vPosicao52.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(5,2); 
				}
			});
			
			vPosicao53 = new JLabel();
			vPosicao53.setIcon(vazia);
			vPosicao53.setBounds(new Rectangle(230, 390, 70, 70));
			vPosicao53.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(5,3); 
				}
			});
			
			vPosicao54 = new JLabel();
			vPosicao54.setIcon(vazia);
			vPosicao54.setBounds(new Rectangle(300, 390, 70, 70));
			vPosicao54.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(5,4); 
				}
			});

			vPosicao55 = new JLabel();
			vPosicao55.setIcon(vazia);
			vPosicao55.setBounds(new Rectangle(370, 390, 70, 70));
			vPosicao55.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(5,5); 
				}
			});

			vPosicao56 = new JLabel();
			vPosicao56.setIcon(vazia);
			vPosicao56.setBounds(new Rectangle(440, 390, 70, 70));
			vPosicao56.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(5,6); 
				}
			});
			
			vPosicao60 = new JLabel();
			vPosicao60.setBounds(new Rectangle(20, 460, 70, 70));
			vPosicao60.setIcon(vazia);
			vPosicao60.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(6,0);
				}
			});
			
			vPosicao61 = new JLabel();
			vPosicao61.setBounds(new Rectangle(90, 460, 70, 70));
			vPosicao61.setIcon(vazia);
			vPosicao61.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(6,1); 
				}
			});
			
			vPosicao62 = new JLabel();
			vPosicao62.setBounds(new Rectangle(160, 460, 70, 70));
			vPosicao62.setIcon(vazia);
			vPosicao62.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(6,2); 
				}
			});
			
			vPosicao63 = new JLabel();
			vPosicao63.setIcon(vazia);
			vPosicao63.setBounds(new Rectangle(230, 460, 70, 70));
			vPosicao63.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(6,3); 
				}
			});
			
			vPosicao64 = new JLabel();
			vPosicao64.setIcon(vazia);
			vPosicao64.setBounds(new Rectangle(300, 460, 70, 70));
			vPosicao64.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(6,4); 
				}
			});

			vPosicao65 = new JLabel();
			vPosicao65.setIcon(vazia);
			vPosicao65.setBounds(new Rectangle(370, 460, 70, 70));
			vPosicao65.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(6,5); 
				}
			});

			vPosicao66 = new JLabel();
			vPosicao66.setIcon(vazia);
			vPosicao66.setBounds(new Rectangle(440, 460, 70, 70));
			vPosicao66.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					click(6,6); 
				}
			});
			
			jMenuBar1 = new JMenuBar();
			jMenuBar1.add(getMenu());
		    this.setJMenuBar(jMenuBar1);

			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(vPosicao00, null);
			jContentPane.add(vPosicao01, null);
			jContentPane.add(vPosicao02, null);
			jContentPane.add(vPosicao03, null);
			jContentPane.add(vPosicao04, null);
			jContentPane.add(vPosicao05, null);
			jContentPane.add(vPosicao06, null);
			
			jContentPane.add(vPosicao10, null);
			jContentPane.add(vPosicao11, null);
			jContentPane.add(vPosicao12, null);
			jContentPane.add(vPosicao13, null);
			jContentPane.add(vPosicao14, null);
			jContentPane.add(vPosicao15, null);
			jContentPane.add(vPosicao16, null);
			
			jContentPane.add(vPosicao20, null);
			jContentPane.add(vPosicao21, null);
			jContentPane.add(vPosicao22, null);
			jContentPane.add(vPosicao23, null);
			jContentPane.add(vPosicao24, null);
			jContentPane.add(vPosicao25, null);
			jContentPane.add(vPosicao26, null);
			
			jContentPane.add(vPosicao30, null);
			jContentPane.add(vPosicao31, null);
			jContentPane.add(vPosicao32, null);
			jContentPane.add(vPosicao33, null);
			jContentPane.add(vPosicao34, null);
			jContentPane.add(vPosicao35, null);
			jContentPane.add(vPosicao36, null);
			
			jContentPane.add(vPosicao40, null);
			jContentPane.add(vPosicao41, null);
			jContentPane.add(vPosicao42, null);
			jContentPane.add(vPosicao43, null);
			jContentPane.add(vPosicao44, null);
			jContentPane.add(vPosicao45, null);
			jContentPane.add(vPosicao46, null);
			
			jContentPane.add(vPosicao50, null);
			jContentPane.add(vPosicao51, null);
			jContentPane.add(vPosicao52, null);
			jContentPane.add(vPosicao53, null);
			jContentPane.add(vPosicao54, null);
			jContentPane.add(vPosicao55, null);
			jContentPane.add(vPosicao56, null);
			
			jContentPane.add(vPosicao60, null);
			jContentPane.add(vPosicao61, null);
			jContentPane.add(vPosicao62, null);
			jContentPane.add(vPosicao63, null);
			jContentPane.add(vPosicao64, null);
			jContentPane.add(vPosicao65, null);
			jContentPane.add(vPosicao66, null);
			
			mapaVPosicao[0][0] = vPosicao00;
			mapaVPosicao[0][1] = vPosicao01;
			mapaVPosicao[0][2] = vPosicao02;
			mapaVPosicao[0][3] = vPosicao03;
			mapaVPosicao[0][4] = vPosicao04;
			mapaVPosicao[0][5] = vPosicao05;
			mapaVPosicao[0][6] = vPosicao06;
						
			mapaVPosicao[1][0] = vPosicao10;
			mapaVPosicao[1][1] = vPosicao11;
			mapaVPosicao[1][2] = vPosicao12;
			mapaVPosicao[1][3] = vPosicao13;
			mapaVPosicao[1][4] = vPosicao14;
			mapaVPosicao[1][5] = vPosicao15;
			mapaVPosicao[1][6] = vPosicao16;
			
			mapaVPosicao[2][0] = vPosicao20;
			mapaVPosicao[2][1] = vPosicao21;
			mapaVPosicao[2][2] = vPosicao22;
			mapaVPosicao[2][3] = vPosicao23;
			mapaVPosicao[2][4] = vPosicao24;
			mapaVPosicao[2][5] = vPosicao25;
			mapaVPosicao[2][6] = vPosicao26;
			
			mapaVPosicao[3][0] = vPosicao30;
			mapaVPosicao[3][1] = vPosicao31;
			mapaVPosicao[3][2] = vPosicao32;
			mapaVPosicao[3][3] = vPosicao33;
			mapaVPosicao[3][4] = vPosicao34;
			mapaVPosicao[3][5] = vPosicao35;
			mapaVPosicao[3][6] = vPosicao36;
			
			mapaVPosicao[4][0] = vPosicao40;
			mapaVPosicao[4][1] = vPosicao41;
			mapaVPosicao[4][2] = vPosicao42;
			mapaVPosicao[4][3] = vPosicao43;
			mapaVPosicao[4][4] = vPosicao44;
			mapaVPosicao[4][5] = vPosicao45;
			mapaVPosicao[4][6] = vPosicao46;
			
			mapaVPosicao[5][0] = vPosicao50;
			mapaVPosicao[5][1] = vPosicao51;
			mapaVPosicao[5][2] = vPosicao52;
			mapaVPosicao[5][3] = vPosicao53;
			mapaVPosicao[5][4] = vPosicao54;
			mapaVPosicao[5][5] = vPosicao55;
			mapaVPosicao[5][6] = vPosicao56;
			
			mapaVPosicao[6][0] = vPosicao60;
			mapaVPosicao[6][1] = vPosicao61;
			mapaVPosicao[6][2] = vPosicao62;
			mapaVPosicao[6][3] = vPosicao63;
			mapaVPosicao[6][4] = vPosicao64;
			mapaVPosicao[6][5] = vPosicao65;
			mapaVPosicao[6][6] = vPosicao66;

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
		case 0:  JOptionPane.showMessageDialog(this, "Conexão efetuada com exito"); break;        	
		case 1:  JOptionPane.showMessageDialog(this, "Tentativa de conexão com conexão previamente estabelecida"); break;
    	case 2:  JOptionPane.showMessageDialog(this, "Tentativa de conexao falhou"); break;
    	case 3:  JOptionPane.showMessageDialog(this, "Desonexão efetuada com exito"); break;
    	case 4:  JOptionPane.showMessageDialog(this, "Tentativa de desconexao sem conexao previamente estabelecida"); break;
    	case 5:  JOptionPane.showMessageDialog(this, "Tentativa de desconexao falhou"); break;
    	case 6:  JOptionPane.showMessageDialog(this, "Solicitação de inicio procedida com êxito"); break;
    	case 7:  JOptionPane.showMessageDialog(this, "Tentativa de inicio sem conexao previamente estabelecida"); break;
    	case 8:  JOptionPane.showMessageDialog(this, "Não é a sua vez"); break;
    	case 9:  JOptionPane.showMessageDialog(this, "Partida encerrada"); break;
    	case 10: JOptionPane.showMessageDialog(this, "Lance OK"); break;
    	case 11: JOptionPane.showMessageDialog(this, "Posição ocupada"); break;
    	case 12: JOptionPane.showMessageDialog(this, "Posição ilegal"); break;
    	case 13: JOptionPane.showMessageDialog(this, "Partida corrente não interrompida"); break;
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
	 * 
	 * @param estado
	 */
	public void atualizar(ImagemTabuleiro estado) {
		int valor = 0;
		Icon branca = new ImageIcon(getClass().getResource("branca.jpg"));
		Icon preta = new ImageIcon(getClass().getResource("preta.jpg"));
		Icon vazia = new ImageIcon(getClass().getResource("vazia.jpg"));
		Icon bloqueada = new ImageIcon(getClass().getResource("bloqueada.jpg"));
		vMensagem.setText(estado.informarMensagem());
		for (int linha=0; linha<7; linha++){
			for (int coluna=0; coluna<7; coluna++){
				valor = estado.informarValor(linha, coluna);
				switch (valor){
				case 0: mapaVPosicao[linha][coluna].setIcon(vazia);
				break;
				case 1: mapaVPosicao[linha][coluna].setIcon(branca);
				break;
				case 2: mapaVPosicao[linha][coluna].setIcon(preta);
				break;
				case 3: mapaVPosicao[linha][coluna].setIcon(bloqueada);
				}
			};
		};
	}

}