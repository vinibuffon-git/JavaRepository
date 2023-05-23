/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Paulo
 */
public class Circulo implements FiguraGeometrica{

    @Override
    public double calcularArea() {
     double raio = Entrada.leiaDouble("CIRCULO\nInforme a medida do raio:");
     return Math.PI * Math.pow(raio, 2);
    }
    
}
