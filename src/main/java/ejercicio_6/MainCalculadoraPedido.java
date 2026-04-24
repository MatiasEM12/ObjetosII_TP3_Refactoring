package ejercicio_6;



public class MainCalculadoraPedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(10000, true, true);
        Calculadora calculadoraVip = new CalculadoraVip();
        Calculadora calculadoraPrioritario = new CalculadoraPrioritario();

        double totalVip = calculadoraVip.calcularTotalConDescuento(pedido);
        double totalPrioritario = calculadoraPrioritario.calcularTotalConDescuento(pedido);

        System.out.println("Total con descuento VIP: " + totalVip);
        System.out.println("Total con descuento por envio prioritario: " + totalPrioritario);
    }
}
