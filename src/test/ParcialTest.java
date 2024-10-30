package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import logica.Parcial;
public class ParcialTest {

 
    Parcial parcial = new Parcial();

    @Test
    public void testRaicesReales() {
        // Hay 2 raíces reales
        double[] resultado = parcial.calcularRaices(1, -3, 2);
        assertEquals(2.0, resultado[0]);
        assertEquals(1.0, resultado[1]);
    }

    @Test
    public void testRaicesIguales() {
        // Hay una única raíz real 
        double[] resultado = parcial.calcularRaices(1, -2, 1);
        assertEquals(1.0, resultado[0]);
        assertEquals(1.0, resultado[1]);
    }

    @Test
    public void testExcepcionAEsCero() {
        // cuando a vale cero se lanza una excepcion
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            parcial.calcularRaices(0, 2, 1);
        });
        assertEquals("El coeficiente 'a' no puede ser cero en una ecuación cuadrática.", exception.getMessage());
    }

    @Test
    public void testExcepcionRaicesComplejas() {
        // si el discriminante es negativo, se lanza una excepcion
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            parcial.calcularRaices(1, 1, 1);
        });
        assertEquals("La ecuación no tiene raíces reales.", exception.getMessage());
    }
}
