/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Gato;

/**
 *
 * @author hooke
 */
public class GatoListaJFrame extends JFrame{
    
    private JButton adicionar, alterar, excluir;
    private JTable tabela;
    private JComboBox jComboBoxRaca;
    private DefaultTableModel modelo;
    private JScrollPane scroll;
    
    public void criarTelaDaLista(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        setSize(d);
        setTitle("Save the Capybara - Tabela de Registro de Gatos");
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(60, 179, 113));
        addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
                popularModeloDaTabela();
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
        
        setVisible(true);
    }
    
    public void criarComponentesDeAcaoDaLita(){
        adicionar = new JButton();
        alterar = new JButton();
        excluir = new JButton();
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable (int row, int column){
               return false;
            }
        };
        
        adiconarCabecalhoDaTabela();
        tabela = new JTable(modelo);
        scroll = new JScrollPane(tabela);
        removedorDeBordaFeiaDasImagesDosBotoesDaLista();
                
    }
    
    public void removedorDeBordaFeiaDasImagesDosBotoesDaLista(){
        adicionar.setFocusPainted(false);
        alterar.setFocusPainted(false);
        excluir.setFocusPainted(false);
    }
    
    public void definirPosicoesDosComponentesDaLista(){
        adicionar.setBounds(594, 0, 60, 60);
        alterar.setBounds(654, 0,60, 60);
        excluir.setBounds(714, 0, 60, 60);
        scroll.setBounds(10, 70, 765, 650);
        
    }
    
    public void adicionarBotoesDaLista(){
        
       add(adicionar);
       add(alterar);
       add(excluir);
       add(scroll);
               
    }
    
    public void adiconarCabecalhoDaTabela(){
        popularModeloDaTabela();
        modelo.addColumn("Nome");
        modelo.addColumn("Nome do Dono");
        modelo.addColumn("Pedigree");
        modelo.addColumn("Sexo");
        modelo.addColumn("Cor do Olho Direito");
        modelo.addColumn("Cor do Olho Esquerdo");
        
    }
    
    public void popularModeloDaTabela(){
        for (int i = 0; i < PrincipalJFrame.gatos.size(); i++) {
            Gato beta = PrincipalJFrame.gatos.get(i);
        
            String pedigre =  beta.isPedigree()? "Sim":"Não";    
            String sexo = "";
            if(Character.toUpperCase(beta.getSexo ()) == 'M'){
            sexo = "Macho";
            
            }else if(Character.toUpperCase(beta.getSexo()) == 'F'){
                sexo = "Fêmea";
            }else{
                
              sexo = "Sexo não Definido";  
            }
            
            modelo.addRow(new Object[]{
            
            beta.getNome(), beta.getNomeDono(), pedigre, sexo,
            beta.getCorOlhoDireito(), beta.getCorOlhoEsquerdo()
            
            });        
        }    
    }
    
    public void acaoAdicionarDoBotao(){
        GatoCadastroJFrame yuy = new GatoCadastroJFrame();
     
    }
            
    public void acaoAlterarDoBotao(){
        
    }
            
    public void acaoExcluirDoBotao(){
        
    }
    
    public void definiraAcaoClickDosBotoesDaLista(){
        adicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoAdicionarDoBotao();
            }
        });
        
        alterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoAlterarDoBotao();
            }
        });
        
        excluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoExcluirDoBotao();
            }
        });
    }

    public GatoListaJFrame() {
        criarTelaDaLista();
        criarComponentesDeAcaoDaLita();
        definirPosicoesDosComponentesDaLista();
        definiraAcaoClickDosBotoesDaLista();
        adicionarBotoesDaLista();
        
        
    }
    
    
    public void definirOnClickTabela(){
        
    }
  
    
    
}
