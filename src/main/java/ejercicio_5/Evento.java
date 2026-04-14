package ejercicio_5;



public abstract class Evento {
    private String nombreEvento;
    private String tipo;


    protected Evento(String nombreEvento, String tipo) {
        this.nombreEvento = nombreEvento;
        this.tipo = tipo;

    }

    public String nombreEvento() {
        return nombreEvento;
    }

    public String tipo() {
        return tipo;
    }



    public abstract int  calcularMonto(int numberoEspectadores);

}