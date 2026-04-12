package ejercicio_1;


import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;

    public Cliente(String nombre) {
        validarNombre(nombre);
        this.name = nombre;
    }

    public Object[] calcularDeudaYPuntosObtenidos() {
        Object[] resultado = new Object[2];
        double total = 0;
        int puntosAlquilerFrecuente = 0;
        for (Alquiler alquiler : alquileres) {
            // sumo monto por alquiler
            total += alquiler.calcularMonto();

            // sumo puntos por alquiler
            puntosAlquilerFrecuente=1 + alquiler.obtenerBonus(CodigoPrecio.NUEVO_LANZAMIENTO);


        }
        resultado[0] = total;
        resultado[1] = puntosAlquilerFrecuente;
        return resultado;
    }

    public void alquilar(Alquiler rental) {
        validarAlquiler(rental);
        alquileres.add(rental);
    }

    //validaciones
    private void validarNombre(String nombre){
        if(nombre==null) new IllegalArgumentException("El nombre del cliente no puede ser nulo.");
        if(nombre.trim().isEmpty()) new IllegalArgumentException("El nombre del cliente no puede estar vacío.");

    }

    private void validarAlquiler(Alquiler alquiler){
        if(alquiler == null) new IllegalArgumentException("El alquiler no puede ser nulo.");
    }
}