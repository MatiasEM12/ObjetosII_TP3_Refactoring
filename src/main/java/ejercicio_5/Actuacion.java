package ejercicio_5;



public class Actuacion {

    private String nombreEvento;
    private int numeroEspectadores;

    public Actuacion(String nombreEvento, int numeroEspectadores) {
        this.nombreEvento = nombreEvento;
        this.numeroEspectadores = numeroEspectadores;
    }

    public String nombreEvento() {
        return nombreEvento;
    }

    public int numeroEspectadores() {
        return numeroEspectadores;
    }

    public float calcularCreditos(float creditos){
        creditos += Math.max(numeroEspectadores - 30, 0);
        return creditos;
    }
}