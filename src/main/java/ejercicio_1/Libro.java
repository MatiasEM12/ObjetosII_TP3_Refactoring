package ejercicio_1;



public abstract  class Libro {


    private String nombre;
    private CodigoPrecio codigoPrecio;

    protected  Libro(String nombre, CodigoPrecio priceCode) {
        validarNombre(nombre);
        validarCodigoPrecio(priceCode);
        this.nombre = nombre;
        this.codigoPrecio = priceCode;
    }

    public int codigoPrecio() {
        return codigoPrecio.getValue();
    }

    public String nombre() {
        return nombre;
    }



    abstract public double calcularPrecio(int diasAlquilados) throws IllegalArgumentException;

    abstract public int bonus(int diasAlquilados) throws IllegalArgumentException;

    //validaciones
    private void validarNombre(String nombre) throws IllegalArgumentException{
        if(nombre==null) throw new IllegalArgumentException("El nombre del libro no puede ser nulo.");
        if(nombre.trim().isEmpty()) throw  new IllegalArgumentException("El nombre del libro no puede estar vacío.");

    }

    private void validarCodigoPrecio(CodigoPrecio priceCode) throws IllegalArgumentException{
        if(priceCode == null) throw new IllegalArgumentException("El código de precio no puede ser nulo.");
    }

}