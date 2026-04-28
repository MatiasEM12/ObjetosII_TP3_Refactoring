package ejercicio_6;

public class EnvioPrioritario implements Calculadora {

    public static final double MULTIPLICADOR_DESCUENTO = 0.05;

    @Override
    public double calcularTotalConDescuento(double subtotal) throws IllegalArgumentException {
        validarSubTotal(subtotal);
        return subtotal - subtotal * MULTIPLICADOR_DESCUENTO;
    }

    private void validarSubTotal( double subtotal) throws IllegalArgumentException{
        if(subtotal < 0){
            throw new IllegalArgumentException("El subtotal no puede ser negativo");
        }
    }
}
