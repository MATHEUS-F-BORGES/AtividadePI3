

import br.tads.pi3.gerenciadoprodutos.views.TelaInicial;
import javax.swing.*;


public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		
		TelaInicial tela = new TelaInicial();
                tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		tela.setResizable(false);
		tela.setLocationRelativeTo(null);
		tela.setVisible(true);

	}
        
        

}
