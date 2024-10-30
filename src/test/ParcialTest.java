package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import logica.Parcial;
public class ParcialTest {

    // Instancia de la clase a probar
    Parcial parcial = new Parcial();

    @Test
    public void testRaicesReales() {
        // Prueba para valores con raíces reales
        double[] resultado = parcial.calcularRaices(1, -3, 2);
        assertEquals(2.0, resultado[0], 0.0001);
        assertEquals(1.0, resultado[1], 0.0001);
    }

    @Test
    public void testRaicesIguales() {
        // Prueba para valores con una única raíz real (discriminante cero)
        double[] resultado = parcial.calcularRaices(1, -2, 1);
        assertEquals(1.0, resultado[0], 0.0001);
        assertEquals(1.0, resultado[1], 0.0001);
    }

    @Test
    public void testExcepcionAEsCero() {
        // Prueba para verificar la excepción cuando 'a' es cero
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            parcial.calcularRaices(0, 2, 1);
        });
        assertEquals("El coeficiente 'a' no puede ser cero en una ecuación cuadrática.", exception.getMessage());
    }

    @Test
    public void testExcepcionRaicesComplejas() {
        // Prueba para verificar la excepción cuando el discriminante es negativo
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            parcial.calcularRaices(1, 1, 1);
        });
        assertEquals("La ecuación no tiene raíces reales.", exception.getMessage());
    }
}
