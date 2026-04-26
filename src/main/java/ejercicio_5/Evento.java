package ejercicio_5;



public abstract class  Evento {

    protected ValorEvento valorEvento;
    protected String  tipoEvento;
    protected String nombreEvento;

    public Evento(String nombreEvento, ValorEvento valorEvento, String tipoEvento) {
        this.nombreEvento=nombreEvento;
        this.tipoEvento = tipoEvento;
        this.valorEvento = valorEvento;
    }

    public abstract float  calcularMontoPorCalculador(int numeroEspectadores);

    public abstract float calcularExtraComedia(int numeroEspectadores);


    public String nombreEvento(){
        return nombreEvento;
    }

    public int monto(){
        return valorEvento.getMonto();
    }

    public String tipo() {
        return tipoEvento;
    }

}