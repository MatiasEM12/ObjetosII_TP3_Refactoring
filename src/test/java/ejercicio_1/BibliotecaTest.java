package ejercicio_1;
import org.junit.jupiter.api.Test;

import javax.swing.border.LineBorder;

import static org.junit.jupiter.api.Assertions.*;
public class BibliotecaTest {



    @Test
    public void generarCopia(){

        var libro= new Libro("El Camino de los Reyes", Libro.REGULARES);
        var copia= new CopiaLibro(libro);

        assertEquals(copia.libro(), libro,"No se ha generado una copia del libro");
    }

    @Test
    public void rentarLibro(){

        var libro= new Libro("Harry Potter",Libro.INFANTILES);
        var copia= new CopiaLibro(libro);
        var alquiler= new Alquiler(copia, 5);

        assertEquals(alquiler.diasAlquilados(), 5,"No se han registrado los días alquilados correctamente");
    }

    @Test
    public void calcularDeuda(){

        var libro= new Libro("OOP_II_cursada_2026",Libro.NUEVO_LANZAMIENTO);
        var copia= new CopiaLibro(libro);
        var alquiler= new Alquiler(copia, 5);
        var cliente= new Cliente("Paco");
        cliente.alquilar(alquiler);

        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();

        assertEquals(resultado[0], 6.5, "No se ha calculado la deuda correctamente");
    }

    @Test
    public void calcularPuntos(){

        var libro= new Libro("Percy Jackson 1", Libro.INFANTILES);
        var copia= new CopiaLibro(libro);
        var alquiler= new Alquiler(copia, 5);
        var cliente= new Cliente("Pepe");
        cliente.alquilar(alquiler);

        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();

        assertEquals(resultado[1], 2, "No se han calculado los puntos correctamente");

    }

}
