/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author bolys
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Poligono poligono = new Poligono();
        
        // Poligono puede comportarce como Objeto
        Object objeto = new Poligono();
        System.out.println(objeto);
        
        Poligono poligono_2 = new Triangulo();
        System.out.println(poligono_2);
        Poligono poligono_3 = new Cuadrilatero();
        System.out.println(poligono_3);
        
        
        System.out.println("\n############### MÉTODO POLIMORFICO ###############\n");
        poligono = new Poligono();
        getPoligono(poligono);
        poligono = new Triangulo();
        getPoligono(poligono);
        poligono = new Cuadrilatero();
        getPoligono(poligono);
        
        System.out.println("\n############### CLASES ABSTRACTAS ###############\n");
        AbstractPoligono polig;
        polig = new Triangulo_2();
        System.out.println(polig);
        polig = new Cuadrilatero2();
        System.out.println(polig);
        
        System.out.println("\n############### INTERFACES ###############\n");
        // Se puede crear una reerencia de una interfaz pero NO una instancia.
        InstrumentoMusical instrumento;
        
        // Sin embargo una referencia a interfaz puede ser asignada a cualquier Objeto que la implemente.
        instrumento = new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        
        System.out.println("\nUSANDO INTERFAZ 'Meses':");
        System.out.println("El mes numero " + Meses.DOS + 
                            " corresponde a " + Meses.NOMBRES_MESES[Meses.DOS]);
    }
    
    public static void getPoligono(Poligono p){
        if (p instanceof Triangulo){
            System.out.println("EL OBJETO ES UN TRIANGULO.");
        }
        else{
            if (p instanceof Cuadrilatero){
                System.out.println("EL OBJETO ES UN CUADRILATERO.");
            }
            else{
                System.out.println("EL OBJETO ES UN POLIGONO.");
            }
    
        }
    }
    
}
