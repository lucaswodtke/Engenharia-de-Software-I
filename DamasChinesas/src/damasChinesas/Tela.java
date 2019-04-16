package damasChinesas;

import java.awt.*;

import javax.swing.WindowConstants;

public class Tela extends TelaAbstrato {

	public Tela() {
		desenhar();
	}

	@Override
	protected void desenhar() {
		super.desenhar();

		window.setSize(new Dimension(500, 300));
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		novoJogo();
	}

	public void novoJogo() {
		window.setVisible(false);
		new TelaView();
	}
}