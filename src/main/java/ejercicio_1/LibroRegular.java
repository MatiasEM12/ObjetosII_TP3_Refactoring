package ejercicio_1;

public class LibroRegular extends Libro {
    protected LibroRegular(String nombre) {
        super(nombre, CodigoPrecio.REGULARES);
    }
}
