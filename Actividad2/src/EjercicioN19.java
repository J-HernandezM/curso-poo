import java.util.Scanner;

public class EjercicioN19 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del triangulo equilatero: ");
        double l = entry.nextInt();

        double perimeter = l * 3;
        double height = l * (Math.sqrt(3) / 2);
        double area = (l * height) / 2;

        System.out.println("El perimetro del triangulo es: " + perimeter);
        System.out.printf("La altura del triangulo es: %.4f%n", height);
        System.out.printf("El area del triangulo es: %.4f%n", area);

        entry.close();
    }
}
