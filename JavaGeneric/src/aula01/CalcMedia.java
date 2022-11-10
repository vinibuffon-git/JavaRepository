
package aula01;

import ferramentas.Entrada;

public class CalcMedia {
    public static void main(String[] args) {
        int nnotas = Entrada.leiaInt("Digite o número de notas que deseja "
                + "descobrir a média");
        double[] notas = new double[nnotas];
        double media = calcularMediaModal(notas);
        System.out.println("MÉDIA = " + media);

    }

    public static double calcularMediaModal(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        return media;
    }
}
    
