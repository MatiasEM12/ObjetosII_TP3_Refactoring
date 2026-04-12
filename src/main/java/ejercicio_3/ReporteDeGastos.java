package ejercicio_3;



import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos implements Reporte{

    public ReporteDeGastos(){}


    @Override
    public void imprimir(List<Gasto> gastos) {
        int total = 0;
        int gastosDeComida = 0;

        System.out.println("Expenses " + LocalDate.now());

        for (Gasto gasto : gastos) {

            sumarComida(gasto, TipoDeGasto.CENA, gastosDeComida);
            sumarComida(gasto, TipoDeGasto.DESAYUNO, gastosDeComida);


            String marcaExcesoComidas = stringExceso(gasto);

            imprimirDetallesGasto(gasto, marcaExcesoComidas);

            gasto.sumateA(total);
        }

        System.out.println("Gastos de comida: " + gastosDeComida);
        System.out.println("Total de gastos: " + total);
    }

    private static void imprimirDetallesGasto(Gasto gasto, String marcaExcesoComidas) {
        System.out.println(gasto.descripcionGasto() + "\t" + gasto.monto() + "\t" + marcaExcesoComidas);
    }

    private static String stringExceso(Gasto gasto) {
        String marcaExcesoComidas = esExceso(TipoDeGasto.CENA, 5000, gasto)
                || esExceso(TipoDeGasto.DESAYUNO, 1000, gasto) ? "X" : " ";
        return marcaExcesoComidas;
    }

    private static void sumarComida(Gasto gasto, TipoDeGasto criterio, int gastosDeComida) {
        if (gasto.esTipo(criterio)) {
            gasto.sumateA(gastosDeComida);
        }
    }


    private static  boolean esExceso(TipoDeGasto criterio,int limite,Gasto gasto ) {
        if( gasto.esTipo(criterio)|| gasto.esExceso(limite)){
            return true;
        }
        return false;
    }
}