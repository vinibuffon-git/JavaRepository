/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Paulo
 */
public class Triangulo implements FiguraGeometrica{
    @Override
    public double calcularArea() {
     double base = Entrada.leiaDouble("TRIANGULO\nInforme a medida do raio:");
     double altura = Entrada.leiaDouble("TRIANGULO\nInforme a medida da altura:");
     return (base * altura)/2;
    }    
}
