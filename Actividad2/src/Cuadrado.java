public class Cuadrado extends Figures {
    double lado;

    public Cuadrado(double l) {
        this.lado = l;
    }

    public double area() {
        return this.lado * this.lado;
    }

    public double perimetro() {
        return 4 * this.lado;
    }
}
