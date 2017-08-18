package visao;

import controle.Strings;
import controle.Utilitarios;
import interfaces.AcaoInterface;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Arrays;
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
import javax.swing.text.MaskFormatter;
import modelo.Cachorro;

/**
 * Permitir com que o usuario realize o cadastro do cachorro
 * 
 * @author (name=Cristhian Gustavo Lourenço, date=07-17-2017)
 */
public class CachorroCadastroJFrame extends JFrame implements AcaoInterface{
    private int posicao = -1;
    private JTextField jTextFieldNome, jTextFieldTamanho;
    private JComboBox jComboBoxRaca;
    private JFormattedTextField jFormattedTextFieldPeso;
    private JRadioButton jRadioButtonFemea, jRadioButtonMacho, jRadioButtonVivo, jRadioButtonMorto;
    private JButton jButtonCadastrar, jButtonAlterar, jButtonCancelar;
    private ButtonGroup buttonGroupSexo, buttonGroupEstadoAtual;
    
    public CachorroCadastroJFrame(int posicao){
        //
        this();
        this.posicao = posicao;
        Cachorro cachorro = PrincipalJFrame.cachorros.get(posicao);
        jTextFieldNome.setText(cachorro.getNome());
        jComboBoxRaca.setSelectedItem(cachorro.getRaca());
        jTextFieldTamanho.setText(String.valueOf(cachorro.getTamanho()));
        
        jFormattedTextFieldPeso.setText(Utilitarios.retornarTextoAdicionandoMascara(cachorro.getPeso()));
        if(cachorro.isVivo()){
            jRadioButtonVivo.setSelected(true);
        }else{
            jRadioButtonMorto.setSelected(true);
        }
        if(cachorro.getSexo() == 'F'){
            jRadioButtonFemea.setSelected(true);
        }else{
            jRadioButtonMacho.setSelected(true);
        }
        jButtonCadastrar.setVisible(false);
        jButtonAlterar.setVisible(true);
            
    }
    
    public CachorroCadastroJFrame() {
        createWindow();
        createComponents();
        defineBoundsOfComponents();
        defineOnClick();
        putComponentsOnWindow();
        jButtonAlterar.setVisible(false);
        jButtonCadastrar.setVisible(true);
    }
    
    /**
     * Criar a janela para o usuario ter interação
     */
    private void createWindow() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        setSize(d);
        setLayout(null);
        setTitle("Save the Capybara - Cachorro - Cadastro");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        
        setIconImage(new ImageIcon(
        getClass().getResource("/imagens/iconeAplicativo.png"))
        .getImage());
        
        setContentPane(new JLabel(new ImageIcon(
            getClass().getResource("/imagens/wallpaper.jpg"))));
            
        setVisible(true);
    }
    
    /**
     * Criar a instancia dos componentes para interação
     */
    private void createComponents(){
        jTextFieldNome = new JTextField();
        jTextFieldTamanho = new JTextField();
        
        jRadioButtonVivo = new JRadioButton("Vivo");
        jRadioButtonMorto = new JRadioButton("Morto");
        jRadioButtonFemea = new JRadioButton("Fêmea");
        jRadioButtonMacho =new JRadioButton("Macho");
        
        jRadioButtonVivo.setOpaque(false);
        jRadioButtonMorto.setOpaque(false);
        jRadioButtonFemea.setOpaque(false);
        jRadioButtonMacho.setOpaque(false);
        
        ImageIcon ico = new ImageIcon
                (CachorroCadastroJFrame.class
                .getResource("/imagens/pencil.png"));
        jButtonAlterar = new JButton(ico);
        ico = new ImageIcon(getClass()
              .getResource("/imagens/save.png"));
        jButtonCadastrar = new JButton(ico);
        ico = new ImageIcon(this.getClass()
               .getResource("/imagens/cancel.png"));
        jButtonCancelar = new JButton(ico);
        
        defineTransparencyToButton(jButtonCadastrar);
        defineTransparencyToButton(jButtonAlterar);
        defineTransparencyToButton(jButtonCancelar);
        
        try{
            
        /**
         * criar a máscara para que o peso seja no formato desejado
         */    
        MaskFormatter mascara = new MaskFormatter("##,## Kg");
        /**
         *criar uma instancia do componente passando a máscara como
         * parametro
         */
        jFormattedTextFieldPeso = new JFormattedTextField(mascara);
        
        
        }catch(ParseException parse){
        /**
         * apresenta qual foi a mensagem de erro e finaliza o sistema.
         */
            JOptionPane.showMessageDialog(null, parse.getMessage());
            System.exit(0);
        }
        
        validadeDoubleSelectionJRadioButton();
                
        jComboBoxRaca = new JComboBox();
        popularJComboBoxRaca();  
        //jComboBoxRaca.setSelectedItem(-1);
    }
    
    /**
     * Permite que apenas um JRadioButton seja selecionado por vez
     */
    private void validadeDoubleSelectionJRadioButton(){
        buttonGroupEstadoAtual= new ButtonGroup();
        buttonGroupEstadoAtual.add(jRadioButtonVivo);
        buttonGroupEstadoAtual.add(jRadioButtonMorto);
        
        buttonGroupSexo = new ButtonGroup();
        buttonGroupSexo.add(jRadioButtonFemea);
        buttonGroupSexo.add(jRadioButtonMacho);
    }
    
    
    /**
     * Define a localização dos componentes
     */
    private void defineBoundsOfComponents() {
        createJLabelToUser("Nome", 10, 10, 100, 20);
        jTextFieldNome.setBounds(10, 33, 180, 25);
        
        createJLabelToUser("Tamanho", 200, 10, 100, 22);
        jTextFieldTamanho.setBounds(200, 33, 70, 25);
        
        createJLabelToUser("Raça", 280, 10, 100, 22);
        jComboBoxRaca.setBounds(280, 33, 180, 25);
        
       createJLabelToUser("Sexo", 10, 58, 60, 20);
       jRadioButtonFemea.setBounds(10, 78, 100, 25);
       jRadioButtonMacho.setBounds(110, 78, 100, 25);
       
        createJLabelToUser("Estado Atual", 220, 58, 140, 20);
        jRadioButtonVivo.setBounds(220, 78, 100, 25);
        jRadioButtonMorto.setBounds(320, 78, 100, 25);
        
        createJLabelToUser("Peso", 10, 113, 140, 20);
        jFormattedTextFieldPeso.setBounds(10, 133, 100, 25);
        
        jButtonCancelar.setBounds(10, 200, 65, 65);
        jButtonCadastrar.setBounds(75, 200, 65, 65);
        jButtonAlterar.setBounds(75, 200, 65, 65);
        
    }
    
    /**
     * Método  que criará o JLabel para o usuário saber qual a 
     * utilidade de determinado componente.
     * @param texto
     * @param x
     * @param y
     * @param width
     * @param heigth 
     */
    private void createJLabelToUser(String texto, int x, int y, int width, int heigth){
        JLabel jLabel = new JLabel(texto);
        jLabel.setBounds(x, y, width, heigth);
        add(jLabel);
    }
    
    /**
     * Criar a ação para alguns componentes
     */
    private void defineOnClick() {
        jButtonCadastrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                acaoCadastrar();
            }
        });
        
        jButtonAlterar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                acaoAlterar();
            }
        });
        
        jButtonCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                acaoCancelar();
            }
        });
    }
    
    /**
     * Adiciona os componentes na tela
     */
    private void putComponentsOnWindow(){
        jButtonCadastrar.setVisible(false);
        jButtonAlterar.setVisible(false);
        
        add(jTextFieldNome);
        add(jTextFieldTamanho);
        
        add(jRadioButtonFemea);
        add(jRadioButtonMacho);
        add(jRadioButtonMorto);
        add(jRadioButtonVivo);
        
        add(jButtonCadastrar);
        add(jButtonAlterar);
        add(jButtonCancelar);
        
        add(jComboBoxRaca);
        
        add(jFormattedTextFieldPeso);        
    }
    
    /**
     * Definir as opções  do Combo Box das Raças para o cachorro
     */
    private void popularJComboBoxRaca(){
        String[] racas = new String[]{"Pinscher","Raça Não Definida", "Boxer",
            "Pastor Alemão", "Doberman", "Shih-Tzu", "Pug", "Dalmata",
            "Labrador"};
        Arrays.sort(racas);
        
        jComboBoxRaca.setModel(new DefaultComboBoxModel(racas));
        
        //permite selecionar pelo valor do JComboBox 
        //jComboBoxRaca.setSelectedItem("Dalmata");
        
        jComboBoxRaca.setSelectedIndex(-1);
    }
    
    /**
     * Definir a transparencia para o componente passado como parametro.
     * @param JButton 
     */
    private void defineTransparencyToButton(JButton jButton){
       jButton.setOpaque(false);         
       jButton.setContentAreaFilled(false);
       jButton.setBorderPainted(false);         
       jButton.setFocusPainted(false);         
    }

    @Override
    public void acaoCadastrar() {
        float peso = Utilitarios
              .retornarValorDoPesoSemMascara(jFormattedTextFieldPeso);
       /**
        * cria uma instãncia de cachorro passando todos os parametrôs
        * no construtor necessários para a existencia do cachorro.
        */
        Cachorro cachorro = new Cachorro(
            jTextFieldNome.getText(),
            jComboBoxRaca.getSelectedItem().toString(),
            peso,    
            jRadioButtonVivo.isSelected(),
            Integer.parseInt(jTextFieldTamanho.getText()),
            (jRadioButtonFemea.isSelected()? 'f' : 'm')          
        );
        PrincipalJFrame.cachorros.add(cachorro);
        jButtonCadastrar.setVisible(false);
        jButtonAlterar.setVisible(true);
            JOptionPane.showMessageDialog(null, "Cadastro do" + cachorro.getNome() + "com sucesso");
            if(jTextFieldNome.equals("")){
                JOptionPane.showMessageDialog(null,Strings.CADASTRO_CACHORRO_NOME_NAO_PODE_SER_VAZIO);
                return;
            
        }
    }

    /**
     * Realiza a alteração do cachorro já cadastrado.
     */
    @Override
    public void acaoAlterar() {
        
        Cachorro cachorro = new Cachorro();
        cachorro.setNome(jTextFieldNome.getText());
        cachorro.setRaca(jComboBoxRaca.getSelectedItem().toString());
        cachorro.setSexo(jRadioButtonFemea.isSelected()?'F':'M');
        
       /**
        * morto -> verdadeiro -> falso.
        * morto -> falso -> verdadeiro.
        */
        cachorro.setVivo(!jRadioButtonMorto.isSelected());
        int tamanho = Integer.parseInt(jTextFieldTamanho.getText());
        cachorro.setTamanho(tamanho);
        cachorro.setPeso(Utilitarios.retornarValorDoPesoSemMascara(jFormattedTextFieldPeso));
  
        PrincipalJFrame.cachorros.set(posicao, cachorro);
        JOptionPane.showMessageDialog(null, "Cachorro" +
            cachorro.getNome() + "alterado com sucesso!");
    }
    
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    @Override
    public void acaoCancelar() {
        dispose();
    }
    
   
    
}
