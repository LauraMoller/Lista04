/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Q1;

/**
 *
 * @author molle
 */
public class Retangulo {

    private int altura, comprimento;

    public Retangulo() {
    }

    public Retangulo(int comprimento, int altura) {
        setComprimento(comprimento);
        setAltura(altura);
    }

    public void setAltura(int altura) throws IllegalArgumentException {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para altura: " + altura);
        }
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setComprimento(int comprimento) throws IllegalArgumentException {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor incorreto para comprimento: " + comprimento);
        }
        this.comprimento = comprimento;
    }

    public int getComprimento() {
        return comprimento;
    }

    /**
     * Calcular o perímetro do retângulo
     * @return perímetro do retângulo
     */
    public int calcularPerimetro() {
        return altura * 2 + comprimento * 2;
    }

    /**
     * Calcular a área do retângulo
     * @return área do retângulo
     */
    public int calcularArea() {
        return altura * comprimento;
    }
}
