/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author hooke
 */
public class Capivara {

/**
 * Atributos -> Caracteristicas 
 */    
    
    private String nome, nomeCientifico, trechoDaBeiraDoRioQueDorme;
    private int quantidadeSelfies, tamanho, quantidadeFilhotes, registroIbama, 
            numeroDeRegistroIbama, quantidadeDentes,classificacaoDeNado;
    private float peso, quantidadeDeGramaIngerida;
    private char sexo;
    private boolean vivo;

    public Capivara() {
    }

    /**
     * 
     * @param nome
     * @param nomeCientifico
     * @param trechoDaBeiraDoRioQueDorme
     * @param quantidadeSelfies
     * @param tamanho
     * @param quantidadeFilhotes
     * @param registroIbama
     * @param numeroDeRegistroIbama
     * @param quantidadeDentes
     * @param classificacaoDeNado
     * @param peso
     * @param quantidadeDeGramaIngerida
     * @param sexo
     * @param vivo 
     */
    
    public Capivara(String nome, String nomeCientifico, 
            String trechoDaBeiraDoRioQueDorme, int quantidadeSelfies, 
            int tamanho, int quantidadeFilhotes, int registroIbama, 
            int numeroDeRegistroIbama, int quantidadeDentes, 
            int classificacaoDeNado, float peso,
            float quantidadeDeGramaIngerida, char sexo, boolean vivo) {
        this.nome = nome;
        this.nomeCientifico = nomeCientifico;
        this.trechoDaBeiraDoRioQueDorme = trechoDaBeiraDoRioQueDorme;
        this.quantidadeSelfies = quantidadeSelfies;
        this.tamanho = tamanho;
        this.quantidadeFilhotes = quantidadeFilhotes;
        this.registroIbama = registroIbama;
        this.numeroDeRegistroIbama = numeroDeRegistroIbama;
        this.quantidadeDentes = quantidadeDentes;
        this.classificacaoDeNado = classificacaoDeNado;
        this.peso = peso;
        this.quantidadeDeGramaIngerida = quantidadeDeGramaIngerida;
        this.sexo = sexo;
        this.vivo = vivo;
    }
    //método que permite acessar os atributos com encapsulamento private
    //ou protected
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getTrechoDaBeiraDoRioQueDorme() {
        return trechoDaBeiraDoRioQueDorme;
    }

    public void setTrechoDaBeiraDoRioQueDorme(String trechoDaBeiraDoRioQueDorme) {
        this.trechoDaBeiraDoRioQueDorme = trechoDaBeiraDoRioQueDorme;
    }

    public int getQuantidadeSelfies() {
        return quantidadeSelfies;
    }

    public void setQuantidadeSelfies(int quantidadeSelfies) {
        this.quantidadeSelfies = quantidadeSelfies;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidadeFilhotes() {
        return quantidadeFilhotes;
    }

    public void setQuantidadeFilhotes(int quantidadeFilhotes) {
        this.quantidadeFilhotes = quantidadeFilhotes;
    }

    public int getRegistroIbama() {
        return registroIbama;
    }

    public void setRegistroIbama(int registroIbama) {
        this.registroIbama = registroIbama;
    }

    public int getNumeroDeRegistroIbama() {
        return numeroDeRegistroIbama;
    }

    public void setNumeroDeRegistroIbama(int numeroDeRegistroIbama) {
        this.numeroDeRegistroIbama = numeroDeRegistroIbama;
    }

    public int getQuantidadeDentes() {
        return quantidadeDentes;
    }

    public void setQuantidadeDentes(int quantidadeDentes) {
        this.quantidadeDentes = quantidadeDentes;
    }

    public int getClassificacaoDeNado() {
        return classificacaoDeNado;
    }

    public void setClassificacaoDeNado(int classificacaoDeNado) {
        this.classificacaoDeNado = classificacaoDeNado;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getQuantidadeDeGramaIngerida() {
        return quantidadeDeGramaIngerida;
    }

    public void setQuantidadeDeGramaIngerida(float quantidadeDeGramaIngerida) {
        this.quantidadeDeGramaIngerida = quantidadeDeGramaIngerida;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    
    
    
    
}
