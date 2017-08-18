/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.Utilitarios;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javafx.scene.control.ComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import modelo.Gato;

/**
 *
 * @author Cristhian Gustavo Lourenço; Data 07-20-2017.
 */
public class GatoCadastroJFrame extends JFrame {
    
            private int posicao = -1;
   
            private JTextField jTextFieldNome, jTextFieldNomeDono, jTextFieldCorPelo,  jTextFieldMarcaRacao,
                    jTextFieldCorPataTraseiraDireita, jTextFieldCorPataTraseiraEsquerda, jTextFieldCorPataFrontalDireita,
                    jTextFieldCorPataFrontalEsquerda, jTextFieldCorOlhoDireito, jTextFieldCorOlhoEsquerdo,
                    jTextFieldIdade, jTextFieldNivelPreguica,jTextFieldComprimento, jTextFieldAltura,
                    jTextFieldQuantidadeFiosPelo, jTextFieldQuantidadeDeCirurgias,
                    jTextFieldQuantidadeFilhotes,
                    jTextFieldQuantidadeDeVidas;
            
            private JComboBox jComboBoxRaca;
            
            private JRadioButton jRadioButtonSimTosa, jRadioButtonNaoTosa, jRadioButtonSimCirurgia,
                    jRadioButtonNaoCirurgia, jRadioButtonSimFilhotes, jRadioButtonNaoFilhotes,
                    jRadioButtonSimCastracao, jRadioButtonNaoCastracao, jRadioButtonSimPedigree,
                     jRadioButtonNaoPedigree;
            
            private ButtonGroup buttonGroupFazTosa, buttonGroupFazCirurgias, buttonGroupTeveFilhotes, 
                    buttonGroupTeveCastracao, buttonGroupTemPedigree;  
            
            private JFormattedTextField jFormattedTextFieldPeso, jFormattedTextFieldComprimento, jFormattedTextFieldAltura;
            
            private JButton jButtonCadastrarGato, jButtonAlterarGato, jButtonCancelarGato;
            
    public GatoCadastroJFrame(int posicao){
        //this serve para pegar uma resultado de uma variavel.
        this();
        this.posicao = posicao;
        Gato gato = PrincipalJFrame.gatos.get(posicao);
        jTextFieldNome.setText(gato.getNome());
        
    }        

    public GatoCadastroJFrame() {
        criarTelaCadastroGato();
        criarComponentesDoCadastro();
        defineBoundsOfComponents();
        defineOnClick();
        colocarComponentesNaTela();
        jButtonAlterarGato.setVisible(false);
        jButtonCadastrarGato.setVisible(false);
        
    }
                   
    private void criarTelaCadastroGato(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        setSize(d);
        setLayout(null);
        setTitle("Save the Capybara - Gato - Cadastro");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        
        setIconImage(new ImageIcon(
        getClass().getResource("/imagens/iconeAplicativo.png"))
        .getImage());
        
        setContentPane(new JLabel(new ImageIcon(
        getClass().getResource("/imagens/walpaper.jpg"))));
        
        setVisible(true);
        
        
        
    }
    
    /**
     * Método para criar Botôes
     */
    private void criarComponentesDoCadastro(){
        //Criando os Botões
        jButtonCadastrarGato = new JButton();
        jButtonAlterarGato = new JButton();
        jButtonCancelarGato = new JButton();
        
        
        
    }
   
    private void validadeDobleSelectionJRadioButtovalidar(){
        buttonGroupFazTosa = new ButtonGroup();
        buttonGroupFazTosa.add(jRadioButtonSimTosa);
        buttonGroupFazTosa.add(jRadioButtonNaoTosa);
                
        buttonGroupFazCirurgias = new ButtonGroup();
        buttonGroupFazCirurgias.add(jRadioButtonSimCirurgia);
        buttonGroupFazCirurgias.add(jRadioButtonNaoCirurgia);
                
        buttonGroupTeveFilhotes = new ButtonGroup();
        buttonGroupTeveFilhotes.add(jRadioButtonSimFilhotes);
        buttonGroupTeveFilhotes.add(jRadioButtonNaoFilhotes);
                
        buttonGroupTeveCastracao = new ButtonGroup();
        buttonGroupTeveCastracao.add(jRadioButtonSimCastracao);
        buttonGroupTeveCastracao.add(jRadioButtonNaoCastracao);
                
        buttonGroupTemPedigree = new ButtonGroup();
        buttonGroupTemPedigree.add(jRadioButtonSimPedigree);
        buttonGroupTemPedigree.add(jRadioButtonSimPedigree);
        
        
    }
    
    /**
     * Tenho que Colocar as Posições das Imagens.
     */
    private void defineBoundsOfComponents(){
        //Botoes de Ações
       jButtonCadastrarGato.setBounds( 10, 10, 100, 20);
       jButtonAlterarGato.setBounds( 10, 10, 100, 20);
       jButtonCancelarGato.setBounds( 10, 10, 100, 20);
        
      
       criarJLabelParaUsuario("Nome", 10, 10, 100, 20);
       jTextFieldNome.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Nome Do Dono", 10, 10, 100, 20);
       jTextFieldNomeDono.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Cor Do Pelo", 10, 10, 100, 20);
       jTextFieldCorPelo.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Marca Da Ração", 10, 10, 100, 20);
       jTextFieldMarcaRacao.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Cor Da Pata Traseira Direita", 10, 10, 100, 20);
       jTextFieldCorPataTraseiraDireita.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Cor Da Pata Traseira Esquerda", 10, 10, 100, 20);
       jTextFieldCorPataTraseiraEsquerda.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Cor Da Pata Frontal Direita", 10, 10, 100, 20);
       jTextFieldCorPataFrontalDireita.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Cor Da Pata Frontal Esquerda", 10, 10, 100, 20);
       jTextFieldCorPataFrontalEsquerda.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Cor Do Olho Direito", 10, 10, 100, 20);
       jTextFieldCorOlhoDireito.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Cor Do Olho Esquerdo", 10, 10, 100, 20);
       jTextFieldCorOlhoEsquerdo.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Idade", 10, 10, 100, 20);
       jTextFieldIdade.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Nível De Preguiça", 10, 10, 100, 20);
       jTextFieldNivelPreguica.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Quantidade De Fios Pelo", 10, 10, 100, 20);
       jTextFieldQuantidadeFiosPelo.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Quantidade De Cirurgias", 10, 10, 100, 20);
       jTextFieldQuantidadeDeCirurgias.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Quantidade De Filhotes", 10, 10, 100, 20);
       jTextFieldQuantidadeFilhotes.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Quantidade De Vidas", 10, 10, 100, 20);
       jTextFieldQuantidadeDeVidas.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Raça", 10, 10, 100, 20);
      
       criarJLabelParaUsuario("Peso", 10, 10, 100, 20);
       
       criarJLabelParaUsuario("Comprimento", 10, 10, 100, 20);
       jTextFieldComprimento.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Altura", 10, 10, 100, 20);
       jTextFieldAltura.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Faz Tosa", 10, 10, 100, 20);
       jRadioButtonSimTosa.setBounds(10, 33, 180, 25);
       jRadioButtonNaoTosa.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Fez Cirurgias", 10, 10, 100, 20);
       jRadioButtonSimCirurgia.setBounds(10, 33, 180, 25);
       jRadioButtonNaoCirurgia.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Teve Filhotes", 10, 10, 100, 20);
       jRadioButtonSimFilhotes.setBounds(10, 33, 180, 25); 
       jRadioButtonNaoFilhotes.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Teve Castração", 10, 10, 100, 20);
       jRadioButtonSimCastracao.setBounds(10, 33, 180, 25);
       jRadioButtonNaoCastracao.setBounds(10, 33, 180, 25);
       
       criarJLabelParaUsuario("Tem Pedigree", 10, 10, 100, 20);
       jRadioButtonSimPedigree.setBounds(10, 33, 180, 25);
       jRadioButtonNaoPedigree.setBounds(10, 33, 180, 25);     
    }
   
    private void criarJLabelParaUsuario(String texto, int x, int y, int width, int heigth){
        JLabel jLabel = new JLabel(texto);
        jLabel.setBounds(x, y, width, heigth);
        add(jLabel);
    }
   
    private void defineOnClick(){
        jButtonCadastrarGato.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                acaoCadastrarGato();
            }
        });
        
        jButtonAlterarGato.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                acaoAlterarGato();
            }
        });
        
        jButtonCancelarGato.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                acaoCancelar();
            }
        });
    }
   
    private void colocarComponentesNaTela(){
        
        add(jButtonCadastrarGato);
        add(jButtonAlterarGato);
        add(jButtonCancelarGato);
        add(jTextFieldNome);
        add(jTextFieldNomeDono); 
        add(jTextFieldCorPelo);  
        add(jTextFieldMarcaRacao);
        add(jTextFieldCorPataTraseiraDireita); 
        add(jTextFieldCorPataTraseiraEsquerda); 
        add(jTextFieldCorPataFrontalDireita);
        add(jTextFieldCorPataFrontalEsquerda); 
        add(jTextFieldCorOlhoDireito);
        add(jTextFieldCorOlhoEsquerdo);
        add(jTextFieldIdade);
        add(jTextFieldNivelPreguica);
        add(jTextFieldQuantidadeFiosPelo);
        add(jTextFieldQuantidadeDeCirurgias);
        add(jTextFieldQuantidadeFilhotes);
        add(jTextFieldQuantidadeDeVidas);
        add(jRadioButtonSimTosa);
        add(jRadioButtonNaoTosa);
        add(jRadioButtonSimCirurgia);
        add(jRadioButtonNaoCirurgia);
        add(jRadioButtonSimFilhotes);
        add(jRadioButtonNaoFilhotes);
        add(jRadioButtonSimCastracao);
        add(jRadioButtonNaoCastracao);
        add(jRadioButtonSimPedigree);
        add(jRadioButtonNaoPedigree);
        
        
        
    }
   
    private void popularJComboBox(){
        String[] racas = new String[]{"Persa","Siamês","Himalaia",
            "Maine Coon", "Angorá", "Siberiano", "Sphynx", "Burmese","Ragdoll",
            "British Shorthair"};
        Arrays.sort(racas);
        
        jComboBoxRaca.setModel(new DefaultComboBoxModel(racas));
        
        jComboBoxRaca.setSelectedIndex(-1);
            
        
    }

    private void definirATransparenciaDoBotao(JButton jButton){
        jButton.setOpaque(false);
        jButton.setContentAreaFilled(false);
        jButton.setBorderPainted(false);
        jButton.setFocusPainted(false);
    }
    
    public void acaoCadastrarGato(){
        float peso = Utilitarios
              .retornarValorDoPesoSemMascara(jFormattedTextFieldPeso);
        Gato gato = new Gato(
            jTextFieldNome.getText(),
            jComboBoxRaca.getSelectedItem().toString(),
            peso,
            jRadioButtonSimTosa.isSelected(),
            jRadioButtonSimCirurgia.isSelected(),
            jRadioButtonSimFilhotes.isSelected(),
            jRadioButtonSimCastracao.isSelected(),
            jRadioButtonSimPedigree.isSelected(),
            Integer.parseInt(jTextFieldAltura.getText())
        );
        PrincipalJFrame.gatos.add(gato);
        jButtonCadastrarGato.setVisible(false);
        jButtonAlterarGato.setVisible(true);
            JOptionPane.showMessageDialog(null,"Cadastro do" + gato.getNome() + "com sucesso");
            if(jTextFieldNome.equals("")){
                JOptionPane.showMessageDialog(null,"Nome não pode ser vazio");
                return;
            }
         
         
    }
    
    public void acaoAlterarGato(){
        
    }
   
    public void acaoCancelar(){
        
    }
    
    public void setPosicoes(){
        
    }
    
}
