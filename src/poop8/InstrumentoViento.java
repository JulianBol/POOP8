/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author bolys
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{

   /**
    * Método que Imprime en terminal el string "TOCANDO INSTRUMENTO DE VIENTO."
    */
    public void tocar() {
        System.out.println("TOCANDO INSTRUMENTO DE VIENTO.");
    }
    
    /**
     * Método que Imprime en terminal el string "AFINANDO INSTRUMENTO DE VIENTO."
     */
    public void afinar() {
        System.out.println("AFINANDO INSTRUMENTO DE VIENTO.");
    }

    /**
     * Regresa un string indicando el tipo de instrumento que instancia.
     * @return "INSTRUMENTO DE VIENTO."
     */
    public String tipoInstrumento() {
        return "INSTRUMENTO DE VIENTO.";
    }
    
}
