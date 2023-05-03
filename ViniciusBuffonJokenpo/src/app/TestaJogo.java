//Vinícius Buffon

package app;

import tools.Entrada;

public class TestaJogo {

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        String strJogo = "";
        int vencedor = 0;
        int jogo1;
        int jogo2;
        String mens = "Informar o Tipo do jogo:\n"
                + "1 - Jokenpo Normal\n"
                + "2 - Jokenpo Especial\n";
        int op = Entrada.leiaInt(mens);
        if (op == 1) {
            jogo = new JokenpoSimples();
            mens = "Informe seu Jogo\n"
                    + "1 - Pedra\n"
                    + "2 - Papel\n"
                    + "3 - Tesoura";
            jogo1 = Entrada.leiaInt(mens);
            Entrada.escrever("Você jogou " + jogo.informarJogo(jogo1));
            jogo2 = jogo.gerarJogo();
            Entrada.escrever("O computdor jogou " + jogo.informarJogo(jogo2));
            vencedor = jogo.jogar(jogo1, jogo2);
            switch (vencedor) {
                case 0:
                    Entrada.escrever("Empate");
                    break;
                case 1:
                    Entrada.escrever("Vitória do Usuário");
                    break;
                case 2:
                    Entrada.escrever("Vitória do Computador");
                    break;
            }
        }
        if (op == 2) {
            jogo = new JokenpoPlus();
            mens = "Informe seu Jogo\n"
                    + "1 - Pedra\n"
                    + "2 - Papel\n"
                    + "3 - Tesoura\n"
                    + "4 - Lagarto\n"
                    + "5 - Spock\n";
            jogo1 = Entrada.leiaInt(mens);
            Entrada.escrever("Você jogou " + jogo.informarJogo(jogo1));
            jogo2 = jogo.gerarJogo();
            Entrada.escrever("O computdor jogou " + jogo.informarJogo(jogo2));
            vencedor = jogo.jogar(jogo1, jogo2);
            switch (vencedor) {
                case 0:
                    Entrada.escrever("Empate");
                    break;
                case 1:
                    Entrada.escrever("Vitória do Usuário");
                    break;
                case 2:
                    Entrada.escrever("Vitória do Computador");
                    break;
            }
        }
    }
}
