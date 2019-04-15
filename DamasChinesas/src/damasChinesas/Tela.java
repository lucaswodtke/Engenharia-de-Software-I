package damasChinesas;

import java.awt.*;

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

		novoJogo();
	}

	public void novoJogo() {
		window.setVisible(false);
		new TelaView();
	}
}