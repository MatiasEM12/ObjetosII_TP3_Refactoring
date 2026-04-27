package ejercicio_1;

public class LibroRegular extends Libro {


    public static final int COMPARADOR_DIAS_PRECIO = 2;
    public static final int RESTA_PRECIO= 2;
    public static final double MULTIPLICADOR_PRECIO = 1.5;
    public static final int MONTO_BASICO = 2;

    public LibroRegular(String nombre) throws IllegalArgumentException {
        super(nombre, CodigoPrecio.REGULARES);
    }

    @Override
    public double calcularPrecio(int diasAlquilados) throws IllegalArgumentException {
        validarDiasAlguilados(diasAlquilados);
        double monto = MONTO_BASICO;
        if (diasAlquilados > COMPARADOR_DIAS_PRECIO){
            monto += (diasAlquilados - RESTA_PRECIO) * MULTIPLICADOR_PRECIO;
        }


        return monto;
    }

    @Override
    public int bonus(int diasAlquilados) throws IllegalArgumentException {
        validarDiasAlguilados(diasAlquilados);
        return 0;
    }

    //validaciones
    private void validarDiasAlguilados(int diasAlquilados) throws IllegalArgumentException {
        if(diasAlquilados <= 0) throw  new IllegalArgumentException("Los días alquilados tienes que ser mayor a 0");
    }
}
