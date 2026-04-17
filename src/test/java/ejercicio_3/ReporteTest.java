package ejercicio_3;

import Ejercicio_3_Bien.GastoAlquilerDeAuto;
import Ejercicio_3_Bien.GastoCena;
import Ejercicio_3_Bien.GastoDesayuno;

import Ejercicio_3_Bien.ReporteDeGastos;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReporteTest {

    @Test
    public void testGasto() {
        ReporteDeGastos reporte = new ReporteDeGastos();
        var g1 = new GastoDesayuno(5000);
        var reporteGenerado=reporte.generarReporte(List.of(g1));

        assertTrue(reporteGenerado.contains("Desayuno	5000	X"), "El reporte debería contener la descripcion + monto + marca de exceso del gasto.");

    }

    @Test
    public void testTotal(){
        ReporteDeGastos reporte = new ReporteDeGastos();
        var g1 = new GastoDesayuno(5000);
        var g2 = new GastoCena(1500);
        var g3= new GastoAlquilerDeAuto(10000);
        ArrayList<String> reporteGenerado= reporte.generarReporte(List.of(g1,g2,g3));

        assertTrue(reporteGenerado.contains("Total de gastos: 16500"), "El reporte debería contener el total de gastos.");
    }

    @Test
    public void testGastoComida(){
        ReporteDeGastos reporte = new ReporteDeGastos();
        var g1 = new GastoDesayuno(5000);
        var g2 = new GastoCena(1500);
        var g3= new GastoAlquilerDeAuto(10000);
        ArrayList<String> reporteGenerado= reporte.generarReporte(List.of(g1,g2,g3));

        assertTrue(reporteGenerado.contains("Gastos de comida: 6500"), "El reporte debería contener el total de gastos de comida.");
    }
}
