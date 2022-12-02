/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author bolys
 */
public class Cuadrilatero2 extends AbstractPoligono{
    private int alfa, beta;
    private float a, b;
    private float base, altura;

    /**
     *
     */
    public Cuadrilatero2() {
    }

    /**
     *
     * @param alfa
     * @param beta
     * @param a
     * @param b
     * @param base
     * @param altura
     */
    public Cuadrilatero2(int alfa, int beta, float a, float b, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

      /**
     * Regresa el valor de alfa.
     * @return alfa
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Método que establece/modifica el valor de alfa.
     * @param alfa 
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Regresa el valor de beta.
     * @return beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Método que establece/modifica el valor de beta.
     * @param beta 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Regresa el valor de a.
     * @return a
     */
    public float getA() {
        return a;
    }

    /**
     * Método que establece/modifica el valor de a.
     * @param a 
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Regresa el valor de b.
     * @return 
     */
    public float getB() {
        return b;
    }

    /**
     * Método que establece/modifica el valor de b.
     * @param b 
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Regresa el valor de base.
     * @return base
     */
    public float getBase() {
        return base;
    }

    /**
     * Método que establece/modifica el valor de base.
     * @param base 
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Regresa el valor de altura.
     * @return altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Método que establece/modifica el valor de altura
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Regresa el valor del area calculado con 'base y altura'.
     * @return (base*altura)
     */
    @Override
    public double area(){
        return (base*altura);
    }
    
    /**
     * Regresa el valor del perimetro calculado con 'a y b'.
     * @return (a+b)*2
     */
    @Override
    public double perimetro(){
        return (a+b)*2;
    }
    
    
    @Override
    public String toString() {
        return "Cuadrilatero{" + '}';
    }
    
}
