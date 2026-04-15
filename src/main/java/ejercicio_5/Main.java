package ejercicio_5;



import java.util.List;

public class Main {

    public static void main(String[] args) {
        var eventos = cargarEventos();
        var factura = crearFactura();

        System.out.println(new Calculador().reporte(factura, eventos));
    }

    private static List<Evento> cargarEventos() {
        return List.of(new EventoComedia("Escuela de Rock", "Comedia",ValorEvento.COMEDIA),
                new EventoDrama("Hamlet", "Drama",ValorEvento.DRAMA),
                new EventoDrama("El Avion", "Dram",ValorEvento.COMEDIA),
                new EventoComedia("Cantando en la playa", "Comedia",ValorEvento.COMEDIA),
                new EventoDrama("El Perfume", "Drama",ValorEvento.DRAMA)
        );
    }

    private static Factura crearFactura() {
        return new Factura("c1", List.of(new Actuacion("Escuela de Rock", 158),
                new Actuacion("Hamlet", 103),
                new Actuacion("El Perfume", 8)));
    }
}