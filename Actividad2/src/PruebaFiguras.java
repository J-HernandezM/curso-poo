public class PruebaFiguras {
    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        Triangulo figura4 = new Triangulo(3, 5);
        Rombo figura5 = new Rombo(6, 8, 5);
        Trapecio figura6 = new Trapecio(8, 5, 6, 10, 4);

        System.out.println("El área del círculo es = " + figura1.area());
        System.out.println("El perímetro del círculo es = " + figura1.perimetro());

        System.out.println("El área del rectángulo es = " + figura2.area());
        System.out.println("El perímetro del rectángulo es = " + figura2.perimetro());

        System.out.println("El área del cuadrado es = " + figura3.area());
        System.out.println("El perímetro del cuadrado es = " + figura3.perimetro());

        System.out.println("Área del rombo: " + figura5.area());
        System.out.println("Perímetro del rombo: " + figura5.perimetro());

        System.out.println("Área del trapecio: " + figura6.area());
        System.out.println("Perímetro del trapecio: " + figura6.perimetro());

        System.out.println("El área del triángulo es = " + figura4.area());
        System.out.println("El perímetro del triángulo es = " + figura4.perimetro());
        figura4.tipoTriangulo();
    }

}
