package src;

public class Fraccion {

    // atributos
    private int numerador1;
    private int denominador1;
    private int numerador2;
    private int denominador2;

    // constructores
    public Fraccion(int numerador1, int denominador1, int numerador2, int denominador2) {
        this.numerador1 = numerador1;
        this.denominador1 = denominador2;
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;
    }

    // metodos
    public void sumar() {
        int sumaNumerador;
        int sumaDenominador;
        sumaNumerador = (numerador1 * denominador2) + (numerador2 * denominador1);
        sumaDenominador = denominador1 * denominador2;
        System.out.print("\nLa suma de las fracciones es: " + sumaNumerador + "/" + sumaDenominador);
    }

    public void restar() {
        int restaNumerador;
        int restaDenominador;
        restaNumerador = (numerador1 * denominador2) - (numerador2 * denominador1);
        restaDenominador = denominador1 * denominador2;
        System.out.print("\nLa resta de las fracciones es: " + restaNumerador + "/" + restaDenominador);
    }

    public void multiplicar() {
        int multNumerador;
        int multDenominador;
        multNumerador = numerador1 * numerador2;
        multDenominador = denominador1 * denominador2;
        System.out.print("\nLa multipiclación de las fracciones es: " + multNumerador + "/" + multDenominador);
    }

    public void dividir() {
        int divNumerador;
        int divDenominador;
        divNumerador = numerador1 * denominador2;
        divDenominador = denominador1 * numerador2;
        System.out.print("\nLa división de las fracciones es: " + divNumerador + "/" + divDenominador + "\n");
    }
}
