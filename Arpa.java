package instrumentosmusicales;

/**
 *
 * @author Camila Adrea Humanez
 */
public class Arpa extends Instrumentos {
    
       public Arpa(String marca, String modelo, double precio, String color) {
        super(marca, modelo, precio, color);
    }
       
       public void Tocando() {
        System.out.println("Tocando el acordeón");
    } 
}
