// Vinicius Buffon e Robson Mentzen 

package objts;


public class CalculadoraCientifica extends Calculadora{
    
    public double raizQuadrada(double v1) {
        double resultado = 0;
        resultado = Math.sqrt(v1);
        return resultado;
    }
    
    public double potencia(double v1, double v2) {
        double resultado = 0;
        resultado = Math.pow(v1, v2);
        return resultado;
    }
    
}
