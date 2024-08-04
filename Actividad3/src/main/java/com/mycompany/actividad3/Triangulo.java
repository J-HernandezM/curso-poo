/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3;

/**
 *
 * @author Juan
 */
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

    public String tipoTriangulo() {
        String tipo;
        double hipotenusa = hipotenusa();

        if (this.base == this.altura && this.base == hipotenusa && this.altura == hipotenusa) {
            return tipo = "triangulo equilatero";
        } else if (this.base != this.altura && this.base != hipotenusa && this.altura != hipotenusa) {
            return tipo = "triangulo escaleno";
        } else {
            return tipo = "triangulo isoceles";
        }
    }

}
