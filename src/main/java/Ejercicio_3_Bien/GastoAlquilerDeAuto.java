package Ejercicio_3_Bien;



public class GastoAlquilerDeAuto extends Gasto {



    public GastoAlquilerDeAuto(int monto, String descripcion) throws IllegalArgumentException {

        super(monto, descripcion);


    }


    @Override
    public int sumarComida(int sumate) {
        return sumate;
    }

    @Override
    public boolean esExcesoPorReporteGasto() {
        return false;
    }
}
