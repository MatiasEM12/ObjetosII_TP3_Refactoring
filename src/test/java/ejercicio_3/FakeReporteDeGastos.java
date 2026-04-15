package ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class FakeReporteDeGastos implements Reporte{
    private  ArrayList<String> reporteGenerado;
    private int total;
    private int gastosDeComida;
    public FakeReporteDeGastos(){

        this.reporteGenerado=new ArrayList<>();
    }


    @Override
    public ArrayList<String> generarReporte(List<Gasto> gastos) {
        this.total=0;
        this.gastosDeComida=0;
        return null;
    }
}
