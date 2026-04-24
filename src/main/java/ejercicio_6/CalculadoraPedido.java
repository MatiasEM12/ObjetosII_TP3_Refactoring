package ejercicio_6;

public class CalculadoraPedido {



        public double calcularTotalConDescuentoVip(Pedido pedido) {
//            double descuento = 0;
//            if (pedido.clienteVip()) {
//                descuento = pedido.subtotal() * 0.15;
//            }
//            return pedido.subtotal() - descuento;

            return pedido.calcular();
        }

        public double calcularTotalConDescuentoPrioritario(Pedido pedido) {
//            double descuento = 0;
//            if (pedido.envioPrioritario()) {
//                descuento = pedido.subtotal() * 0.05;
//            }
//            return pedido.subtotal() - descuento;
        }

}
