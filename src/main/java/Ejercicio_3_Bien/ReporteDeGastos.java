package Ejercicio_3_Bien;




import java.util.ArrayList;
import java.util.List;

public class ReporteDeGastos implements Reporte {

    public static final int LIMITE_CENA = 5000;
    public static final int LIMITE_DESAYUNO = 1000;
    private int total;
    private int gastosDeComida;
    ArrayList<String> reporte;
    public ReporteDeGastos(){
        this.reporte=new ArrayList<>();
    }


    @Override
    public ArrayList<String>  generarReporte(List<Gasto> gastos) {
        this.total = 0;
        this.gastosDeComida = 0;

        cargarReporte(gastos);
        cargarTotales();

        return reporte;
    }

    private void cargarReporte(List<Gasto> gastos) {
        for (Gasto gasto : gastos) {

            gastosDeComida=sumarComida(gasto, TipoDeGasto.CENA, gastosDeComida);
            gastosDeComida=sumarComida(gasto, TipoDeGasto.DESAYUNO, gastosDeComida);


            String marcaExcesoComidas = stringExceso(gasto);


            cargarStringReporte(gasto, marcaExcesoComidas);
            total=gasto.sumateA(total);
        }
    }

    private void cargarTotales() {
        reporte.add("Gastos de comida: " + gastosDeComida);
        reporte.add("Total de gastos: " + total);
    }

    private void cargarStringReporte(Gasto gasto, String marcaExcesoComidas) {
        reporte.add(gasto.descripcionGasto() + "\t" + gasto.monto() + "\t" + marcaExcesoComidas);
    }


    private static String stringExceso(Gasto gasto) {
        String marcaExcesoComidas = esExceso(TipoDeGasto.CENA, LIMITE_CENA, gasto)
                || esExceso(TipoDeGasto.DESAYUNO, LIMITE_DESAYUNO, gasto) ? "X" : " ";
        return marcaExcesoComidas;
    }

    private static int sumarComida(Gasto gasto, TipoDeGasto criterio, int gastosDeComida) {
        if (gasto.esTipo(criterio)) {
            gastosDeComida=gasto.sumateA(gastosDeComida);
        }
        return gastosDeComida;

    }

    private static  boolean esExceso(TipoDeGasto criterio, int limite, Gasto gasto ) {
        if( gasto.esTipo(criterio)|| gasto.esExceso(limite)){
            return true;
        }
        return false;
    }
}