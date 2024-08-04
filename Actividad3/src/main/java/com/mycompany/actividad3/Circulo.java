/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3;

/**
 *
 * @author Juan
 */
public class Circulo extends Figures{
    double radio;
    
    Circulo(double r) {
        this.radio = r;
    }
    
    double perimetro() {
        return 2 * Math.PI * this.radio;
    }
    
    double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }
    
    
}
