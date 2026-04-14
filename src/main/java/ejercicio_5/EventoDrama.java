package ejercicio_5;

public class EventoDrama extends Evento{

    public static final int LIMITE_BASE_ESPECTADORES = 30;
    public static final int MULTIPLICADOR = 1000;
    private ValorEvento monto;
    protected EventoDrama(String nombreEvento, String tipo, ValorEvento monto) {
        super(nombreEvento, tipo);
        this.monto=monto;
    }

    @Override
    public int calcularMonto(int numberoEspectadores) {
        int monto = this.monto.getMonto();
        if (numberoEspectadores > LIMITE_BASE_ESPECTADORES) {
            monto += MULTIPLICADOR * (numberoEspectadores - LIMITE_BASE_ESPECTADORES);
        }
        return monto;
    }
}
