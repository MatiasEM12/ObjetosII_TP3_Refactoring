package Ejercicio_3_Bien;

public class GastoDesayuno  implements Gasto{

    private TipoDeGasto tipoGasto;
    private int monto;

    public GastoDesayuno( int monto) {

        this.monto=monto;
        this.tipoGasto= TipoDeGasto.DESAYUNO;

    }

    @Override
    public int sumateA(int sumate) {
        return 0;
    }

    @Override
    public int sumarComida() {
        return 0;
    }

    @Override
    public boolean esExceso(int limite) {
        return false;
    }
}
