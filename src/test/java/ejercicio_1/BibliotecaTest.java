package ejercicio_1;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class BibliotecaTest {



    @Test
    public void generarCopia(){

        var libro= new LibroRegular("El Camino de los Reyes");
        var copia= new CopiaLibro(libro);

        assertEquals(copia.libro(), libro,"No se ha generado una copia del libro");
    }

    @Test
    public void rentarLibro(){

        var libro= new LibroInfantil("Harry Potter");
        var copia= new CopiaLibro(libro);
        var alquiler= new Alquiler(copia, 5);

        assertEquals(alquiler.diasAlquilados(), 5,"No se han registrado los días alquilados correctamente");
    }

    @Test
    public void calcularDeuda(){

        var libro= new LibroNuevo("OOP_II_cursada_2026");
        var copia= new CopiaLibro(libro);
        var alquiler= new Alquiler(copia, 5);
        var cliente= new Cliente("Paco");
        cliente.alquilar(alquiler);

        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();

       assertEquals(resultado[0], 15.0, "No se ha calculado la deuda correctamente");
    }

    @Test
    public void calcularPuntos(){

        var libro= new LibroInfantil("Percy Jackson 1");
        var copia= new CopiaLibro(libro);
        var alquiler= new Alquiler(copia, 5);
        var cliente= new Cliente("Pepe");
        cliente.alquilar(alquiler);

        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();

        assertEquals(resultado[1], 1, "No se han calculado los puntos correctamente");

    }

}
