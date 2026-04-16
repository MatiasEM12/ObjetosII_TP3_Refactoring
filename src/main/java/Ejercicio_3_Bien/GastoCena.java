package Ejercicio_3_Bien;


public class GastoCena {
    private TipoDeGasto tipoGasto;
    private int monto;

    public GastoCena( int monto) {

        this.monto=monto;
        this.tipoGasto= TipoDeGasto.CENA;

    }

}
