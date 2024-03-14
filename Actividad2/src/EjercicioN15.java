import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioN15 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Map<String, Double> spheres = new HashMap<String, Double>();
        String[] letters = { "A", "B", "C", "D" };

        for (int i = 0; i <= 3; i++) {

            System.out.println("Ingrese el peso de la bola " + letters[i] + ": ");
            double x = entry.nextDouble();
            spheres.put(letters[i], x);
        }

        ArrayList<Map.Entry<String, Double>> sortedSpheres = new ArrayList<>(spheres.entrySet());

        sortedSpheres.sort(Comparator.comparing(Map.Entry::getValue));
        System.out.println();
        System.out.println(sortedSpheres.get(1).getValue().equals(sortedSpheres.get(0).getValue()));

        if (!sortedSpheres.get(0).getValue().equals(sortedSpheres.get(1).getValue())) {
            if (sortedSpheres.get(0).getValue() > sortedSpheres.get(sortedSpheres.size() - 1).getValue()) {
                System.out.println(
                        "La esfera " +
                                sortedSpheres.get(0).getKey() +
                                " es la diferente y es de mayor peso ");
            } else {
                System.out.println(
                        "La esfera " +
                                sortedSpheres.get(0).getKey() +
                                " es la diferente y es de menor peso ");
            }
        } else {
            if (sortedSpheres.get(0).getValue() > sortedSpheres.get(sortedSpheres.size() - 1).getValue()) {
                System.out.println(
                        "La esfera " +
                                sortedSpheres.get(sortedSpheres.size() - 1).getKey() +
                                " es la diferente y es de menor peso ");
            } else {
                System.out.println(
                        "La esfera " +
                                sortedSpheres.get(sortedSpheres.size() - 1).getKey() +
                                " es la diferente y es de mayor peso ");
            }
        }

        entry.close();
    }
}