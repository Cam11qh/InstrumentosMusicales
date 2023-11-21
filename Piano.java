package instrumentosmusicales;


public class Piano extends Instrumentos{
  
 public Piano(String marca, String modelo, double precio, String color) {
        super(marca, modelo, precio, color);
    }
 public void TocarPiano() {
        System.out.println("Tocando el piano");
    }
}
