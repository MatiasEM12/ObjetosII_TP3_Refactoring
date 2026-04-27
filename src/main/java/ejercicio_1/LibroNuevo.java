package ejercicio_1;

public class LibroNuevo extends Libro{


    public static final int MULTIPLICADOR_PRECIO = 3;
    public static final int COMPARADOR_DIA_BONUS = 1;

    public LibroNuevo(String nombre) throws IllegalArgumentException {
        super(nombre, CodigoPrecio.NUEVO_LANZAMIENTO);
    }

    @Override
    public double calcularPrecio(int diasAlquilados) throws IllegalArgumentException{
        validarDiasAlguilados(diasAlquilados);

        return  diasAlquilados * MULTIPLICADOR_PRECIO;
    }

    @Override
    public int bonus(int diasAlquilados)  throws IllegalArgumentException{
        validarDiasAlguilados(diasAlquilados);
        if(diasAlquilados > COMPARADOR_DIA_BONUS){
            return COMPARADOR_DIA_BONUS;
        }
        return 0;
    }

    //validaciones
    private void validarDiasAlguilados(int diasAlquilados)throws IllegalArgumentException {
        if(diasAlquilados <= 0) throw new IllegalArgumentException("Los días alquilados tienes que ser mayor a 0");
    }
}
