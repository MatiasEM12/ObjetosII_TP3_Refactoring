package ejercicio_6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PedidoTest {

    @Test
    public void ClienteVip(){
        Pedido pedido = new Pedido(10000, new ClienteVip(), new EnvioPrioritario());
        double totalVip = pedido.totalDescuentoVIP();

        assertTrue(totalVip < pedido.subtotal(), "El total con descuento VIP debe ser menor que el subtotal");
    }

    @Test
    public void PedidoPrioritario(){
        Pedido pedido = new Pedido(10000, new ClienteVip(), new EnvioPrioritario());
        double totalPrioritario = pedido.totalDescuestoPrioritario();

        assertTrue(totalPrioritario < pedido.subtotal(), "El total con descuento por envío prioritario debe ser menor que el subtotal");
    }
}
