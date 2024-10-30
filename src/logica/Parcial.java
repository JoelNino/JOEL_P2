package logica;

public class Parcial {

    
    public double[] calcularRaices(double a, double b, double c) throws IllegalArgumentException {
        // Si a = 0 no es una ecuación cuadratica)
        if (a == 0) {
            throw new IllegalArgumentException("El coeficiente 'a' no puede ser cero en una ecuación cuadrática.");
        }

        double discriminante = b * b - 4 * a * c;

        // Si el discriminante es negativo, hay raíces complejas 
        if (discriminante < 0) {
            throw new IllegalArgumentException("La ecuación no tiene raíces reales.");
        }

        double solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);

     
        return new double[]{solucion1, solucion2};
    }
}
