package ejercicio_5;

public class EventoComedia implements  Evento{

    private ValorEvento monto;

    private String nombreEvento;
    private String tipo;

    protected EventoComedia(String nombreEvento, String tipo,ValorEvento monto) {
        this.nombreEvento = nombreEvento;
        this.tipo = tipo;
        this.monto=monto;
    }

    @Override
    public int calcularMontoPorCalculador(int numberoEspectadores) {
        int monto = this.monto.getMonto();
        if (numberoEspectadores > Calculador.LIMITE_BASE_ESPECTADORES_COMEDIA) {
            monto += Calculador.MULTIPLICADOR_SUPERIOR_COMEDIA + Calculador.SUMAR_COMEDIA * (numberoEspectadores - Calculador.LIMITE_BASE_ESPECTADORES_COMEDIA);
        }
        monto += Calculador.MULTIPLICADOR_INFERIOR_COMEDIA * numberoEspectadores;

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
