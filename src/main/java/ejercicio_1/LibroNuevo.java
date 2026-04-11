package ejercicio_1;

public class LibroNuevo extends Libro{
    protected LibroNuevo(String nombre) {
        super(nombre, CodigoPrecio.NUEVO_LANZAMIENTO);
    }
}
