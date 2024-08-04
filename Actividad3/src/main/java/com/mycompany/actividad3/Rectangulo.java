/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3;

/**
 *
 * @author Juan
 */
public class Rectangulo extends Figures {
    double base;
    double altura;
    
    Rectangulo(double b, double h){
        this.base = b;
        this.altura = h;
    }
    
    double perimetro() {
        return ( 2 * this.base ) + ( 2 * this.altura );
    }
    
    double area() {
        return this.base * this.altura;
    }
    
}
