//Vinícius Buffon

package trabalhos;

import tools.Entrada;

public class TrabalhoIndependente01 {

    public static int criaVetorDe100() {
        int [] vetor = new int[100];
        int pares = 0;
        int contador = 1;
        for (int x = 1; x < vetor.length; x++) {
            contador ++;
            vetor[x] = (int) (Math.random()*500);
            if (vetor[x] % 2 == 0) {
                pares++;
            }
            System.out.print(vetor[x]+"\t");
        }
        System.out.println("");
        System.out.println(contador + ": numeros foram gerados");
        return pares;
    }

    public static void main(String[] args) {
        Entrada.escrever("O vetor possui: " + criaVetorDe100() + ", numeros pares.");
    }
}
