
package outros;

import tools.Entrada;

public class AtividadeVeteors2 {
    public static void main(String[] args) {
        int vet[] = new int[10];
        int contador = 0;
        int soma = 0;
        for(int x = 0; x < vet.length; x++) {
            contador ++;
            int valor = Entrada.leiaInt("Digite o " + contador + "° valor do vetor.");
            if (valor <= 0){
                System.exit(0);
            } else if (valor >= 5){
                soma += valor;
                System.out.println(valor);
            }
        }
        Entrada.escrever("A soma dos valor maiores que cinco informados no "
                + "vetor é de " + soma);
        System.exit(0);
    }
}
