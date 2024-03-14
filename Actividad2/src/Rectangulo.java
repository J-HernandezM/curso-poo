public class Rectangulo extends Figures {
    double base;
    double altura;

    public Rectangulo(double b, double a) {
        this.base = b;
        this.altura = a;
    }

    double area() {
        return this.base * this.altura;
    }

    double perimetro() {
        return (2 * this.base) + (2 * this.altura);
    }
}
