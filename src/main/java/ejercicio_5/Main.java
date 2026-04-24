package ejercicio_5;



import java.util.List;

public class Main {

    public static void main(String[] args) {
        var eventos = cargarEventos();
        var factura = crearFactura();

        System.out.println(new Calculador().reporte(factura, eventos));
    }

    private static List<Evento> cargarEventos() {
        return List.of(new EventoComedia("Escuela de Rock",ValorEvento.COMEDIA),
                new EventoDrama("Hamlet",ValorEvento.DRAMA),
                new EventoDrama("El Avion",ValorEvento.COMEDIA),
                new EventoComedia("Cantando en la playa",ValorEvento.COMEDIA),
                new EventoDrama("El Perfume",ValorEvento.DRAMA)
        );
    }

    private static Factura crearFactura() {
        return new Factura("c1", List.of(new Actuacion("Escuela de Rock", 158),
                new Actuacion("Hamlet", 103),
                new Actuacion("El Perfume", 8)));
    }
}