package Ejercicio_3_Bien;



public class GastoAlquilerDeAuto implements Gasto {


    private int monto;
    private String descripcion="Alquiler de autos";

    public GastoAlquilerDeAuto(int monto) {

        this.monto=monto;


    }

    @Override
    public int sumateA(int sumate) {
        return sumate + this.monto;
    }

    @Override
    public int sumarComida(int sumate) {
        return sumate;
    }

    @Override
    public boolean esExcesoPorReporteGasto() {
        return false;
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
