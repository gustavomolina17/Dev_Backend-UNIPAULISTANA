package Controller;
import Model.Livro;
import View.LivroView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class LivroController {
    private LivroView view;
    private List<Livro>livros;
    
    public LivroController(LivroView view){
        this.view=view;
        this.livros = new ArrayList<>();
        this.view.setAdicionarLivroListener(new AdicionarLivroListener());
    }

   class AdicionarLivroListener implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent e){
           String titulo = view.getTitulo();
           String autor = view.getAutor();
           
           if(!titulo.trim().isEmpty()&& !autor.trim().isEmpty()){
               Livro novoLivro = new Livro(titulo,autor);
               livros.add(novoLivro);
               view.adicionarLivro(novoLivro);
               
               view.tituloField.setText(""); // Limpar o campo de título
               view.autorField.setText("");
            } else{
               JOptionPane.showMessageDialog(view.frame, "Por favor, preencha todos os campos.");
            }
       }
   }
}
       
       
       
       

    
   
    
    
    
    
    
    
    
    
    
    

    
   
    
    
    
    
    
    
    
    
    
    
