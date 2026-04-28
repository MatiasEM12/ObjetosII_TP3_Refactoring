package ejercicio_5;




import java.util.List;

public class Calculador {


    public String reporte(Factura factura, List<Evento> eventos) throws IllegalArgumentException {

        validadFactura(factura);
        validarEventos(eventos);

        float totalAmount = 0;
        float creditos = 0;
        var result = "Facturación para " + factura.nombreCliente() + System.lineSeparator();
        var actuaciones = factura.actuaciones();


        for (var actuacion : actuaciones) {
            float monto = 0;
            var evento = eventos.stream()
                    .filter(e -> e.nombreEvento().equals(actuacion.nombreEvento()))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Evento no encontrado"));



            monto=evento.calcularMontoPorCalculador(actuacion.numeroEspectadores());

            // creditos a ganar
            creditos = actuacion.calcularCreditos(creditos);

            creditos += evento.calcularExtraComedia(actuacion.numeroEspectadores());

            result = stringActuacion(actuacion, result, monto);
            totalAmount += monto;
        }
 
        result = stringResultadoFinal(result, totalAmount, creditos);

        return result;
    }

    private static String stringResultadoFinal(String result, float totalAmount, float creditos) {
        result += "Monto ganado: " + totalAmount + System.lineSeparator();
        result += "Créditos ganados: " + creditos + System.lineSeparator();
        return result;
    }

    private static String stringActuacion(Actuacion actuacion, String result, float monto) {
        result += actuacion.nombreEvento() + ": " + monto + ". Asientos: " + actuacion.numeroEspectadores() + System.lineSeparator();//` ${play.name}: ${format(thisAmount/100)} (${perf.audience} seats)\n`;
        return result;
    }


    private void validarEventos(List<Evento> eventos) throws  IllegalArgumentException{
        if (eventos.isEmpty()) {;
            throw new IllegalArgumentException("No hay eventos disponibles");
        }

    }

    private void validadFactura(Factura factura) throws IllegalArgumentException {
        if (factura == null) {
            throw new IllegalArgumentException("Factura no puede ser nula");
        }
    }
}
