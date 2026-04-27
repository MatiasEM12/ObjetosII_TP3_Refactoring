package Ejercicio_3;



public class GastoAlquilerDeAuto extends Gasto {


    public GastoAlquilerDeAuto(int monto, String descripcion) throws IllegalArgumentException {

        super(monto, descripcion);


    }


    @Override
    public int sumarComida(int sumate) throws IllegalArgumentException {
        validarSumate(sumate);
        return sumate;
    }

    @Override
    public boolean esExcesoPorReporteGasto() {
        return false;
    }

    private void validarSumate( int sumate) throws IllegalArgumentException {
        if(sumate < 0) throw new IllegalArgumentException("El sumate no puede ser negativo");
    }


}