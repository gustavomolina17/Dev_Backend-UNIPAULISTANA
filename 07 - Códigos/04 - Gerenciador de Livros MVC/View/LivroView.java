package View;

/**
 *
 * @author professor
 */

import Model.Livro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class LivroView {
    public final JFrame frame;
    public final JTextField tituloField;
    public final JTextField autorField;
    private final DefaultListModel<Livro>livroListModel;
    private final JList<Livro> livroList;
    
    public LivroView(){
        frame = new JFrame("Cadastro de Livros");
        tituloField = new JTextField(15);
        autorField = new JTextField(15);
        livroListModel = new DefaultListModel<>();
        livroList = new JList<>(livroListModel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.setLayout(new BorderLayout());
        
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Título:"));
        inputPanel.add(tituloField);
        inputPanel.add(new JLabel("Autor:"));
        inputPanel.add(autorField);
        JButton adicionarButton = new JButton("Adicionar Livro");
        inputPanel.add(adicionarButton);
        
        frame.add(inputPanel,BorderLayout.NORTH);
        frame.add(new JScrollPane(livroList),BorderLayout.CENTER);
        frame.add(adicionarButton,BorderLayout.SOUTH);
        
        frame.setVisible(true);
}
    public String getTitulo(){
        return tituloField.getText();
    }
    
    public String getAutor(){
        return autorField.getText();
    }
    
    public void adicionarLivro(Livro livro){
        livroListModel.addElement(livro);
    }
    
    public void setAdicionarLivroListener(ActionListener listener){
        for (Component comp : frame.getContentPane().getComponents()){
            if(comp instanceof JButton jButton){
                jButton.addActionListener(listener);
            }
       }
    }   
}
