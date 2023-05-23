package Objects;

import tools.Entrada;

public class TestaContatos implements Contatos {

    int contato;
    String nome;
    TestaContatos[] testContatos = new TestaContatos[5];

    @Override
    public void cadastrar(int pos, int contato, String nome) {
        testContatos[pos].nome = nome;
        testContatos[pos].contato = contato;
    }

    @Override
    public void remover(int posicao) {
    }

    @Override
    public void listar() {
        for (int x = 0; x < testContatos.length; x++) {
            if (testContatos[x] == null) {
                return;
            }
            System.out.println("Contato " + (x + 1));
            System.out.println("Contato: " + testContatos[x].contato);
            System.out.println("Nome: " + testContatos[x].nome);
        }
    }

    public static void main(String[] args) {
        TestaContatos t = new TestaContatos();
        int OP = 0;
        while (OP != 3) {
            String mens = "1 - Cadastrar\n"
                    + "2 - Listar\n"
                    + "3 - Sair";
            OP = Entrada.leiaInt(mens);
            switch (OP) {
                case 1:
                    int p = Entrada.leiaInt("Posição?");
                    int c = Entrada.leiaInt("Contato");
                    String n = Entrada.leiaString("Nome");
                    t.cadastrar(p, c, n);
                    break;
                case 2:
                    t.listar();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }

        }

    }
}
