public class EjercicioN17 {
    public static void main(String[] args) {
        double radius, circumference, area;

        radius = 15;
        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;

        System.out.println("El valor del radio es: " + radius);
        System.out.println("El valor del area es: " + area);
        System.out.println("El valor de la circunferencia es: " + circumference);
    }
}
