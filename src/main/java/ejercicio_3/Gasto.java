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

    public int monto(){
        return this.monto;
    }


}
