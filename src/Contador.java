package src;

public class Contador {

    // atributos
    private int contador;

    // constructores
    public Contador() {

    }

    public Contador(int contador) { // constructor con parametros
        this.contador = contador;
    }

    public Contador(Contador copia) { // Constructor copia
        this.contador = copia.contador;
    }

    // metodos

    public void setContador(int valor) {
        this.contador = valor;
    }

    public int getContador() {
        return contador;
    }

    public void incrementar() {
        this.contador++;
    }

    public void decrementar() {
        this.contador--;
    }
}
