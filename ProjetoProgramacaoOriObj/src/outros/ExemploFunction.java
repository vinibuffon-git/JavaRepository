package outros;

import tools.Entrada;

public class ExemploFunction {

    public static int divisores(int numero) {
        int qtde = 0;
        for (int x = 1; x <= numero; x++) {
            if (numero % x == 0) {
                qtde++;
            }
        }
        return qtde;
    }
    
    public static void main(String[] args) {
        int num = Entrada.leiaInt("Digite o numero a ser verificado");
        System.out.println("Este numeo possui " + divisores(num) + 
                " divisores.");
        System.exit(0);
    }

    
}


