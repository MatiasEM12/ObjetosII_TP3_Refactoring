package ejercicio_6;

public class CalculadoraPrioritario implements Calculadora {

    @Override
    public double calcularTotalConDescuento(Pedido pedido) {

        return pedido.subtotal() -  pedido.subtotal() * 0.05;
    }
}
