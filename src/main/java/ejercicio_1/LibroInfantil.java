package ejercicio_1;

public class LibroInfantil extends Libro{

    private static double MONTO=1.5;
    private static int MIN_DIAS=3;

    public LibroInfantil(String nombre) {
        super(nombre, CodigoPrecio.INFANTILES);
    }

    @Override
    public double calcularPrecio(int diasAlquilados) {
        validarDiasAlguilados(diasAlquilados);
        double precio=MONTO;
        if (diasAlquilados > MIN_DIAS){
            precio += (diasAlquilados - MIN_DIAS) * MONTO;
        }
        return precio;
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
