package Ejercicio_3_Bien;


public class GastoCena implements Gasto{

    private int monto;
    private String descripcion="Cena";
    public GastoCena( int monto) {

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
        return this.monto > ReporteDeGastos.LIMITE_CENA;
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
