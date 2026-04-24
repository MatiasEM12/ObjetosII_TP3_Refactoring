package ejercicio_6;

public class CalculadoraPrioritario implements Calculadora {

    @Override
    public double calcularTotalConDescuento(Pedido pedido) {
        double descuento = 0;
        if (pedido.envioPrioritario()) {
            descuento = pedido.subtotal() * 0.05;
        }
        return pedido.subtotal() - descuento;
    }
}
