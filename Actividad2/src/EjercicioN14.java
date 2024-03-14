import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioN14 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        double sales1, sales2, sales3, income;

        System.out.println("Ingrese las ventas del departamento #1: ");
        sales1 = entry.nextDouble();
        System.out.println("Ingrese las ventas del departamento #2: ");
        sales2 = entry.nextDouble();
        System.out.println("Ingrese las ventas del departamento #3: ");
        sales3 = entry.nextDouble();
        System.out.println("Ingrese el salario de los vendedores: ");
        income = entry.nextDouble();

        double totalSales = sales1 + sales2 + sales3;
        Map<String, Double> allDepartmentSales = new HashMap<String, Double>();
        allDepartmentSales.put("department1", sales1);
        allDepartmentSales.put("department2", sales2);
        allDepartmentSales.put("department3", sales3);

        Map<String, Double> finalIncomes = new HashMap<String, Double>();

        allDepartmentSales.forEach((key, value) -> {
            double finalValue = income;
            if (value > (totalSales * 0.3)) {
                finalValue = income * 1.2;
            }
            finalIncomes.put(key, finalValue);
        });

        finalIncomes.forEach((key, value) -> {
            System.out.println(
                    "El departamento numero " + key.substring(key.length() - 1) + " obtuvo un salario de: " + value);
        });

        entry.close();
    }
}