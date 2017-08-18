
package modelo;

/**
 * @author Alunos
 */
public class Cachorro {

    // atributos -> caracteristicas
    private String nome, raca;
    private float peso;
    private boolean vivo;
    private int tamanho;
    private char sexo;

    public Cachorro() {
    }

    /**
     * 
     * @param nome
     * @param raca
     * @param peso
     * @param vivo
     * @param tamanho
     * @param sexo 
     */
    
    public Cachorro(String nome, String raca, float peso, boolean vivo, 
            int tamanho, char sexo) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.vivo = vivo;
        this.tamanho = tamanho;
        this.sexo = sexo;
    }
    
    // metodo que permite acessar os
    // atributos com encapsulamento private ou protected.
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isVivo() {
        return vivo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public char getSexo() {
        return sexo;
    }

    // método que permite definir/alterar
    // os atributos que estao com encapsulamento
    // private ou protected
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
