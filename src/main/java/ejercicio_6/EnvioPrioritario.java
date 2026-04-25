package ejercicio_6;

public class EnvioPrioritario implements Calculadora {

    public static final double MULTIPLICADOR_DESCUENTO = 0.05;

    @Override
    public double calcularTotalConDescuento(double subtotal) {
        return subtotal - subtotal * MULTIPLICADOR_DESCUENTO;
    }
}
