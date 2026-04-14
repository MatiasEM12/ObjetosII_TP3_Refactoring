package ejercicio_5;

public class EventoComedia extends Evento{
    public static final int LIMITE_BASE_ESPECTADORES = 20;
    public static final int SUMAR = 500;
    public static final int MULTIPLICADOR_SUPERIOR = 10000;
    public static final int MULTIPLICADOR_INFERIOR = 300;
    private ValorEvento monto;

    protected EventoComedia(String nombreEvento, String tipo,ValorEvento monto) {
        super(nombreEvento, tipo);
        this.monto=monto;
    }

    @Override
    public int calcularMonto(int numberoEspectadores) {
        int monto = this.monto.getMonto();
        if (numberoEspectadores > LIMITE_BASE_ESPECTADORES) {
            monto += MULTIPLICADOR_SUPERIOR + SUMAR * (numberoEspectadores - LIMITE_BASE_ESPECTADORES);
        }
        monto += MULTIPLICADOR_INFERIOR * numberoEspectadores;

        return monto;

    }
}
