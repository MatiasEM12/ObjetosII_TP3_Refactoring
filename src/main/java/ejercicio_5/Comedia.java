package ejercicio_5;

public class Comedia extends Evento{

    public Comedia(String nombreEvento, String tipo) {

       super(nombreEvento,ValorEvento.COMEDIA,tipo);
    }

    @Override
    public float calcularMontoPorCalculador(int numeroEspectadores) {

        validarEspectadores(numeroEspectadores);
        float monto = this.valorEvento.getMonto();

        if (numeroEspectadores > 20) {
            monto += 10000 + 500 * (numeroEspectadores - 20);
        }
        monto += 300 * numeroEspectadores;
        return monto;

    }

    @Override
    public float calcularExtraComedia(int numeroEspectadores) {
        validarEspectadores(numeroEspectadores);
        return (float) Math.floor(numeroEspectadores / 5);
    }


    private void validarEspectadores(int espectadores){
        if(espectadores<0){
            throw new RuntimeException("Los espectadores deben ser mayor a 0");
        }
    }

}
