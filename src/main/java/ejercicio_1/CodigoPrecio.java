package ejercicio_1;

public enum CodigoPrecio {
    INFANTILES(2), REGULARES(0), NUEVO_LANZAMIENTO(1);
    private final int value;

    CodigoPrecio(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}