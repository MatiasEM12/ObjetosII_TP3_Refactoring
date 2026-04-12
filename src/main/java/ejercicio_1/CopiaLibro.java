package ejercicio_1;



public class CopiaLibro {
    private Libro libro;

    public CopiaLibro(Libro libro) {
        validarLibro(libro);
        this.libro = libro;
    }

    public Libro libro() {
        return libro;
    }
    public boolean tieneCodigoPrecio(CodigoPrecio criterio){

        return this.libro.tieneCodigoPrecio(criterio);

    }
    //validaciones
    private void validarLibro(Libro libro){
        if(libro == null) new IllegalArgumentException("El libro no puede ser nulo.");
    }

    public double calcular(int diasAlquilados) {
        return this.libro.calcularPrecio(diasAlquilados);
    }

    public int obtenerBonus(int diasAlquilados) {
        return this.libro.bonus(diasAlquilados);

    }


}