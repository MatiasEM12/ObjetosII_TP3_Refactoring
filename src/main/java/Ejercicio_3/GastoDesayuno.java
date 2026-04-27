package Ejercicio_3;

public class GastoDesayuno extends Gasto{


    public static final int COMPARADOR_DESAYUNO_EXCESO = 1000;

    public GastoDesayuno(int monto, String descripcion) throws IllegalArgumentException {
        super(monto, descripcion);
    }



    @Override
    public int sumarComida(int sumate) throws IllegalArgumentException {
        validarSumate(sumate);
        return this.sumateA(sumate);
    }

    @Override
    public boolean esExcesoPorReporteGasto() {
        return this.monto > COMPARADOR_DESAYUNO_EXCESO;
    }

    private void validarSumate( int sumate) throws IllegalArgumentException {
        if(sumate < 0) throw new IllegalArgumentException("El sumate no puede ser negativo");
    }
}
