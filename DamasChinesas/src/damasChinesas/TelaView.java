package damasChinesas;

import java.awt.Dimension;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;


public class TelaView extends TelaAbstrato {
	
	protected TabuleiroView tabuleiroView;
	protected Tabuleiro tabuleiro;

	public TelaView() {
		tabuleiro = new Tabuleiro();
		tabuleiroView = new TabuleiroView(tabuleiro);
		desenhar();
	}

	@Override
	public void desenhar() {
		super.desenhar();

		tabuleiroView.setPreferredSize(new Dimension(700, 645));
		window.add(tabuleiroView);

		JMenuBar menuBar = new JMenuBar();

		JMenu menu = new JMenu("Jogo");
		window.setJMenuBar(menuBar);
		menuBar.add(menu);
		
		JMenuItem conectar = new JMenuItem("Conectar");
//		conectar.setAction();
		menu.add(conectar);
		
		JMenuItem desconectar = new JMenuItem("Desconectar");
//		desconectar.setAction();
		menu.add(desconectar);
		
		JSeparator separador = new JSeparator();
		menu.add(separador);
		
		JMenuItem iniciarPartida = new JMenuItem("Iniciar Partida");
//		iniciarPartida.setAction();
		menu.add(iniciarPartida);

		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
}