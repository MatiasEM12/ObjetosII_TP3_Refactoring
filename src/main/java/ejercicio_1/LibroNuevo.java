package ejercicio_1;

public class LibroNuevo extends Libro{

    private static int MULTIPLICADOR=3;
    private static int MIN_DIAS_BONUS=1;

    public LibroNuevo(String nombre) {
        super(nombre, CodigoPrecio.NUEVO_LANZAMIENTO);
    }

    @Override
    public double calcularPrecio(int diasAlquilados) {
        return  diasAlquilados * MULTIPLICADOR;
    }

    @Override
    public int bonus(int diasAlquilados) {

        if(diasAlquilados > MIN_DIAS_BONUS){
            return 1;
        }
        return 0;
    }


}
