package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Cachorro;

/**
 * @author Felipe 
 */
public class CachorroListaJFrame extends JFrame{
    
    private int linhaSelecionada = -1;
    private JButton adicionar, alterar,  excluir;
    // componente que nos permite visualizar informações em forma de tabela
    // porém é necessário um modelo para que a tabela paresente alguma informação.
    private JTable tabela;
    // componente que nos permite adicionar as colunas, as linhas para a tabela.
    private DefaultTableModel modelo;
    // componente que permite algum outro componente ter a barra de scroll tanto na vertical como na horizontal.
    private JScrollPane scroll;
    
    
    private void criarTela(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        setSize(d);
        setTitle("Save the Capybara - Tabela de Registro de Cachorros");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
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
        
        ImageIcon icone = new ImageIcon(getClass().getResource("/imagens/botaoAdd.png"));
        adicionar = new JButton(icone);
        icone = new ImageIcon(getClass().getResource("/imagens/botaoAlterar.png"));
        alterar = new JButton(icone);
        icone = new ImageIcon(getClass().getResource("/imagens/excluir.png"));
        excluir = new JButton(icone);
        modelo = new DefaultTableModel(){
            // ele nao permitir que o usuario altere alguma célula na tabela.
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        adicionarCabecalhoModelo();
        tabela = new JTable(modelo);
        // tabela = new JTable();
        // tabela.setModel(modelo); 
        scroll = new JScrollPane(tabela);
         removedorDeBordaFeiaDasImagesDosBotoesDaLista();
        definirOnclickTabela();
       
        
    }
    
    public void removedorDeBordaFeiaDasImagesDosBotoesDaLista(){
        adicionar.setFocusPainted(false);
        alterar.setFocusPainted(false);
        excluir.setFocusPainted(false);
    }
    
    private void adicionarCabecalhoModelo(){
        modelo.addColumn("Nome");
        modelo.addColumn("Raça");
        modelo.addColumn("Peso");
        modelo.addColumn("Sexo");
        modelo.addColumn("Estado Atual");
    }
    
    private void definirPosicoes(){
        adicionar.setBounds(474, 0, 80, 80);
        alterar.setBounds(594, 0,80, 80);
        excluir.setBounds(714, 0, 80, 80);
        scroll.setBounds(290, 70, 800, 650);
    }
    
    private void adicionarComponentes(){
        add(adicionar);
        add(alterar);
        add(excluir);
        add(scroll);
    }
    
    /**
     *Tem como utilidade adicionar as linhas
     * com as caracteristicas do cachorro ao modelo.
     */
    private void popularModelo(){
        modelo.setRowCount(0);
        for(int i = 0; i<PrincipalJFrame.cachorros.size();i++){
            Cachorro cacho = PrincipalJFrame.cachorros.get(i);
            // String estadoAtual = "";
            // if(cacho.isVivo()){
            //     estadoAtual = "Vivo";
            // }else{
            //     estadoAtual = "Morreu";
            // }
            // Famoso operador ternário
            String estadoAtual = cacho.isVivo() ? "Vivo" : "Morreu";
            String sexo = "";
            if(Character.toUpperCase(cacho.getSexo()) == 'M'){
            // if(cacho.getSexo() == 'M' || cacho.getSexo() == 'm'){
                sexo = "Macho";
            }else if(Character.toUpperCase(cacho.getSexo()) == 'F'){
                sexo = "Fêmea";
            }else{
                sexo = "Não foi definido";
            }
            modelo.addRow(new Object[]{
                cacho.getNome(), cacho.getRaca(), cacho.getPeso() + " Kg", sexo, estadoAtual
            });
        }
    }
    
    private void acaoAdicionar() {
        CachorroCadastroJFrame cadastro = new CachorroCadastroJFrame();
    }
    
    private void acaoEditar() {
       if(linhaSelecionada > -1){
    
           CachorroCadastroJFrame cad
                   = new CachorroCadastroJFrame(linhaSelecionada);
       }else{
           JOptionPane.showMessageDialog(null, "Selecione algum cachorro","Aviso",
           JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass()
           .getResource("/imagens/trash.png")));
       } 
    }
    
    private void acaoExcluir() {
        if(linhaSelecionada > -1){
            String nome = PrincipalJFrame.cachorros
                    .get(linhaSelecionada).getNome();
            PrincipalJFrame.cachorros.remove(linhaSelecionada);
            modelo.removeRow(linhaSelecionada);
            linhaSelecionada = -1;
            JOptionPane.showMessageDialog(null, "Removido " +nome+ " com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um cachorro","Aviso", 
                    JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass()
                    .getResource("/imagens/trash.png")));
        }
    }
    
    private void definirClickDosBotoes() {
        adicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoAdicionar();
            }
        });
        alterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoEditar();
            }
        });
        excluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoExcluir();
            }
        });
    }
    
    public CachorroListaJFrame(){
        criarTela();
        criarComponentes();
        popularModelo();
        definirPosicoes();
        definirClickDosBotoes();
        adicionarComponentes();
    }
    
    /**
     * Permite que o usuário
     */
                  
    private void definirOnclickTabela(){
        tabela.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                linhaSelecionada = tabela.getSelectedRow();
            }
        });
    }
    
}
