import java.util.Scanner;

public class EjercicioN10 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese su numero de inscripcion: ");
        int id = entry.nextInt();
        entry.nextLine(); // Clean buffer (es para limpiar el /n al presionar el enter, ya que a el nextInt no lo consume y el proximo nextLine lo consumiria)
        System.out.println("Ingrese su nombre: ");
        String name = entry.nextLine();
        System.out.println("Ingrese su patrimonio: ");
        double patrimony = entry.nextDouble();
        System.out.println("Ingrese su estrato social: ");
        int socialClass = entry.nextInt();

        double universityFee = 50000;

        if (patrimony >= 2000000 && socialClass > 3) {
            universityFee += patrimony * 0.03;
        }

        System.out.println("El estudiante con numero de inscripcion: " + id);
        System.out.println("y cuyo nombre es: " + name);
        System.out.println("Tiene un valor de pago de matricula de: " + universityFee);

        entry.close();
    }
}
