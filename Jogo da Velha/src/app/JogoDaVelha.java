package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDaVelha extends JPanel {
    private JButton[][] botoes;
    private char[][] tabuleiro;
    private char jogadorAtual;

    public JogoDaVelha() {
        setLayout(new GridLayout(3, 3));
        inicializarBotoes();
        tabuleiro = new char[3][3];
        jogadorAtual = 'X';
        inicializarTabuleiro();

    }

    private void inicializarBotoes() {
        botoes = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton botao = new JButton();
                botao.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
                botao.addActionListener(new BotaoClickListener(i, j));
                botoes[i][j] = botao;
                add(botao);
            }
        }
    }

    private void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    private void alternarJogador() {
        jogadorAtual = jogadorAtual == 'X' ? 'O' : 'X';
    }

    private void realizarJogada(int linha, int coluna) {
        JButton botao = botoes[linha][coluna];
        botao.setEnabled(false);
        botao.setText(jogadorAtual == 'X' ? "X" : "O");
        if (tabuleiro[linha][coluna] == '-') {
            tabuleiro[linha][coluna] = jogadorAtual;
            verificarGanhador();
            verificarEmpate();
            alternarJogador();
        } else {
            System.out.println("Posição já ocupada. Escolha outra posição.");
        }
    }

    private class BotaoClickListener implements ActionListener {
        private int linha;
        private int coluna;

        public BotaoClickListener(int linha, int coluna) {
            this.linha = linha;
            this.coluna = coluna;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            realizarJogada(linha, coluna);
        }
    }

    private void verificarGanhador() {
        if (verificarLinhas() || verificarColunas() || verificarDiagonais()) {

            String mens = "O jogador " + jogadorAtual + " venceu!";

            JOptionPane.showMessageDialog(getComponentPopupMenu(), mens);

            System.exit(0);
        }
    }

    private void verificarEmpate() {
        boolean tabuleiroCompleto = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    tabuleiroCompleto = false;
                    break;
                }
            }
        }
        if (tabuleiroCompleto) {

            String mens = "O jogo terminou em empate!";

            JOptionPane.showMessageDialog(getComponentPopupMenu(), mens);

            System.exit(0);

        }
    }

    private boolean verificarLinhas() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;
            }
        }
        return false;
    }

    private boolean verificarColunas() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                return true;
            }
        }
        return false;
    }

    private boolean verificarDiagonais() {
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            return true;
        }
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
            return true;
        }
        return false;
    }
}