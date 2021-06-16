package src;

public class Rectangulo {

    // atributos
    private int ancho;
    private int largo;

    // constructor
    public Rectangulo(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    // metodos
    public double calcularArea() {
        int area;
        area = ancho * largo;
        return area;
    }

    public double calcularPerimetro() {
        int perimetro;
        perimetro = 2 * ancho + 2 * largo;
        return perimetro;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
}
