package Ejercicio_3_Bien;


public class GastoCena extends Gasto{


    public GastoCena(int monto, String descripcion) throws IllegalArgumentException {
        super(monto, descripcion);
    }

    @Override
    public int sumarComida(int sumate) {
        return this.sumateA(sumate);
    }
    @Override
    public boolean esExcesoPorReporteGasto() {
        return this.monto > ReporteDeGastos.LIMITE_CENA;
    }

}
