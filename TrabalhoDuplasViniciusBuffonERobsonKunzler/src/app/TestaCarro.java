// Vinicius Buffon e Robson Mentzen 

package app;

import minhasExeptions.CaracteristaInvalida;
import objts.Ford;
import tools.Entrada;

public class TestaCarro {

    public static void main(String[] args) {
        Ford fordObj;
        fordObj = new Ford();
        int OP = 1;
        String mens;

        while (OP != 2) {
            mens = "Cor: " + fordObj.getCor() + "\n"
                    + "Marca: " + fordObj.getMarca() + "\n"
                    + "Ano: " + fordObj.getAno() + "\n"
                    + "Portas: " + fordObj.getPortas() + "\n"
                    + "Modelo: " + fordObj.getModelo() + "\n"
                    + "Potência: " + fordObj.getPotenciaMotor() + "\n"
                    + "\n"
                    + "1 - Alterar Carro" + "\n"
                    + "2 - Sair";
            OP = Entrada.leiaInt(mens);
            switch (OP) {
                case 1:
                    try {
                    fordObj.alterarCarro();
                    fordObj.alterarPotencia();
                } catch (CaracteristaInvalida e) {
                    Entrada.escrever("Característica Inválida");
                    break;
                }
                break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }

        }

    }
}
