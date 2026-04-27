package ejercicio_5;



public abstract class  Evento {

    protected ValorEvento valorEvento;
    protected String  tipoEvento;
    protected String nombreEvento;

    public Evento(String nombreEvento, ValorEvento valorEvento, String tipoEvento) throws IllegalArgumentException {
         validacionNombreEvento(nombreEvento);
         validacionValorEvento(valorEvento);
         validacionTipoEvento(tipoEvento);
         this.nombreEvento=nombreEvento;
         this.tipoEvento = tipoEvento;
         this.valorEvento = valorEvento;
    }


    public abstract float  calcularMontoPorCalculador(int numeroEspectadores) throws IllegalArgumentException;

    public abstract float calcularExtraComedia(int numeroEspectadores) throws IllegalArgumentException;


    public String nombreEvento(){
        return nombreEvento;
    }

    public int monto(){
        return valorEvento.getMonto();
    }

    public String tipo() {
        return tipoEvento;
    }

    private void validacionNombreEvento(String nombreEvento) throws IllegalArgumentException {
        if (nombreEvento == null || nombreEvento.isEmpty()) {
            throw new IllegalArgumentException("El nombre del evento no puede ser nulo o vacío.");
        }
    }

    private void validacionValorEvento(ValorEvento valorEvento) throws IllegalArgumentException {
        if(valorEvento == null){
            throw new IllegalArgumentException("El valor del evento no puede ser nulo.");
        }
    }
    private void validacionTipoEvento(String tipoEvento) throws IllegalArgumentException {
        if(tipoEvento == null || tipoEvento.isEmpty()){
            throw new IllegalArgumentException("El tipo del evento no puede ser nulo o vacío.");
        }
    }



}