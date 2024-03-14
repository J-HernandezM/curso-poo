public class Rombo extends Figures {
    double diagonal1;
    double diagonal2;
    double lado;

    public Rombo(double diagonal1, double diagonal2, double lado) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.lado = lado;
    }

    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    public double perimetro() {
        return 4 * lado;
    }
}
