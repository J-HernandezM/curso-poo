/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3;

/**
 *
 * @author Juan
 */
public class Rombo extends Figures{
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
