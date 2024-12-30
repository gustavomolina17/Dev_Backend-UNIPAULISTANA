package gerenciador.de.livros.mvc;

import Controller.LivroController;
import View.LivroView;

/**
 *
 * @author professor
 */
public class GerenciadorDeLivrosMVC {

    
    public static void main(String[] args) {
        LivroView view = new LivroView();
        LivroController controller = new LivroController(view);
        // TODO code application logic here
    }
    
}
