package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import modelo.Cachorro;
import modelo.Capivara;
import modelo.Gato;
import sun.swing.SwingAccessor;

/**
 * @author Alunos
 */
// Esta classe herda da classe JFrame os
// atributos e métodos ou seja as características
// e os comportamentos.
public class PrincipalJFrame extends JFrame{
    
    private JButton listaCachorro, listaGato, listaCapivara;
    
    // é uma forma de voce ter uma lista que nao depende de um objeto e sim de uma classe.
    public static ArrayList<Cachorro> cachorros;
    public static ArrayList<Gato> gatos;
    public static ArrayList<Capivara> capivaras;
    
    public PrincipalJFrame(){
        cachorros = new ArrayList<>();
        gatos = new ArrayList<>();
        capivaras = new ArrayList<>();
        definirComoSeraATela();
        criarBotoes();
        pupularListaCachorros();
        setVisible(true);
    }
    
    public void definirComoSeraATela(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        setSize(d);
        setLayout(null);
        setTitle("Veteriária  Save the Capybara");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(60, 179, 113));
    }
    
    private void criarBotoes() {
        
        ImageIcon icone = new ImageIcon(
        getClass().getResource("/imagens/bulldog.png"));
        // instanciando um objeto da classe JButton
        // passando qual será o texto do botão
        listaCachorro = new JButton("Lista de Cachorros", icone);
        listaCachorro.setHorizontalTextPosition(SwingConstants.CENTER);
        listaCachorro.setVerticalAlignment(SwingConstants.TOP);
        listaCachorro.setVerticalTextPosition(SwingConstants.BOTTOM);
        listaCachorro.setBounds(243, 100, 300, 100);
        listaCachorro.setFocusPainted(false);
        // implementa para o botão ter o evento de click do mouse.
        listaCachorro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // instanciando um objeto de CachorroListaJFrame
                CachorroListaJFrame b = new CachorroListaJFrame();
            }
        });
        icone = new ImageIcon(
        getClass().getResource("/imagens/cat.png"));
        //istanciando um objeto da classe JButton
        //passando qual será o texto do botão
        listaGato = new JButton("Lista De Gatos", icone);
        listaGato.setHorizontalTextPosition(SwingConstants.CENTER);
        listaGato.setVerticalAlignment(SwingConstants.TOP);
        listaGato.setVerticalTextPosition(SwingConstants.BOTTOM);
        listaGato.setBounds(243, 300, 300, 100);
        listaGato.setFocusPainted(false);
        //implementa para o botão ter o evento de click do mouse .
        listaGato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             GatoListaJFrame k = new GatoListaJFrame();
            }
        });
        icone = new ImageIcon(
        getClass().getResource("/imagens/capivara.png"));
        //istanciando um objeto da classe JButton
        //passando qual será o texto do botão
        listaCapivara= new JButton("Lista De Capivara", icone);
      //listaCapivara.setHorizontalAlignment(SwingConstants.RIGHT);
        listaCapivara.setHorizontalTextPosition(SwingConstants.CENTER);
        listaCapivara.setVerticalAlignment(SwingConstants.TOP);
        listaCapivara.setVerticalTextPosition(SwingConstants.BOTTOM);
        listaCapivara.setBounds(243, 500, 300, 100);
        listaCapivara.setFocusPainted(false);
        //implementa para o botão ter o evento de click do mouse .
        listaCapivara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             CapivaraListaJFrame n = new CapivaraListaJFrame();   
            }
        });
        
        // adicionado um butao ao JFrame
        add(listaCachorro);
        add(listaGato);
        add(listaCapivara);
        
        
    }

    private void pupularListaCachorros() {
        Cachorro pug = new Cachorro();
        pug.setNome("Cachos Rosados");
        pug.setRaca("Pug");
        pug.setPeso(6.00f);
        pug.setSexo('M');
        pug.setVivo(false);
        pug.setTamanho(20);
        cachorros.add(pug);
        
        Cachorro pinscher = new Cachorro("Late não morde", "Pinscher", 2.5f, false, 20, 'F');
        cachorros.add(pinscher);
        
        Cachorro labrador = new Cachorro("Marley", "Labrador", 30f, true, 100, 'M');
        cachorros.add(labrador);
    }
    
}
