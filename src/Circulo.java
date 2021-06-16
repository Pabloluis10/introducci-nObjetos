package src;

public class Circulo {

    // atributos
    private int radio;

    // constructor
    public Circulo(int radio) {
        this.radio = radio;
    }

    // metodos
    public double calcularArea() {
        double PI = 3.141592654;
        double area;
        area = PI * Math.pow(radio, 2);
        return area;
    }

    public double calcularPerimetro() {
        double PI = 3.141592654;
        double perimetro;
        perimetro = 2 * PI * radio;
        return perimetro;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
