package ejercicio_5;

public class EventoComedia extends Evento{

    public EventoComedia(String nombreEvento,String tipo) {

       super(nombreEvento,ValorEvento.COMEDIA,tipo);
    }

    @Override
    public float calcularMontoPorCalculador(int numberoEspectadores) {

        validarEspectadores(numberoEspectadores);
        float monto = this.valorEvento.getMonto();
        if (numberoEspectadores > Calculador.LIMITE_BASE_ESPECTADORES_COMEDIA) {
            monto += Calculador.MULTIPLICADOR_SUPERIOR_COMEDIA + Calculador.SUMAR_COMEDIA * (numberoEspectadores - Calculador.LIMITE_BASE_ESPECTADORES_COMEDIA);
        }
        monto += Calculador.MULTIPLICADOR_INFERIOR_COMEDIA * numberoEspectadores;

        return monto;

    }

    @Override
    public float calcularExtraComedia(int numberoEspectadores) {
        validarEspectadores(numberoEspectadores);
        return (float) Math.floor(numberoEspectadores / Calculador.DIVISOR_EXTRA_COMEDIA);
    }


    private void validarEspectadores(int espectadores){
        if(espectadores<0){
            throw new RuntimeException("Los espectadores deben ser mayor a 0");
        }
    }

}
