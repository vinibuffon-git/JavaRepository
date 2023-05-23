// Vinicius Buffon e Robson Mentzen 


package app;

import objts.CalculadoraCientifica;
import tools.Entrada;

public class TestaCalculadoraCientifica {

    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        int OP = 1;
        while (OP != 7) {
            String mens1 = "Digite o primeiro valor";
            
            String mens2 = "Digite o segundo valor";
            
            String mens3 = "Operação a ser realizada: \n"
                    + "1 - Somar" + "\n"
                    + "2 - Subtrair" + "\n"
                    + "3 - Multiplicar" + "\n"
                    + "4 - Dividir" + "\n"
                    + "5 - Raiz" + "\n"
                    + "6 - Potência" + "\n"
                    + "7 - Sair";
            
            double valor1 = Entrada.leiaDouble(mens1);
            double valio2 = Entrada.leiaDouble(mens2);
            OP = Entrada.leiaInt(mens3);
            switch (OP) {
                case 1:
                    Entrada.escrever("Resultado: " + calc.somar(valor1, valio2));
                    break;
                case 2:
                    Entrada.escrever("Resultado: " + calc.subtrair(valor1, valio2));
                    break;
                case 3:
                    Entrada.escrever("Resultado: " + calc.multiplicar(valor1, valio2));
                    break;
                case 4:
                    Entrada.escrever("Resultado: " + calc.dividir(valor1, valio2));
                    break;
                case 5:
                    Entrada.escrever("Resultado: " + calc.raizQuadrada(valor1));
                    break;
                case 6:
                    Entrada.escrever("Resultado: " + calc.potencia(valor1, valio2));
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
            
        }
        
    }
    
}
