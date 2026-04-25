package ejercicio_5;



import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class CalculadorTest {

    @Test
    public void test01() {
        var eventos = cargarEventos();
        var factura = crearFactura();

        var esperado = """
                Facturación para c1
                Escuela de Rock: 156400.0. Asientos: 158
                Hamlet: 113000.0. Asientos: 103
                El Perfume: 40000.0. Asientos: 8
                Monto ganado: 309400.0
                Créditos ganados: 232.0
                """;

        var obtenido = new Calculador().reporte(factura, eventos);

        assertLinesMatch(
                esperado.lines().toList(),
                obtenido.lines().toList()
        );
    }


    private List<Evento> cargarEventos() {
        return List.of(new EventoComedia("Escuela de Rock", "Comedia"),
                new EventoDrama("Hamlet", "Drama"),
                new EventoDrama("El Avion", "Dram"),
                new EventoComedia("Cantando en la playa", "Comedia"),
                new EventoDrama("El Perfume", "Drama")
        );
    }

    private Factura crearFactura() {
        return new Factura("c1", List.of(new Actuacion("Escuela de Rock", 158),
                new Actuacion("Hamlet", 103),
                new Actuacion("El Perfume", 8)));
    }
}