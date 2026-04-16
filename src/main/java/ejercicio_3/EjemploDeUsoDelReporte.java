package ejercicio_3;



import java.util.List;

public class EjemploDeUsoDelReporte {
    public static void main(String[] args) {
        var g1 = new Gasto(TipoDeGasto.DESAYUNO,1000);
        //g1.tipoGasto = TipoDeGasto.DESAYUNO;
        //g1.monto =1000;
        var reporte = new ReporteDeGastos();
        //reporte.imprimir(List.of(g1));
    }
}