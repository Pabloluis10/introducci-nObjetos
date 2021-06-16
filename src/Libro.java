package src;

public class Libro {

    // atributos
    private int cantLibros;
    private int cantLibrosPrestados;

    // constructores
    public Libro() {

    }

    public Libro(int cantLibros) {
        this.cantLibros = cantLibros;
        this.cantLibrosPrestados = 0;
    }

    // metodos
    public void prestarLibro(int cantidad) {
        if (cantidad < this.cantLibros) {
            this.cantLibros -= cantidad;
            this.cantLibrosPrestados += cantidad;
            System.out.println("Se han prestado " + cantidad + " libros");
        } else {
            System.out.println("¡No se cuenta con la cantidad deseada de libros!");
        }
    }

    public void devolverLibro(int cantidad) {
        if (cantidad > this.cantLibrosPrestados) {
            this.cantLibrosPrestados = 0;
        } else {
            this.cantLibrosPrestados -= cantidad;
        }

        this.cantLibros += cantidad;
        System.out.println("¡Se han devuelto " + cantidad + " libros!");
    }

    public void mostrarInformacion() {
        System.out.println("========== INFORMACIÓN ==========");
        System.out.println("Cantidad de libros en total: " + (this.cantLibros + this.cantLibrosPrestados));
        System.out.println("Cantidad de libros disponibles: " + this.cantLibros);
        System.out.println("Cantidad de libros prestados: " + this.cantLibrosPrestados);
    }

    public void setCantLibros(int cantidad) {
        this.cantLibros = cantidad;
    }

    public void setCantLibrosPrestados(int cantidad) {
        this.cantLibrosPrestados = cantidad;
    }

    public int getCantLibros() {
        return this.cantLibros;
    }

    public int getCantLibrosPrestados() {
        return this.cantLibrosPrestados;
    }
}
