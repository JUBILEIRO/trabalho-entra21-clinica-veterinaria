/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Capivara;

/**
 *
 * @author hooke
 */
public class CapivaraListaJFrame extends JFrame{
    
    private JButton adicionar, alterar, excluir;
    private JTable tabela;
    private DefaultTableModel modelo;
    private JScrollPane scroll;
    
   
    private void criarTela(){
        setSize(800,800);
        setTitle("Save the Capybara - Tabela de Registro de Capivaras");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false );
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
               popularModelo();
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
        
        setVisible(true);
    }
    
    private void criarComponentes(){
      
        adicionar = new JButton();
        alterar = new JButton();
        excluir = new JButton();
        modelo = new DefaultTableModel(){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
                
           
        };
        adicionarCabecalhoModelo();
        tabela = new JTable(modelo);
        scroll = new JScrollPane(tabela);
       removedorDeBordaFeiaDasImagesDosBotoesDaLista();
    }
    
    public void removedorDeBordaFeiaDasImagesDosBotoesDaLista(){
        adicionar.setFocusPainted(false);
        alterar.setFocusPainted(false);
        excluir.setFocusPainted(false);
    }
     
    public void definirPosicoes(){
        adicionar.setBounds(594, 0, 60, 60);
        alterar.setBounds(654, 0,60, 60);
        excluir.setBounds(714, 0, 60, 60);
        scroll.setBounds(10, 70, 765, 650);
    }
     
    private void adicionarComponentes(){
       add(adicionar);
       add(alterar);
       add(excluir);
       add(scroll);
    }
     
    public void adicionarCabecalhoModelo(){
         modelo.addColumn("nome");
         modelo.addColumn("peso");
         modelo.addColumn("Tamanho");
         modelo.addColumn("Classificacao De Natação");
         modelo.addColumn("Sexo");
    }
     
    private void popularModelo(){
        modelo.setRowCount(0);
        for(int i = 0; i<PrincipalJFrame.capivaras.size(); i++ ){
            Capivara alfa = PrincipalJFrame.capivaras.get(i);
            String sexo = "";
            if (Character.toUpperCase(alfa.getSexo()) == 'M'){
                sexo = "Macho";
            }else if(Character.toUpperCase(alfa.getSexo()) == 'F'){
                sexo = "Fêmea";
            }else{
                sexo = "Sexo não foi definido";
            }
            modelo.addRow(new Object[]{
                alfa.getNome(), alfa.getTamanho(),alfa.getClassificacaoDeNado(),alfa.getPeso() + "Kg", sexo
            });
        }
    }
     
   private void acaoAdicionar(){
       CapivaraCadastroJFrame cadastrao = new CapivaraCadastroJFrame();
    }
   
    private void acaoAlterar(){
    
    }
    
    private void acaoExcluir(){
        
    }
    
    private void definirAcaoClickDosBotoes(){
        adicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoAdicionar();
            }
        });
        
        alterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoAlterar();
            }
        });
        
        excluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoExcluir();
            }
        });
    }

    public CapivaraListaJFrame() {
        criarTela();
        criarComponentes();
        definirPosicoes();
        adicionarComponentes();
        popularModelo();
        definirAcaoClickDosBotoes();
    }
    
    public void definirOnClickTabela(){
        tabela.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
               
            }
        });
    }
    
}
