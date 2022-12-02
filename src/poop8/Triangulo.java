/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author bolys
 */
public class Triangulo extends Poligono{
    private int alpha, beta, gama;
    private float a, b, c;
    private float base, altura;

    /**
     * CONSTRUCTOR VACIO.
     */
    public Triangulo() {
    }

    /**
     * CONSTRUCTOR QUE INICIALIZA LOS ATRIBUTOS DE LA CLASE.
     * @param alpha
     * @param beta
     * @param gama
     * @param a
     * @param b
     * @param c
     * @param base
     * @param altura 
     */
    public Triangulo(int alpha, int beta, int gama, float a, float b, float c, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Regresa el valor de alpha.
     * @return alpha
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * Método que establece/modifica el valor de alpha.
     * @param alpha 
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
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
     * Regresa el valor de gama.
     * @return gama
     */
    public int getGama() {
        return gama;
    }

    /**
     * Método que establece/modifica el valor de gama.
     * @param gama 
     */
    public void setGama(int gama) {
        this.gama = gama;
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
     * @return b
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
     * Regresa el valor de c.
     * @return c
     */
    public float getC() {
        return c;
    }

    /**
     * Método que establece/modifica el valor de c.
     * @param c 
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Regresa el valor de base
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
     * Método que establece/modifica el valor de altura.
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Regresa el valor del area calculado con 'base' y 'altura'
     * @return (base*altura)/2
     */
    @Override
    public double area(){
        return (base*altura)/2;
    }
    
    /**
     * Regresa el valor del perimetro calculado con 'a, b y c'
     * @return a+b+c
     */
    @Override
    public double perimetro(){
        return a+b+c;
    }

    @Override
    public String toString() {
        return "Triangulo{" + '}';
    }
    
    
}
