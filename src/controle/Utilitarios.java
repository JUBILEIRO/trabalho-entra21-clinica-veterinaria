/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.NumberFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;

/**
 *
 * @author Cristhian Gustavo Lourenço; Data 07-19-2017
 */
public class Utilitarios {
    
   /**
    * Remove a máscara do peso.
    * @param campo
    * @return 
    */
    
    public static float retornarValorDoPesoSemMascara(JFormattedTextField campo){
       String pesoComMascara = campo.getText();
       pesoComMascara = pesoComMascara.replace("Kg", "");
       pesoComMascara = pesoComMascara.replace(" ", "");
       pesoComMascara = pesoComMascara.replace(",",".");
       return Float.parseFloat(pesoComMascara);
              
    }
    
    /**
     * Converte o número para String concatenando 
     * a unidade de medida
     * @param valor
     * @return o número convertido com a unidade de medida.
     */
    public static String retornarTextoAdicionandoMascara(float valor){
        
      NumberFormat numberFormat=
      NumberFormat.getInstance();
      numberFormat.setMaximumFractionDigits(2);
      numberFormat.setMaximumFractionDigits(2);
      String texto = numberFormat.format(valor);
      texto += "Kg";
      return texto;
    }
    
     public static  Font  minhaFonteDaLista(){
        Font minhaFonte = new Font("IMPACT", Font.PLAIN,24);
        return minhaFonte;
    }
}
