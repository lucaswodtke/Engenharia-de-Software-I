package damasChinesas;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public abstract class TelaAbstrato extends JPanel {

	protected JFrame window;
	protected JPanel telaPrincipal;

	protected void desenhar() {
		File arquivoDeImagem = new File("imagens/icone.png");
		BufferedImage icone = null;
		
        try {
        	icone = ImageIO.read(arquivoDeImagem);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		
		window = new JFrame("Damas Chinesas");
		window.setResizable(false);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setIconImage(icone);
		
		telaPrincipal = new JPanel();
	}
}