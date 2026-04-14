package ejercicio_3;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReporteDeGastos implements Reporte{

    private int total;
    private int gastosDeComida;
    ArrayList<String> reporte;
    public ReporteDeGastos(){
        this.reporte=new ArrayList<>();
    }


    @Override
    public void imprimir(List<Gasto> gastos) {
        this.total = 0;
        this.gastosDeComida = 0;
        
        
        for (Gasto gasto : gastos) {

            gastosDeComida=sumarComida(gasto, TipoDeGasto.CENA, gastosDeComida);
            gastosDeComida=sumarComida(gasto, TipoDeGasto.DESAYUNO, gastosDeComida);


            String marcaExcesoComidas = stringExceso(gasto);

            imprimirDetallesGasto(gasto, marcaExcesoComidas);
            //cargarStringReporte(gasto, marcaExcesoComidas);
            total=gasto.sumateA(total);
        }
    }

    private void cargarStringReporte(Gasto gasto, String marcaExcesoComidas) {
        reporte.add(gasto.descripcionGasto() + "\t" + gasto.monto() + "\t" + marcaExcesoComidas);
    }

    private static void imprimirDetallesGasto(Gasto gasto, String marcaExcesoComidas) {
        System.out.println(gasto.descripcionGasto() + "\t" + gasto.monto() + "\t" + marcaExcesoComidas);
    }

    private static String stringExceso(Gasto gasto) {
        String marcaExcesoComidas = esExceso(TipoDeGasto.CENA, 5000, gasto)
                || esExceso(TipoDeGasto.DESAYUNO, 1000, gasto) ? "X" : " ";
        return marcaExcesoComidas;
    }

    private static int sumarComida(Gasto gasto, TipoDeGasto criterio, int gastosDeComida) {
        if (gasto.esTipo(criterio)) {
            gastosDeComida=gasto.sumateA(gastosDeComida);
        }
        return gastosDeComida;

    }

    private static  boolean esExceso(TipoDeGasto criterio,int limite,Gasto gasto ) {
        if( gasto.esTipo(criterio)|| gasto.esExceso(limite)){
            return true;
        }
        return false;
    }
}