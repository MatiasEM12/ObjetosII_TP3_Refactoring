package Ejercicio_3;




import java.util.ArrayList;
import java.util.List;

public class ReporteDeGastos implements Reporte {



    private int total;
    private int gastosDeComida;
    ArrayList<String> reporte;
    public ReporteDeGastos(){
        this.reporte=new ArrayList<>();
    }


    @Override
    public ArrayList<String>  generarReporte(List<Gasto> gastos) throws IllegalArgumentException {
        validarListGastos(gastos);
        this.total = 0;
        this.gastosDeComida = 0;

        cargarReporte(gastos);
        cargarTotales();

        return reporte;
    }

    private void cargarReporte(List<Gasto> gastos) throws IllegalArgumentException {
        validarListGastos(gastos);
        for (Gasto gasto : gastos) {

            gastosDeComida=gasto.sumarComida(gastosDeComida);
            String marcaExcesoComidas = gasto.esExcesoPorReporteGasto() ? "X" : " ";
            cargarStringReporte(gasto, marcaExcesoComidas);
            total=gasto.sumateA(total);
        }
    }

    private void cargarTotales() {
        reporte.add("Gastos de comida: " + gastosDeComida);
        reporte.add("Total de gastos: " + total);
    }

    private void cargarStringReporte(Gasto gasto, String marcaExcesoComidas) {
        reporte.add(gasto.descripcion() + "\t" + gasto.monto() + "\t" + marcaExcesoComidas);

    }

    private void validarListGastos(List<Gasto> gastos) throws IllegalArgumentException {
        if(gastos == null) throw new IllegalArgumentException("La lista de gastos no puede ser nula");
    }

}