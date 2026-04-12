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
        validarDiasAlguilados(diasAlquilados);
        double monto = MONTO;
        if (diasAlquilados > MIN_DIAS){
            monto += (diasAlquilados - MIN_DIAS) * MULTIPLICADOR;
        }

        return monto;
    }

    @Override
    public int bonus(int diasAlquilados) {
        validarDiasAlguilados(diasAlquilados);
        return 0;
    }

    //validaciones
    private void validarDiasAlguilados(int diasAlquilados){
        if(diasAlquilados <= 0) new IllegalArgumentException("Los días alquilados tienes que ser mayor a 0");
    }
}
