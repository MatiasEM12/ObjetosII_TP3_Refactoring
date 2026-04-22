package ejercicio_1;

public class LibroInfantil extends Libro{



    public LibroInfantil(String nombre) throws IllegalArgumentException {
        super(nombre, CodigoPrecio.INFANTILES);
    }

    @Override
    public double calcularPrecio(int diasAlquilados) throws IllegalArgumentException {
        validarDiasAlguilados(diasAlquilados);
        double precio=Cliente.MONTO_BASICO_INFANTIL;
        if (diasAlquilados > Cliente.DIAS_INFANTILES){
            precio += (diasAlquilados - Cliente.DIAS_INFANTILES) * Cliente.MULTIPLICADOR_INFANTIL;
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
