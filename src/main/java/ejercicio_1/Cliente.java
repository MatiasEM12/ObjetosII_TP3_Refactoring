package ejercicio_1;


import java.util.ArrayList;
import java.util.List;


public class Cliente {

    public static  final int MONTO_BASICO_REGULAR=2;
    public static  final double MONTO_BASICO_INFANTIL=1.5;


    public static  final double MULTIPLICADOR_REGULAR=1.5;
    public static  final int MULTIPLICADOR_NUEVO_LANZAMIENTO=3;
    public static  final double MULTIPLICADOR_INFANTIL=1.5;

    public static final int DIAS_INFANTILES=3;
    public static final int DIAS_NUEVO_LANZAMIENTO=1;
    public static final int DIAS_REGULAR=2;




    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;

    public Cliente(String nombre) throws IllegalArgumentException {
        validarNombre(nombre);
        this.name = nombre;
    }

    public Object[] calcularDeudaYPuntosObtenidos() throws IllegalArgumentException {
        Object[] resultado = new Object[2];
        double total = 0;
        int puntosAlquilerFrecuente = 0;


        for (Alquiler alquiler : alquileres) {
            // sumo monto por alquiler
            total += alquiler.calcularMonto();

            // sumo puntos por alquiler
            puntosAlquilerFrecuente=1 + alquiler.obtenerBonus();


        }


        resultado[0] = total;
        resultado[1] = puntosAlquilerFrecuente;
        return resultado;
    }

    public void alquilar(Alquiler rental) throws IllegalArgumentException {
        validarAlquiler(rental);
        alquileres.add(rental);
    }

    //validaciones
    private void validarNombre(String nombre) throws IllegalArgumentException{
        if(nombre==null) throw new IllegalArgumentException("El nombre del cliente no puede ser nulo.");
        if(nombre.trim().isEmpty()) throw  new IllegalArgumentException("El nombre del cliente no puede estar vacío.");

    }

    private void validarAlquiler(Alquiler alquiler) throws IllegalArgumentException{
        if(alquiler == null) throw new IllegalArgumentException("El alquiler no puede ser nulo.");
    }
}