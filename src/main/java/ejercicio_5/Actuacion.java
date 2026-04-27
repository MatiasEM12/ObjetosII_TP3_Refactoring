package ejercicio_5;



public class Actuacion {

    public static final int RESTA_CREDITOS= 30;
    private String nombreEvento;
    private int numeroEspectadores;

    public Actuacion(String nombreEvento, int numeroEspectadores) throws IllegalArgumentException {
        validacionNombreEvento(nombreEvento);
        validacionNumeroEspectadores(numeroEspectadores);
        this.nombreEvento = nombreEvento;
        this.numeroEspectadores = numeroEspectadores;
    }

    public String nombreEvento() {
        return nombreEvento;
    }

    public int numeroEspectadores() {
        return numeroEspectadores;
    }

    public float calcularCreditos(float creditos) throws IllegalArgumentException {
        validacionCredito(creditos);
        creditos += Math.max(numeroEspectadores - RESTA_CREDITOS, 0);
        return creditos;
    }

    private void validacionNombreEvento( String nombreEvento) throws IllegalArgumentException {
        if (nombreEvento == null || nombreEvento.isEmpty()) {
            throw new IllegalArgumentException("El nombre del evento no puede ser nulo o vacío.");
        }
    }

    private void validacionNumeroEspectadores(int numeroEspectadores) throws IllegalArgumentException {
        if (numeroEspectadores < 0) {
            throw new IllegalArgumentException("El número de espectadores no puede ser negativo.");
        }
    }

    private void validacionCredito( float creditos) throws IllegalArgumentException {
        if(creditos < 0){
            throw new IllegalArgumentException("Los créditos no pueden ser negativos.");
        }
    }
}