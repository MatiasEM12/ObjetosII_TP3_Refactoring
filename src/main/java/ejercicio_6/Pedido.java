package ejercicio_6;


public class Pedido {

    private double subtotal;
    private boolean clienteVip;//por instancia
    private boolean envioPrioritario;//por instancia
    public static final double DESCUENTO_VIP = 0.15;
    public static final double DESCUENTO_PRIORITARIO = 0.05;


    public Pedido(double subtotal, boolean clienteVip, boolean envioPrioritario) {
        this.subtotal = subtotal;
        this.clienteVip = clienteVip;
        this.envioPrioritario = envioPrioritario;
    }

    public double subtotal() {
        return this.subtotal;
    }

    public boolean clienteVip() {
        return this.clienteVip;
    }

    public boolean envioPrioritario() {
        return this.envioPrioritario;
    }

    public double Calcular(){
        double resultado=0.0;
        //delego en resultado=this.clienteVIP.calcular(subtotal);
        return resultado;


    }

    public double totalDescuestoPrioritario(){
        double total=0;
        if(this.envioPrioritario) {
            Calculadora calculadoraPrioritario = new CalculadoraPrioritario();
            total = calculadoraPrioritario.calcularTotalConDescuento(this);
        }
        return total;
    }

    public double totalDescuentoVIP(){
        double total=0;
        if(this.clienteVip) {
            Calculadora calculadoraVip = new CalculadoraVip();
            total = calculadoraVip.calcularTotalConDescuento(this);
        }
        return total;
    }
}
