package ejercicio_5;



import java.util.List;

public class Calculador {
    public static final int LIMITE_BASE_ESPECTADORES_COMEDIA= 20;
    public static final int SUMAR_COMEDIA = 500;
    public static final int MULTIPLICADOR_SUPERIOR_COMEDIA = 10000;
    public static final int MULTIPLICADOR_INFERIOR_COMEDIA= 300;

    public static final int LIMITE_BASE_ESPECTADORES_DRAMA = 30;
    public static final int MULTIPLICADOR_DRAMA = 1000;

    public static final int  DIVISOR_EXTRA_COMEDIA=5;

    public String reporte(Factura factura, List<Evento> eventos) {


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


            monto=evento.calcularMontoPorCalculador(actuacion.numberoEspectadores());

            // creditos a ganar
            creditos = calcularCreditos(actuacion, creditos);

            creditos += evento.calcularExtraComedia(actuacion.numberoEspectadores());

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
        result += actuacion.nombreEvento() + ": " + monto + ". Asientos: " + actuacion.numberoEspectadores() + System.lineSeparator();//` ${play.name}: ${format(thisAmount/100)} (${perf.audience} seats)\n`;
        return result;
    }

    private static float calcularCreditos(Actuacion actuacion, float creditos) {
        creditos += Math.max(actuacion.numberoEspectadores() - 30, 0);
        return creditos;
    }
}
