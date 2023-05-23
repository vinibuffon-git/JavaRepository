/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Paulo
 */
public class Quadrado implements FiguraGeometrica{
    @Override
    public double calcularArea() {
     double lado = Entrada.leiaDouble("QUADRADO\nInforme a medida do lado:");
     return lado*lado;
    }
}
