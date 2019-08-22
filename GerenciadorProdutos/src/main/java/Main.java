

import br.tads.pi3.gerenciadoprodutos.views.Listar;
import javax.swing.*;


public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		
		Listar telaInicial = new Listar();
                telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		telaInicial.setResizable(false);
		telaInicial.setLocationRelativeTo(null);
		telaInicial.setVisible(true);

	}
        
        

}
