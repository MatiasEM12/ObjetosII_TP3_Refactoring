package ejercicio_6;

public class CalculadoraVip implements Calculadora {

    @Override
    public double calcularTotalConDescuento(Pedido pedido) {
        double descuento = 0;
        if (pedido.clienteVip()) {
            descuento = pedido.subtotal() * 0.15;
        }
        return pedido.subtotal() - descuento;
    }
}
