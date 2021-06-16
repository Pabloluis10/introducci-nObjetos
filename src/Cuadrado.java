package src;

public class Cuadrado {

    // atributos
    private int lado;

    // constructor
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // metodos
    public int calcularArea() {
        int area;
        area = (int) Math.pow(lado, 2);
        return area;
    }

    public int calcularPerimetro() {
        int perimetro;
        perimetro = 4 * lado;
        return perimetro;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
