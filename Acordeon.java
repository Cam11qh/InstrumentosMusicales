package instrumentosmusicales;

/**
 *
 * @author Camila Adrea Humanez
 */
public class Acordeon extends Instrumentos {

   public Acordeon(String marca, String modelo, double precio, String color) {
        super(marca, modelo, precio, color);
    }
   
   public void comprimir() {
        System.out.println("Comprimiendo el acordeón");
    }

}
