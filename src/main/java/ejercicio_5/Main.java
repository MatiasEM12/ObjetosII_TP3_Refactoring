package ejercicio_5;



import java.util.List;

public class Main {

    public static void main(String[] args) {
        var eventos = cargarEventos();
        var factura = crearFactura();

        System.out.println(new Calculador().reporte(factura, eventos));
    }

    private static List<Evento> cargarEventos() {
        return List.of(new Comedia("Escuela de Rock", "Comedia"),
                new Drama("Hamlet", "Drama"),
                new Drama("El Avion", "Dram"),
                new Comedia("Cantando en la playa", "Comedia"),
                new Drama("El Perfume", "Drama")
        );
    }
    private static Factura crearFactura() {
        return new Factura("c1", List.of(new Actuacion("Escuela de Rock", 158),
                new Actuacion("Hamlet", 103),
                new Actuacion("El Perfume", 8)));
    }
}