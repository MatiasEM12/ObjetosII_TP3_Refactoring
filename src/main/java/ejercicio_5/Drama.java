package ejercicio_5;

public class Drama extends Evento{


    public Drama(String nombreEvento, String tipo) {
        super(nombreEvento,ValorEvento.DRAMA, tipo);
    }

    @Override
    public float calcularMontoPorCalculador(int numeroEspectadores) {

        validarEspectadores(numeroEspectadores);
        float monto = this.valorEvento.getMonto();

        if (numeroEspectadores > 30) {
            monto += 1000 * (numeroEspectadores - 30);
        }

        return monto;
    }

    @Override
    public float calcularExtraComedia(int numeroEspectadores) {
        return 0;
    }

    private void validarEspectadores(int espectadores){
        if(espectadores<0){
            throw new RuntimeException("Los espectadores deben ser mayor a 0");
        }
    }
}
