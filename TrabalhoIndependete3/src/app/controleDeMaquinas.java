//Vinícuis Buffon
package app;

import tools.Entrada;

public class controleDeMaquinas {

    public static void main(String[] args) {       
        int OP = 0;
        int calTemp = 100;
        int userInput;
        int maxTemp = 250;
        int minTemp = 80;
        while (OP != 4) {
            OP = Entrada.leiaInt("CONTROLE DA TEMPERATURA DA CALDEIRA" + "\n" + "\n"
                    + "Temperatura da Caldeira = " + calTemp + "\n" + "\n"
                    + "1 = Aumentar a temperatura" + "\n"
                    + "2 = Diminuir a temperatura" + "\n"
                    + "3 = Ajustar Temperaturas" + "\n"
                    + "4 = Sair");
            switch (OP) {
                //Aumentar a temp
                case 1:
                    try {
                    userInput = Entrada.leiaInt("Quantos gráus deseja Aumentar?");
                    if (calTemp + userInput > maxTemp) {
                        throw new TemperaturaAcimaDoPermitido(calTemp);
                    } else {
                        calTemp += userInput;
                    }
                } catch (TemperaturaAcimaDoPermitido ex) {
                    Entrada.escrever("Temperatura Acima do limite seguro.");
                }
                break;
                //Diminuit a temp
                case 2:
                try {
                    userInput = Entrada.leiaInt("Quantos gráus deseja Diminuir?");
                    if (calTemp - userInput < minTemp) {
                        throw new TemperaturaAbaixoDoPermitido(calTemp);
                    } else {
                        calTemp -= userInput;
                    }
                } catch (TemperaturaAbaixoDoPermitido ex) {
                    Entrada.escrever("Temperatura Abaixo do limite seguro.");
                }
                break;
                //Aleterar temperaturas
                case 3:
                    int OP2 = 1;
                    while (OP2 != 3) {
                        OP2 = Entrada.leiaInt("CONTROLE DA TEMPERATURA MÁXIMA E "
                                + "MÍNIMA DA CALDEIRA" + "\n" + "\n"
                                + "Temperatura máxima da Caldeira = " + maxTemp + "\n" + "\n"
                                + "Temperatura miníma da Caldeira = " + minTemp + "\n" + "\n"
                                + "1 = Alterar a temperatura Máxima" + "\n"
                                + "2 = Alterar a temperatura Mínima" + "\n"
                                + "3 = Voltar");
                        switch (OP2) {
                            //Atera máxima
                            case 1:
                                maxTemp = Entrada.leiaInt("Digite a "
                                        + "temperatura máxima desejada");              
                                break;
                            //Aletera mínima
                            case 2:
                                minTemp = Entrada.leiaInt("Digite a "
                                        + "temperatura mínima desejada");
                                break;
                            //Voltar 
                            case 3:
                                break;
                            default:
                        }
                    }
                    break;
                //Sair    
                case 4:
                    System.exit(0);
                default:
                    System.out.println(OP + " = Não é uma opção");
                    OP = 1;
            }
        }
    }
}
