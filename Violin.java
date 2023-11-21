package instrumentosmusicales;

/**
 *
 * @author Camila Adrea Humanez
 */
public class Violin extends Instrumentos {
    public Violin(String marca, String modelo, double precio, String color) {
        super(marca, modelo, precio, color);
    }
    
    public void TocandoViolin() {
        System.out.println("Tocando el violin");
    }
}
