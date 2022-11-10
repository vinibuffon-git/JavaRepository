package aula03;

import ferramentas.Entrada;

public class AreaDoQuadradoRetangulo {

    public static void calculaArea(double lado1, double lado2) {

        double resultado = lado1 * lado2;

        if (lado1 != lado2) {
            System.out.println("A área do retangulo é: " + resultado);
        } else {
            System.out.println("A área do quadrado é: " + resultado);
        }
    }

    public static void main(String[] args) {
        double lado1 = Entrada.leiaInt("Tamanho do lado 1");
        double lado2 = Entrada.leiaInt("Tamanho do lado 2");

        calculaArea(lado1, lado2);
    }

}
