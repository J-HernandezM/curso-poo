/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3;

/**
 *
 * @author Juan
 */
public class Cuadrado extends Figures{
    double lado;
    
    Cuadrado(double l) {
        this.lado = l;
    }
    
    double area() {
        return Math.pow(this.lado, 2);
    }
    
    double perimetro() {
        return 4 * this.lado;
    }
    
}
