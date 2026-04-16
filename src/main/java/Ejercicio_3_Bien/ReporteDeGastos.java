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

            gastosDeComida=gasto.sumarComida(gastosDeComida);



            String marcaExcesoComidas = gasto.esExceso() ? "X" : " ";


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

        //gasto.descripcion() + "\t" + gasto.monto()   , podria ser el toString de gasto? y se evita los .monto y .descripcion
    }

}