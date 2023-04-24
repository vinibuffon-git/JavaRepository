package app;

import tools.Entrada;
        
public class controleDeMaquinas {

    public static void main(String[] args) {
        int OP = 0;
        int calTemp = 100;
        while (OP != 4) {
            try {
                calTemp = Entrada.leiaInt("Digite a temperatura desejada");
                if (calTemp < 80){
                    calTemp = 100;
                    throw new TemperaturaForaDosLimites(calTemp);
                }
                if (calTemp > 250){
                    calTemp = 100;
                    throw new TemperaturaForaDosLimites(calTemp);
                }
            } catch (Exception e) {
                System.out.println("Erro temperatura informada fora dos limites permitidos.");
            }
            System.out.println("Temperatura alterada." + "\n" + "Temperatura: " + calTemp + "C");
        }
        System.exit(0);
    }
}