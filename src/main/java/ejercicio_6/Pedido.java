package ejercicio_6;


public class Pedido {

    private double subtotal;
    private ClienteVip clienteVip;
    private EnvioPrioritario envioPrioritario;
    public static final double DESCUENTO_VIP = 0.15;
    public static final double DESCUENTO_PRIORITARIO = 0.05;


    public Pedido(double subtotal, ClienteVip clienteVip, EnvioPrioritario envioPrioritario) {
        this.subtotal = subtotal;
        this.clienteVip = clienteVip;
        this.envioPrioritario = envioPrioritario;
    }

    public double subtotal() {
        return this.subtotal;
    }

    public ClienteVip clienteVip() {
        return this.clienteVip;
    }

    public EnvioPrioritario envioPrioritario() {
        return this.envioPrioritario;
    }

    public double Calcular(){
        double resultado=0.0;
        //delego en resultado=this.clienteVIP.calcular(subtotal);
        return resultado;


    }

    public double totalDescuestoPrioritario(){

        return this.envioPrioritario.calcularTotalConDescuento(this.subtotal);
    }

    public double totalDescuentoVIP(){

        return this.clienteVip.calcularTotalConDescuento(this.subtotal);
    }
}
