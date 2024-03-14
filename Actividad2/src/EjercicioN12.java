import java.util.Scanner;

public class EjercicioN12 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el nombre del trabajador: ");
        String name = entry.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        int workedHours = entry.nextInt();
        System.out.println("Ingrese el valor por hora: ");
        double incomePerHour = entry.nextDouble();

        int extraHours = 0;
        int moreThanEightHours = 0;
        double totalIncome = 0;

        if (workedHours > 40) {
            extraHours = workedHours - 40;

            if (extraHours > 8) {
                moreThanEightHours = extraHours - 8;
                totalIncome += ((40 * incomePerHour) + (8 * 2 * incomePerHour)
                        + (moreThanEightHours * 3 * incomePerHour));
            } else {
                totalIncome += ((40 * incomePerHour) + (extraHours * 2 * incomePerHour));
            }
        } else {
            totalIncome += workedHours * incomePerHour;
        }

        System.out.println("El trabajador " + name + " recibe esta semana un total de: " + totalIncome);

        entry.close();
    }
}