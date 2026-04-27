package Ejercicio_3;


public class GastoCena extends Gasto{


    public static final int COMPARADOR_CENA_EXCESO= 5000;

    public GastoCena(int monto, String descripcion) throws IllegalArgumentException {
        super(monto, descripcion);
    }

    @Override
    public int sumarComida(int sumate) throws IllegalArgumentException {
        validarSumate(sumate);
        return this.sumateA(sumate);
    }
    @Override
    public boolean esExcesoPorReporteGasto() {
        return this.monto > COMPARADOR_CENA_EXCESO;
    }


    private void validarSumate( int sumate) throws IllegalArgumentException {
        if(sumate < 0) throw new IllegalArgumentException("El sumate no puede ser negativo");
    }
}
