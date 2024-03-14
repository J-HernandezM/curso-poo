public class Triangulo extends Figures {
    double base;
    double altura;

    public Triangulo(double b, double a) {
        this.base = b;
        this.altura = a;
    }

    public double area() {
        return (this.base * this.altura) / 2;
    }

    public double perimetro() {
        return (this.base + this.altura + hipotenusa());
    }

    public double hipotenusa() {
        return Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
    }

    public void tipoTriangulo() {
        double hipotenusa = hipotenusa();

        if (this.base == this.altura && this.base == hipotenusa && this.altura == hipotenusa) {
            System.out.println("Es un triangulo equilatero");
        } else if (this.base != this.altura && this.base != hipotenusa && this.altura != hipotenusa) {
            System.out.println("Es un triangulo escaleno");
        } else {
            System.out.println("Es un triangulo isoceles");
        }
    }

}
