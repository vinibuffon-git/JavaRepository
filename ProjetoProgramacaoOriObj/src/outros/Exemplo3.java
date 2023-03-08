
package outros;

import tools.Entrada;

public class Exemplo3 {
    public static void main(String[] args) {
        int diaSemana = Entrada.leiaInt("Digite uma núemro de 1 a 7 e vou "
                + "te dizer qual dia da semana é :D");
        String semana;
        switch (diaSemana) {
            case 1:
                semana = "Domingo";
                break;
            case 2:
                semana = "Segunda-feira";
                break;
            case 3:
                semana = "Terça-feira";
                break;
            case 4:
                semana = "Quarta-feira";
                break;
            case 5:
                semana = "Quinta-feira";
                break;
            case 6:
                semana = "Sexta-feira";
                break;
            case 7:
                semana = "Sabado";
                break;
            default:
                semana = "Número não está entre 1 e 7 :)))))))";   
        }
        Entrada.escrever(semana);
        System.exit(0);
    }
}
