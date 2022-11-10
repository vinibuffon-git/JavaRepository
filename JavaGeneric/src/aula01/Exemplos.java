package aula01;

public class Exemplos {

    public static void main(String[] args) {
        double nota1 = 10;
        double nota2 = 7;
        double nota3 = 6;
        double nota4 = 5;

        double media1 = calcularMedia(nota1, nota2, nota3, nota4);
        System.out.println("Média = " + media1);

        double[] notas = {10, 7, 6, 5};
        double media2 = calcularMedia(notas);
        System.out.println("Média 2 = " + media2);

    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        return media;
    }

    public static double calcularMedia(double n1, double n2, double n3,
            double n4) {

        double media = (n1 + n2 + n3 + n4) / 4;

        return media;
    }
}
