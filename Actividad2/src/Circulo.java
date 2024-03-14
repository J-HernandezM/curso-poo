public class Circulo extends Figures {
    double radio;

    public Circulo(double r) {
        this.radio = r;
    }

    double area() {
        return Math.PI * this.radio * this.radio;
    }

    double perimetro() {
        return 2 * Math.PI * this.radio;
    }
}
