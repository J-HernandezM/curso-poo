/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3;

/**
 *
 * @author Juan
 */
public class Trapecio extends Figures {
    double baseMayor;
    double baseMenor;
    double lado1;
    double lado2;
    double altura;

    public Trapecio(double baseMayor, double baseMenor, double lado1, double lado2, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double area() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public double perimetro() {
        return lado1 + baseMayor + lado2 + baseMenor;
    }
}