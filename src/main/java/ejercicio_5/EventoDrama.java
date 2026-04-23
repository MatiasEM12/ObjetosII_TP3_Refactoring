package ejercicio_5;

public class EventoDrama extends Evento{


    public EventoDrama(String nombreEvento,ValorEvento valorEvento, TiposDeEventos tipoEvento) {
        super(nombreEvento,valorEvento, tipoEvento);
    }

    @Override
    public float calcularMontoPorCalculador(int numberoEspectadores) {
        float monto = this.valorEvento.getMonto();
        if (numberoEspectadores > Calculador.LIMITE_BASE_ESPECTADORES_DRAMA) {
            monto += Calculador.MULTIPLICADOR_DRAMA * (numberoEspectadores - Calculador.LIMITE_BASE_ESPECTADORES_DRAMA);
        }
        return monto;
    }

    @Override
    public float calcularExtraComedia(int numberoEspectadores) {
        return 0;
    }


}
