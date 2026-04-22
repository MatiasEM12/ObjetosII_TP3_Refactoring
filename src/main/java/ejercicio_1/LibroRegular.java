package ejercicio_1;

public class LibroRegular extends Libro {



    public LibroRegular(String nombre) throws IllegalArgumentException {
        super(nombre, CodigoPrecio.REGULARES);
    }

    @Override
    public double calcularPrecio(int diasAlquilados) throws IllegalArgumentException {
        validarDiasAlguilados(diasAlquilados);
        double monto = Cliente.MONTO_BASICO_REGULAR;
        if (diasAlquilados > Cliente.DIAS_REGULAR){
            monto += (diasAlquilados - Cliente.DIAS_REGULAR) * Cliente.MULTIPLICADOR_REGULAR;
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
