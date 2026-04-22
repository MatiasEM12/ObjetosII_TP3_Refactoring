package Ejercicio_3_Bien;





import java.util.ArrayList;
import java.util.List;

public class EjemploDeUsoDelReporte {
    public static void main(String[] args) {
        var g1 = new GastoDesayuno(5000, "Desayuno");
        var g2 = new GastoCena(1500, "Cena");
        var g3= new GastoAlquilerDeAuto(10000, "Alquiler de auto");

        var reporte = new ReporteDeGastos();
        ArrayList<String> reporteGenerado= reporte.generarReporte(List.of(g1,g2,g3));
        for(String st : reporteGenerado){

            System.out.println(st);
        }
    }
}