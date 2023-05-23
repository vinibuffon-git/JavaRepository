/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Paulo
 */
public class TestaFiguras {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        Entrada.escrever("Ára do Quadrado: " + quadrado.calcularArea());
        Entrada.escrever("Ára do Triangulo: " + triangulo.calcularArea());
        Entrada.escrever("Ára do Círculo " + circulo.calcularArea());
    }
}
