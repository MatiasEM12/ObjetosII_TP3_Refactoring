package ejercicio_1;



public abstract  class Libro {


    private String nombre;
    private CodigoPrecio codigoPrecio;

    protected  Libro(String nombre, CodigoPrecio priceCode) {
        this.nombre = nombre;
        this.codigoPrecio = priceCode;
    }

    public int codigoPrecio() {
        return codigoPrecio.getValue();
    }

    public String tipoPrecio(){
        return codigoPrecio.name();
    }

    public String nombre() {
        return nombre;
    }

    abstract public double calcularPrecio(int diasAlquilados);

    abstract public int bonus(int diasAlquilados);

    //validaciones
    private void validarNombre(String nombre){
        if(nombre==null) new IllegalArgumentException("El nombre del libro no puede ser nulo.");
        if(nombre.trim().isEmpty()) new IllegalArgumentException("El nombre del libro no puede estar vacío.");

    }

    private void validarCodigoPrecio(CodigoPrecio priceCode){
        if(priceCode == null) new IllegalArgumentException("El código de precio no puede ser nulo.");
    }

}