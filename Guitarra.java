package instrumentosmusicales;

/**
 *
 * @author Camila Adrea Humanez
 */
public class Guitarra extends Instrumentos{
    
       public Guitarra(String marca, String modelo, double precio, String color) {
        super(marca, modelo, precio, color);
    }
       public void TocandoAcordes() {
        System.out.println("Tocando acordes con la guitarra");
    }
       
}
