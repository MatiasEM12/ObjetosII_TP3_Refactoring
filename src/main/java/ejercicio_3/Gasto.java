package ejercicio_3;

public class Gasto {
    private TipoDeGasto tipoGasto;
    private int monto;

    public Gasto( TipoDeGasto tipoGasto, int monto) {

        this.monto=monto;
        this.tipoGasto=tipoGasto;

    }

    public TipoDeGasto tipoGasto(){
        return this.tipoGasto;
    }

    public String descripcionGasto(){
        return this.tipoGasto.getDescripcion();
    }

    public int monto(){
        return this.monto;
    }

    public int sumateA(int sumate){
        return sumate=+ this.monto;
    }

    public boolean esTipo(TipoDeGasto criterio) {
        return this.tipoGasto==criterio;
    }

    public boolean esExceso(int limite) {
        return this.monto > limite;
    }

}
