import java.util.Scanner;

public class EjercicioN23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los valores de A, B y C
        System.out.println("Ingrese el valor de A: ");
        double A = scanner.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        double B = scanner.nextDouble();

        System.out.println("Ingrese el valor de C: ");
        double C = scanner.nextDouble();

        double insideSqrt = (B * B) - (4 * A * C);

        // Comprobar si el insideSqrte es positivo, negativo o cero
        if (insideSqrt > 0) {
            // Dos soluciones reales distintas
            double x1 = (-B + Math.sqrt(insideSqrt)) / (2 * A);
            double x2 = (-B - Math.sqrt(insideSqrt)) / (2 * A);
            System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
        } else if (insideSqrt == 0) {
            // Una solución real
            double x = -B / (2 * A);
            System.out.println("La solución es: x = " + x);
        } else {
            // Soluciones imaginarias
            double realPart = -B / (2 * A);
            double imaginaryPart = Math.sqrt(-insideSqrt) / (2 * A);
            System.out.println("Las soluciones son imaginarias: ");
            System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}