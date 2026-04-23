package ejercicio_5;

public class EventoComedia extends Evento{

    public EventoComedia(String nombreEvento,ValorEvento valorEvento) {

       super(nombreEvento,valorEvento, TiposDeEventos.COMEDIA);
    }

    @Override
    public float calcularMontoPorCalculador(int numberoEspectadores) {
        float monto = this.valorEvento.getMonto();
        if (numberoEspectadores > Calculador.LIMITE_BASE_ESPECTADORES_COMEDIA) {
            monto += Calculador.MULTIPLICADOR_SUPERIOR_COMEDIA + Calculador.SUMAR_COMEDIA * (numberoEspectadores - Calculador.LIMITE_BASE_ESPECTADORES_COMEDIA);
        }
        monto += Calculador.MULTIPLICADOR_INFERIOR_COMEDIA * numberoEspectadores;

        return monto;

    }

    @Override
    public float calcularExtraComedia(int numberoEspectadores) {
       return (float) Math.floor(numberoEspectadores / 5);
    }


}
