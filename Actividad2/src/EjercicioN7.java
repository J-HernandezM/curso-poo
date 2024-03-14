import java.util.Scanner;

public class EjercicioN7 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        double a = entry.nextDouble();
        System.out.println("Ingrese el segundo valor: ");
        double b = entry.nextDouble();

        if (a > b) {
            System.out.println("El valor " + a + " es mayor que " + b);
        } else if (a < b) {
            System.out.println("El valor " + a + " es menor que " + b);
        } else {
            System.out.println("El valor " + a + " es igual que " + b);
        }

        entry.close();
    }
}
