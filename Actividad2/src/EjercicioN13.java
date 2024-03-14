import java.util.Arrays;
import java.util.Scanner;

public class EjercicioN13 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra del cliente: ");
        double value = entry.nextDouble();
        entry.nextLine();
        String ball;
        String[] ballsArray = { "blanca", "verde", "amarilla", "azul", "roja" };
        do {
            System.out.println("Ingrese la bolita que ha sacado el cliente: ");
            ball = entry.nextLine();
        } while (!Arrays.asList(ballsArray).contains(ball));

        int discount = 0;

        switch (ball) {
            case "blanca":
                discount = 0;
                break;

            case "verde":
                discount = 10;
                break;

            case "amarilla":
                discount = 25;
                break;

            case "azul":
                discount = 50;
                break;

            case "roja":
                discount = 100;
                break;
        }

        double finalValue = value - (value * (discount / 100.0));

        System.out.println("El cliente debe pagar: " + finalValue);

        entry.close();
    }
}