 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Cristrhian Gustavo Lourenço; DAta 07-18-2017
 */

public class Gato {
    
    /**
     * Atributos -> Caracteristicas
     */
    private String nome, nomeDono, raca, corPelo, marcaRacao,
            corPataTraseiraDireita, corPataTraseiraEsquerda, 
            corPataFrontalDireita, corPataFrontalEsquerda, corOlhoDireito,
            corOlhoEsquerdo;
    private int comprimento, altura, idade, nivelPreguica, quantidadeFiosPelo,
            quantidadeDeCirurgia, quantidadeFilhote, quantidadeDeVida;
    private float peso;
    private boolean fazTosa, fazCirurgia, teveFilhote, castrado, pedigree;
    private char sexo; 

    public Gato() {
    }

    /**
     * 
     * @param nome
     * @param nomeDono
     * @param raca
     * @param corPelo
     * @param marcaRacao
     * @param corPataTraseiraDireita
     * @param corPataTraseiraEsquerda
     * @param corPataFrontalDireita
     * @param corPataFrontalEsquerda
     * @param corOlhoDireito
     * @param corOlhoEsquerdo
     * @param comprimento
     * @param altura
     * @param idade
     * @param nivelPreguica
     * @param quantidadeFiosPelo
     * @param quantidadeDeCirurgia
     * @param quantidadeFilhote
     * @param quantidadeDeVida
     * @param peso
     * @param fazTosa
     * @param fazCirurgia
     * @param teveFilhote
     * @param castrado
     * @param pedigree
     * @param sexo 
     */
    public Gato(String nome, String nomeDono, String raca, String corPelo, String marcaRacao, String corPataTraseiraDireita, String corPataTraseiraEsquerda, String corPataFrontalDireita, String corPataFrontalEsquerda, String corOlhoDireito, String corOlhoEsquerdo, int comprimento, int altura, int idade, int nivelPreguica, int quantidadeFiosPelo, int quantidadeDeCirurgia, int quantidadeFilhote, int quantidadeDeVida, float peso, boolean fazTosa, boolean fazCirurgia, boolean teveFilhote, boolean castrado, boolean pedigree, char sexo) {
        this.nome = nome;
        this.nomeDono = nomeDono;
        this.raca = raca;
        this.corPelo = corPelo;
        this.marcaRacao = marcaRacao;
        this.corPataTraseiraDireita = corPataTraseiraDireita;
        this.corPataTraseiraEsquerda = corPataTraseiraEsquerda;
        this.corPataFrontalDireita = corPataFrontalDireita;
        this.corPataFrontalEsquerda = corPataFrontalEsquerda;
        this.corOlhoDireito = corOlhoDireito;
        this.corOlhoEsquerdo = corOlhoEsquerdo;
        this.comprimento = comprimento;
        this.altura = altura;
        this.idade = idade;
        this.nivelPreguica = nivelPreguica;
        this.quantidadeFiosPelo = quantidadeFiosPelo;
        this.quantidadeDeCirurgia = quantidadeDeCirurgia;
        this.quantidadeFilhote = quantidadeFilhote;
        this.quantidadeDeVida = quantidadeDeVida;
        this.peso = peso;
        this.fazTosa = fazTosa;
        this.fazCirurgia = fazCirurgia;
        this.teveFilhote = teveFilhote;
        this.castrado = castrado;
        this.pedigree = pedigree;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getMarcaRacao() {
        return marcaRacao;
    }

    public void setMarcaRacao(String marcaRacao) {
        this.marcaRacao = marcaRacao;
    }

    public String getCorPataTraseiraDireita() {
        return corPataTraseiraDireita;
    }

    public void setCorPataTraseiraDireita(String corPataTraseiraDireita) {
        this.corPataTraseiraDireita = corPataTraseiraDireita;
    }

    public String getCorPataTraseiraEsquerda() {
        return corPataTraseiraEsquerda;
    }

    public void setCorPataTraseiraEsquerda(String corPataTraseiraEsquerda) {
        this.corPataTraseiraEsquerda = corPataTraseiraEsquerda;
    }

    public String getCorPataFrontalDireita() {
        return corPataFrontalDireita;
    }

    public void setCorPataFrontalDireita(String corPataFrontalDireita) {
        this.corPataFrontalDireita = corPataFrontalDireita;
    }

    public String getCorPataFrontalEsquerda() {
        return corPataFrontalEsquerda;
    }

    public void setCorPataFrontalEsquerda(String corPataFrontalEsquerda) {
        this.corPataFrontalEsquerda = corPataFrontalEsquerda;
    }

    public String getCorOlhoDireito() {
        return corOlhoDireito;
    }

    public void setCorOlhoDireito(String corOlhoDireito) {
        this.corOlhoDireito = corOlhoDireito;
    }

    public String getCorOlhoEsquerdo() {
        return corOlhoEsquerdo;
    }

    public void setCorOlhoEsquerdo(String corOlhoEsquerdo) {
        this.corOlhoEsquerdo = corOlhoEsquerdo;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNivelPreguica() {
        return nivelPreguica;
    }

    public void setNivelPreguica(int nivelPreguica) {
        this.nivelPreguica = nivelPreguica;
    }

    public int getQuantidadeFiosPelo() {
        return quantidadeFiosPelo;
    }

    public void setQuantidadeFiosPelo(int quantidadeFiosPelo) {
        this.quantidadeFiosPelo = quantidadeFiosPelo;
    }

    public int getQuantidadeDeCirurgia() {
        return quantidadeDeCirurgia;
    }

    public void setQuantidadeDeCirurgia(int quantidadeDeCirurgia) {
        this.quantidadeDeCirurgia = quantidadeDeCirurgia;
    }

    public int getQuantidadeFilhote() {
        return quantidadeFilhote;
    }

    public void setQuantidadeFilhote(int quantidadeFilhote) {
        this.quantidadeFilhote = quantidadeFilhote;
    }

    public int getQuantidadeDeVida() {
        return quantidadeDeVida;
    }

    public void setQuantidadeDeVida(int quantidadeDeVida) {
        this.quantidadeDeVida = quantidadeDeVida;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isFazTosa() {
        return fazTosa;
    }

    public void setFazTosa(boolean fazTosa) {
        this.fazTosa = fazTosa;
    }

    public boolean isFazCirurgia() {
        return fazCirurgia;
    }

    public void setFazCirurgia(boolean fazCirurgia) {
        this.fazCirurgia = fazCirurgia;
    }

    public boolean isTeveFilhote() {
        return teveFilhote;
    }

    public void setTeveFilhote(boolean teveFilhote) {
        this.teveFilhote = teveFilhote;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    
    
}
