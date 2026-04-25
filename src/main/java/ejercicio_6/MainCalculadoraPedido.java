package ejercicio_6;



public class MainCalculadoraPedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(10000, new ClienteVip(), new EnvioPrioritario());



        double totalVip = pedido.totalDescuentoVIP();
        double totalPrioritario = pedido.totalDescuestoPrioritario();

        System.out.println("Total con descuento VIP: " + totalVip);
        System.out.println("Total con descuento por envio prioritario: " + totalPrioritario);
    }
}
