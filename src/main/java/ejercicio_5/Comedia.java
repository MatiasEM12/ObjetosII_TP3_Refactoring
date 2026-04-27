package ejercicio_5;

public class Comedia extends Evento{

    public static final int COMPARADOR_MONTO_CALCULAR = 20;
    public static final int RESTA_MONTO_CALCULAR = 20;
    public static final int MONTO_BASE = 10000;
    public static final int SUMAE_MONTO_BASE = 500;
    public static final int MULTIPLICADOR_MONTO_CALCULAR = 300;
    public static final int DIVISOR_EXTRA = 5;


    public Comedia(String nombreEvento, String tipo) throws IllegalArgumentException {

       super(nombreEvento,ValorEvento.COMEDIA,tipo);
    }

    @Override
    public float calcularMontoPorCalculador(int numeroEspectadores) throws IllegalArgumentException {

        validarEspectadores(numeroEspectadores);
        float monto = this.valorEvento.getMonto();

        if (numeroEspectadores > COMPARADOR_MONTO_CALCULAR) {
            monto += MONTO_BASE + SUMAE_MONTO_BASE * (numeroEspectadores - RESTA_MONTO_CALCULAR);
        }
        monto += MULTIPLICADOR_MONTO_CALCULAR * numeroEspectadores;
        return monto;

    }

    @Override
    public float calcularExtraComedia(int numeroEspectadores) throws IllegalArgumentException {
        validarEspectadores(numeroEspectadores);
        return (float) Math.floor(numeroEspectadores / DIVISOR_EXTRA);
    }


    private void validarEspectadores(int espectadores) throws IllegalArgumentException {
        if(espectadores<0){
            throw new RuntimeException("Los espectadores deben ser mayor a 0");
        }
    }

}
