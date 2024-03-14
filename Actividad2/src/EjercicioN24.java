import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class EjercicioN24 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        double A, B, C;

        System.out.println("Ingrese el peso de la esfera A: ");

        A = entry.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        B = entry.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        C = entry.nextDouble();

        ArrayList<Map.Entry<Character, Double>> array = new ArrayList<Map.Entry<Character, Double>>();
        array.add(Map.entry('A', A));
        array.add(Map.entry('B', B));
        array.add(Map.entry('C', C));

        array.sort(Comparator.comparing(Map.Entry<Character, Double>::getValue));

        System.out.println("La esfera de mayor peso es " + array.get(array.size() - 1).getKey() + " con un peso de: "
                + array.get(array.size() - 1).getValue());

        entry.close();
    }
}