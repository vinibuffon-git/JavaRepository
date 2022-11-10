package ferramentas;

public class Func {

    public static void tabuada() {

        int numero = Entrada.leiaInt("Digite o número que deseja criar a tábuada.");
        int tabu = Entrada.leiaInt("Digite o número de vezes que deseja para a criação da tábuada.");

        for (int i = 0; i < tabu; i++) {
            System.out.println(numero + " x " + (i + 1) + " = " + numero * (i + 1) + "\t");
        }
    }

    public static void calculaAreaParalelogramos(double lado1, double lado2) {

        double resultado = lado1 * lado2;

        if (lado1 != lado2) {
            System.out.println("A área do retangulo é: " + resultado);
        } else {
            System.out.println("A área do quadrado é: " + resultado);
        }
    }
}
