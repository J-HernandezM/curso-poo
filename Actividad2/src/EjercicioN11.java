import java.util.Arrays;
import java.util.Scanner;

public class EjercicioN11 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        double a = entry.nextDouble();
        System.out.println("Ingrese el segundo valor: ");
        double b = entry.nextDouble();
        System.out.println("Ingrese el tercer valor: ");
        double c = entry.nextDouble();

        double[] arr = { a, b, c };
        Arrays.sort(arr);

        System.out.println("El valor mayor entre los tres entregados es: " + arr[2]);

        entry.close();
    }
}