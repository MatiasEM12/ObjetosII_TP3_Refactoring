package ejercicio_1;

public class LibroRegular extends Libro {

    private static int MONTO=2;
    private static double MULTIPLICADOR=1.5;
    private static int MIN_DIAS=2;

    public LibroRegular(String nombre) {
        super(nombre, CodigoPrecio.REGULARES);
    }

    @Override
    public double calcularPrecio(int diasAlquilados) {
        double monto = MONTO;
        if (diasAlquilados > MIN_DIAS){
            monto += (diasAlquilados - MIN_DIAS) * MULTIPLICADOR;
        }

        return monto;
    }

    @Override
    public int bonus(int diasAlquilados) {
        return 0;
    }
}
