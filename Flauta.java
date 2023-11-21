package instrumentosmusicales;

/**
 *
 * @author Camila Adrea Humanez
 */
public class Flauta extends Instrumentos {
    
       public Flauta(String marca, String modelo, double precio, String color) {
        super(marca, modelo, precio, color);
    }
       
       public void SonandoFlauta() {
        System.out.println("Sonando la flauta");
    }
       
}
