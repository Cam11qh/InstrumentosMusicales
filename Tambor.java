package instrumentosmusicales;

/**
 *
 * @author Camila Adrea Humanez
 */
public class Tambor extends Instrumentos {
    
       public Tambor(String marca, String modelo, double precio, String color) {
        super(marca, modelo, precio, color);
    }
       
       public void Golpeando() {
        System.out.println("Golpeando el acordeón");
    } 
       
}
