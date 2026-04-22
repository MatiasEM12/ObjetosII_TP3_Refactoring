package Ejercicio_3_Bien;

public abstract class   Gasto {

    protected  int monto;
    protected  String descripcion;


    protected Gasto(int monto,String descripcion) throws IllegalArgumentException {

        validarMonto(monto);
        validarDescripcion(descripcion);

        this.monto = monto;
        this.descripcion=descripcion;
    }

    int sumateA(int sumate) {

        return sumate + this.monto;
    }

    public abstract int sumarComida(int sumate);

    public abstract boolean esExcesoPorReporteGasto() ;

    String descripcion() {
        return descripcion;
    }

    int monto() {
        return monto;
    }

    private void validarMonto(int monto) throws IllegalArgumentException {
        if (monto < 0) throw new IllegalArgumentException("El monto no puede ser negativo");
    }

    private void validarDescripcion(String descripcion) throws IllegalArgumentException {
        if(descripcion == null) throw new IllegalArgumentException("La descripcion no puede ser null");
        if(descripcion.isEmpty()) throw new IllegalArgumentException("La descripcion no puede ser vacia");
    }
}