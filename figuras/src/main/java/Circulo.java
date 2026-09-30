import com.example.Figura;

public class Circulo extends Figura{

    double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area;

        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {

        double perimetro;
        perimetro = 2 * Math.PI * radio;

        return perimetro;
    }

    @Override 
    public void dibujar(){
        System.out.println("o");
    }

}
