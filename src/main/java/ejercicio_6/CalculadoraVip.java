package ejercicio_6;

public class CalculadoraVip implements Calculadora {

    @Override
    public double calcularTotalConDescuento(Pedido pedido) {
        return pedido.subtotal() - pedido.subtotal() * 0.15;
    }
}
