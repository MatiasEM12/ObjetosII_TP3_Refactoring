package Ejercicio_3_Bien;

public class GastoAlquilerDeAuto {

    private TipoDeGasto tipoGasto;
    private int monto;

    public GastoAlquilerDeAuto( int monto) {

        this.monto=monto;
        this.tipoGasto= TipoDeGasto.ALQUILER_AUTO;

    }
}
