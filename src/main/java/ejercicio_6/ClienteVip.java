package ejercicio_6;

public class ClienteVip implements Calculadora {


    public static final double MULTIPLICADOR_DESCUENTO = 0.15;

    @Override
    public double calcularTotalConDescuento(double subtotal) {
         return subtotal - subtotal * MULTIPLICADOR_DESCUENTO;
    }
}
