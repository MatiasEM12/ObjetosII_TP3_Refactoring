package ejercicio_1;

public class LibroNuevo extends Libro{



    public LibroNuevo(String nombre) throws IllegalArgumentException {
        super(nombre, CodigoPrecio.NUEVO_LANZAMIENTO);
    }

    @Override
    public double calcularPrecio(int diasAlquilados) throws IllegalArgumentException{
        validarDiasAlguilados(diasAlquilados);

        return  diasAlquilados * Cliente.MULTIPLICADOR_NUEVO_LANZAMIENTO;
    }

    @Override
    public int bonus(int diasAlquilados)  throws IllegalArgumentException{
        validarDiasAlguilados(diasAlquilados);
        if(diasAlquilados > Cliente.DIAS_NUEVO_LANZAMIENTO){
            return 1;
        }
        return 0;
    }

    //validaciones
    private void validarDiasAlguilados(int diasAlquilados)throws IllegalArgumentException {
        if(diasAlquilados <= 0) throw new IllegalArgumentException("Los días alquilados tienes que ser mayor a 0");
    }
}
