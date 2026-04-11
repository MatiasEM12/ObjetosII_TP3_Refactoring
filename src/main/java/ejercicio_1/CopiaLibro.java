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

    //validaciones
    private void validarLibro(Libro libro){
        if(libro == null) new IllegalArgumentException("El libro no puede ser nulo.");
    }
}