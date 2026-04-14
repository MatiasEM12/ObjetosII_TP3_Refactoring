package ejercicio_5;

public enum TiposDeEventos {
    DRAMA("drama"),
    COMEDIA("comedia");

    private String tipo;

    TiposDeEventos(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
