package ejercicio_5;

public enum ValorEvento {
    DRAMA("drama", 40000),
    COMEDIA("comedia", 30000);

    private String tipo;
    private int monto;

    ValorEvento(String tipo, int monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public int getMonto() {
        return monto;
    }
}
