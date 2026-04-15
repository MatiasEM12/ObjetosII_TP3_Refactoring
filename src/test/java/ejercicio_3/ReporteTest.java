package ejercicio_3;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteTest {

    @Test
    public void testReporte() {
        FakeReporteDeGastos reporte = new FakeReporteDeGastos();
        ArrayList<Gasto> gastos = new ArrayList<>();
        gastos.add(new Gasto(TipoDeGasto.CENA, 6000));
        gastos.add(new Gasto(TipoDeGasto.DESAYUNO, 500));
        reporte.generarReporte(gastos);


    }
}
