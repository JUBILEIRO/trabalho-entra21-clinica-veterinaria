/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author hooke
 */
public class CapivaraCadastroJFrame  extends JFrame{
    
    public void criarTelaCadastroCapivara(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        setSize(d);
        setLayout(null);
        setTitle("Save the Capybara - Capivara - Cadastro");
    }
    
}
