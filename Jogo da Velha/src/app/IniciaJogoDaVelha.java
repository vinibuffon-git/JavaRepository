package app;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class IniciaJogoDaVelha {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            
            JFrame frame = new JFrame("Jogo da Velha");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);

            JogoDaVelha jogo = new JogoDaVelha();
            frame.add(jogo);

            frame.setVisible(true);
        });
    }

}
