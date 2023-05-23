// Vinicius Buffon e Robson Mentzen 


package objts;

import tools.Entrada;

public abstract class Calculadora {

    public double somar(double v1, double v2) {
        double resultado = 0;
        resultado = v1 + v2;
        return resultado;
    }

    public double subtrair(double v1, double v2) {
        double resultado = 0;
        resultado = v1 - v2;
        return resultado;
    }

    public double multiplicar(double v1, double v2) {
        double resultado = 0;
        resultado = v1 * v2;
        return resultado;
    }

    public double dividir(double v1, double v2) {
        double resultado = 0;
        try {
            if (v2 == 0) {
                throw new ArithmeticException();
            }
            resultado = v1 / v2;
        } catch (ArithmeticException e) {
            Entrada.escrever("Divisão por zero sempre é iqual a 0.");
        }
        return resultado;

    }
}
