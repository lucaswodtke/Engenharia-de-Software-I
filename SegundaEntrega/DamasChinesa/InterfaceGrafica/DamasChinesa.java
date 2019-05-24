package InterfaceGrafica;

import javax.swing.JFrame;

public class DamasChinesa {

	public static void main(String[] args) {
		InterfaceDamasChinesa janela;
		janela = new InterfaceDamasChinesa();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}