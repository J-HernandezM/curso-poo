import java.util.Scanner;

public class EjercicioN22 {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado: ");
        String name = entry.nextLine();
        System.out.println("Ingrese el salario por hora: ");
        double income = entry.nextDouble();
        System.out.println("Ingrese las horas trabajadas al mes: ");
        int hours = entry.nextInt();

        double salary = hours * income;

        if (salary > 450000) {
            System.out.println("El salario es: " + salary);
        }

        System.out.println("El empleado se llama: " + name);

        entry.close();
    }
}