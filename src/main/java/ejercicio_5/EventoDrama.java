package ejercicio_5;

public class EventoDrama extends Evento{


    public EventoDrama(String nombreEvento,ValorEvento valorEvento) {
        super(nombreEvento,valorEvento, TiposDeEventos.DRAMA);
    }

    @Override
    public float calcularMontoPorCalculador(int numberoEspectadores) {

        validarEspectadores(numberoEspectadores);
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

    private void validarEspectadores(int espectadores){
        if(espectadores<0){
            throw new RuntimeException("Los espectadores deben ser mayor a 0");
        }
    }
}
