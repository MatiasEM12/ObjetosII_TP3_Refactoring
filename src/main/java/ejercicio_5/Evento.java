package ejercicio_5;



public abstract class  Evento {

    protected ValorEvento valorEvento;
    protected TiposDeEventos tipoEvento;
    protected String nombreEvento;

    public Evento(String nombreEvento, ValorEvento valorEvento, TiposDeEventos tipoEvento) {
        this.nombreEvento=nombreEvento;
        this.tipoEvento = tipoEvento;
        this.valorEvento = valorEvento;
    }

    public abstract float  calcularMontoPorCalculador(int numberoEspectadores);

    public abstract float calcularExtraComedia(int numberoEspectadores);


    public String nombreEvento(){
        return nombreEvento;
    }

    public int monto(){
        return valorEvento.getMonto();
    }

    public String tipo() {
        return tipoEvento.getTipo();
    }

}