package outros;

import tools.Entrada;

public class Exemplo1 {
    
    public static void main(String[] args) {
        
        double valor = 0;
        
        valor = Entrada.leiaDouble("Digite o valor em US$");
        double resultado = valor * 4.97;
        System.out.println("Resultado da conversão: R$ " + resultado);
    }
    
}
