package Ejercicio_3_Bien;





import java.util.ArrayList;
import java.util.List;

public class EjemploDeUsoDelReporte {
    public static void main(String[] args) {
        var g1 = new Gasto(TipoDeGasto.DESAYUNO,1000);
        //g1.tipoGasto = TipoDeGasto.DESAYUNO;
        //g1.monto =1000;
        var reporte = new ReporteDeGastos();
        ArrayList<String> reporteGenerado= reporte.generarReporte(List.of(g1));
    }
}