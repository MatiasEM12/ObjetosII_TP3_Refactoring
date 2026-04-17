package ejercicio_5;

public class EventoDrama implements Evento{


    private ValorEvento monto;
    private String nombreEvento;
    private String tipo;

    protected EventoDrama(String nombreEvento, String tipo, ValorEvento monto) {
        this.nombreEvento = nombreEvento;
        this.tipo = tipo;
        this.monto=monto;
    }

    @Override
    public int calcularMontoPorCalculador(int numberoEspectadores) {
        int monto = this.monto.getMonto();
        if (numberoEspectadores > Calculador.LIMITE_BASE_ESPECTADORES_DRAMA) {
            monto += Calculador.MULTIPLICADOR_DRAMA * (numberoEspectadores - Calculador.LIMITE_BASE_ESPECTADORES_DRAMA);
        }
        return monto;
    }


    @Override
    public String nombreEvento(){
        return this.nombreEvento;
    }

    @Override
    public String tipo() {
        return this.tipo;
    }
}
