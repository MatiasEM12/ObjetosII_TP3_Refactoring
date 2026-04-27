package ejercicio_1;

public class LibroInfantil extends Libro{


    public static final int COMPARADOR_DIAS_PRECIO =3;
    public static final int RESTA_PRECIO = 3;
    public static final double MULTIPLICADOR_PRECIO = 1.5;
    public static final double MONTO_BASICO = 1.5;

    public LibroInfantil(String nombre) throws IllegalArgumentException {
        super(nombre, CodigoPrecio.INFANTILES);
    }

    @Override
    public double calcularPrecio(int diasAlquilados) throws IllegalArgumentException {
        validarDiasAlguilados(diasAlquilados);
        double precio= MONTO_BASICO;
        if (diasAlquilados > COMPARADOR_DIAS_PRECIO){
            precio += (diasAlquilados - RESTA_PRECIO) * MULTIPLICADOR_PRECIO;
        }
        return precio;
    }

    @Override
    public int bonus(int diasAlquilados) {
        return 0;
    }

    //validaciones
    private void validarDiasAlguilados(int diasAlquilados){
        if(diasAlquilados <= 0) throw  new IllegalArgumentException("Los días alquilados tienes que ser mayor a 0");
    }
}
