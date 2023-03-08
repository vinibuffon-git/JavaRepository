package outros;

import tools.Entrada;

public class ExemploPesoIdeal {
   public static double calcularPesoIdeal (double altura, char sexo) {
       double peso = 0;
       if (sexo=='M' || sexo == 'm') {
           peso = 62.1 * altura - 44.7;
       }
       if (sexo=='F' || sexo=='f') {
       peso = 72.7 * altura - 58;
   }
       return peso;
   }
    public static void main(String[] args) {
       double alt = Entrada.leiaDouble("Alrura?");
       char sexo = Entrada.leiaChar("Sexo?");
       double pesoIdeal = calcularPesoIdeal(alt, sexo);
        System.out.println("Peso Ideal: " + pesoIdeal);
    }
    
}

