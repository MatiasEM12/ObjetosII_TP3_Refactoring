package ejercicio_5;

public class Drama extends Evento{


    public static final int COMPARADOR_MONTO_CALCULAR = 30;
    public static final int RESTA_MONTO_CALCULAR = 30;
    public static final int MONTO_BASE = 1000;

    public Drama(String nombreEvento, String tipo) throws IllegalArgumentException {
        super(nombreEvento,ValorEvento.DRAMA, tipo);
    }

    @Override
    public float calcularMontoPorCalculador(int numeroEspectadores) throws IllegalArgumentException {

        validarEspectadores(numeroEspectadores);
        float monto = this.valorEvento.getMonto();

        if (numeroEspectadores >  COMPARADOR_MONTO_CALCULAR) {
            monto += MONTO_BASE * (numeroEspectadores - RESTA_MONTO_CALCULAR);
        }

        return monto;
    }

    @Override
    public float calcularExtraComedia(int numeroEspectadores) {
        return 0;
    }

    private void validarEspectadores(int espectadores) throws IllegalArgumentException {
        if(espectadores<0){
            throw new RuntimeException("Los espectadores deben ser mayor a 0");
        }
    }
}
