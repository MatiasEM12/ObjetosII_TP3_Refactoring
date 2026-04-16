package Ejercicio_3_Bien;

public class GastoDesayuno  implements Gasto{


    private int monto;
    private String descripcion="Desayuno";
    public GastoDesayuno( int monto) {

        this.monto=monto;


    }

    @Override
    public int sumateA(int sumate) {
        return sumate + this.monto;
    }

    @Override
    public int sumarComida(int sumate) {
        return this.sumateA(sumate);
    }

    @Override
    public boolean esExceso() {
        return this.monto > ReporteDeGastos.LIMITE_DESAYUNO;
    }
    @Override
    public String descripcion(){
        return this.descripcion;
    }

    @Override
    public int monto() {
        return this.monto;
    }
}
