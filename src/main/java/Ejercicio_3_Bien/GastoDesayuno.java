package Ejercicio_3_Bien;

public class GastoDesayuno extends Gasto{


    public GastoDesayuno(int monto, String descripcion) throws IllegalArgumentException {
        super(monto, descripcion);
    }



    @Override
    public int sumarComida(int sumate) {
        return this.sumateA(sumate);
    }

    @Override
    public boolean esExcesoPorReporteGasto() {
        return this.monto > ReporteDeGastos.LIMITE_DESAYUNO;
    }

}
