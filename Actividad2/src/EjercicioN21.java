import java.util.Scanner;

public class EjercicioN21 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        double l1, l2, l3;
        do {
            System.out.println("Ingrese el valor del primer lado del triangulo: ");
            l1 = entry.nextDouble();
            System.out.println("Ingrese el valor del segundo lado del triangulo: ");
            l2 = entry.nextDouble();
            System.out.println("Ingrese el valor del tercer lado del triangulo: ");
            l3 = entry.nextDouble();
        } while (checkTriangle(l1, l2, l3) == false);

        double p = l1 + l2 + l3;
        double s = p / 2;
        double a = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));

        System.out.println("El perimetro del triangulo es: " + p);
        System.out.printf("El semiperimetro del triangulo es: %.4f%n", s);
        System.out.printf("El area del triangulo es: %.4f%n", a);

        entry.close();
    }

    public static boolean checkTriangle(double a, double b, double c) {
        boolean condition = (a + b > c && b + c > a && a + c > b);
        if (!condition) {
            System.out.println("Los lados ingresados no forman un triangulo, porfavor intente de nuevo");
        }
        return condition;
    };
}
