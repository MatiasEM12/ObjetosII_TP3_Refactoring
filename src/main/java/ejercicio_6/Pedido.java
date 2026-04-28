package ejercicio_6;



public class Pedido {

    private double subtotal;
    private ClienteVip clienteVip;
    private EnvioPrioritario envioPrioritario;


    public Pedido(double subtotal, ClienteVip clienteVip, EnvioPrioritario envioPrioritario) throws IllegalArgumentException {
        validacionSubTotal(subtotal);
        validacionClienteVip(clienteVip);
        validacionEnvioPrioritario(envioPrioritario);
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


    public double totalDescuestoPrioritario(){

        return this.envioPrioritario.calcularTotalConDescuento(this.subtotal);
    }

    public double totalDescuentoVIP(){

        return this.clienteVip.calcularTotalConDescuento(this.subtotal);
    }

    private void validacionSubTotal(double subtotal) throws IllegalArgumentException{
        if(subtotal < 0){
            throw new IllegalArgumentException("El subtotal no puede ser negativo");
        }
    }

    private void validacionClienteVip(ClienteVip vip) throws IllegalArgumentException{
        if(vip == null){
            throw new IllegalArgumentException("El cliente VIP no puede ser nulo");
        }
    }

    private void validacionEnvioPrioritario(EnvioPrioritario envio) throws IllegalArgumentException{
        if(envio == null){
            throw new IllegalArgumentException("El envío prioritario no puede ser nulo");
        }
    }
}
