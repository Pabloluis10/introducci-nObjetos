package src;

import src.Libro;

public class Principal {

    public static void main(String[] args) {
        Principal ejercicios = new Principal();
    }

    // llamados de los objetos
    public Principal() {
        // Ejercicio1
        System.out.println("<<<<<<<<<<<<<<<<<<<<<< Ejercicio 1 >>>>>>>>>>>>>>>>>>>>>>");
        Contador eje1 = new Contador(2);
        Contador eje1Copia = eje1;
        eje1Copia.setContador(5);
        eje1.incrementar();
        System.out.println("incrementado el contador: " + eje1.getContador());
        eje1.decrementar();
        System.out.println("decrementado el contador: " + eje1.getContador());

        // Ejercicio 2
        System.out.println("\n\n<<<<<<<<<<<<<<<<<<<<<< Ejercicio 2 >>>>>>>>>>>>>>>>>>>>>>");
        Cuadrado eje2 = new Cuadrado(5);
        Cuadrado eje2Copia = eje2;
        eje2Copia.setLado(6);
        System.out.println("El área del cuadrado es: " + eje2.calcularArea());
        System.out.println("El perimetro del cuadrado es. " + eje2.calcularPerimetro());

        // Ejercicio 3
        System.out.println("\n\n<<<<<<<<<<<<<<<<<<<<<< Ejercicio 3 >>>>>>>>>>>>>>>>>>>>>>");
        Circulo eje3 = new Circulo(4);
        Circulo eje3Copia = eje3;
        eje3Copia.setRadio(3);
        System.out.println("El área del circulo es: " + eje3.calcularArea());
        System.out.println("El perimietro del circulo es: " + eje3.calcularPerimetro());

        // Ejercicio 4
        System.out.println("\n\n<<<<<<<<<<<<<<<<<<<<<< Ejercicio 4 >>>>>>>>>>>>>>>>>>>>>>");
        Rectangulo eje4 = new Rectangulo(3, 5);
        Rectangulo eje4Copia = eje4;
        eje4Copia.setAncho(5);
        eje4Copia.setLargo(3);
        System.out.println("El área del rectangulo es: " + eje4.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + eje4.calcularPerimetro());

        // Ejercicio 6
        System.out.println("\n\n<<<<<<<<<<<<<<<<<<<<<< Ejercicio 6 >>>>>>>>>>>>>>>>>>>>>>");
        Libro eje6 = new Libro(15);
        Libro eje6Copia = eje6;
        eje6Copia.prestarLibro(5);
        eje6Copia.mostrarInformacion();

        // Ejercicio 7
        System.out.println("\n\n<<<<<<<<<<<<<<<<<<<<<< Ejercicio 7 >>>>>>>>>>>>>>>>>>>>>>");
        Fraccion eje7 = new Fraccion(5, 3, 7, 6);
        Fraccion eje7Copia = eje7;
        eje7Copia.sumar();
        eje7Copia.restar();
        eje7Copia.multiplicar();
        eje7Copia.dividir();
    }
}
