import java.util.Scanner;

public class EjercicioN18 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el codigo del empleado: ");
        int id = entry.nextInt();
        entry.nextLine(); // Para limpiar el buffer y que el proximo nextLine no lea el salto de linea

        System.out.println("Ingrese el nombre del empleado: ");
        String name = entry.nextLine();

        System.out.println("Ingrese las horas trabajadas al mes del empleado: ");
        int monthWorkedHours = entry.nextInt();

        System.out.println("Ingrese el valor por hora trabajada del empleado: ");
        double salaryPerHour = entry.nextDouble();

        System.out.println("Ingrese el porcentaje de retencion en la fuente del empleado: ");
        double tax = entry.nextDouble();

        double grossIncome = monthWorkedHours * salaryPerHour;
        double taxFee = grossIncome * (tax / 100);
        double netIncome = grossIncome - taxFee;

        System.out.println("Codigo empleado: " + id);
        System.out.println("Nombre del empleado: " + name);
        System.out.printf("Salario bruto: %.0f%n", grossIncome);
        System.out.printf("Salario neto: %.0f%n", netIncome);

        entry.close();
    }
}
