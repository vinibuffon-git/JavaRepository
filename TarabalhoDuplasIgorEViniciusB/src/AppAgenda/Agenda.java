//Igor Porto e Vinícius Buffon

package AppAgenda;

import tools.Entrada;

public class Agenda {

    private String nome;
    private String endereco;
    private int CEP;
    private String telefone;

    public Agenda() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void Cadastrar() {
        this.setNome(Entrada.leiaString("Digite o nome"));
        this.setEndereco(Entrada.leiaString("Digite seu endereço"));
        this.setCEP(Entrada.leiaInt("Digite o CEP"));
        this.setTelefone(Entrada.leiaString("Digite o telefone"));
    }

    public void Excluir() {
        this.nome = "";
        this.endereco = "";
        this.CEP = 0;
        this.telefone = "";
    }

    public void Listar() {
        String nome = getNome();
        String endereco = getEndereco();
        int cep = getCEP();
        String telefone = getTelefone();

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " +endereco);
        System.out.println("CEP: " +cep);
        System.out.println("Telefone: " +telefone);

    }

    public static void main(String[] args) {
        Agenda contatos[] = new Agenda[10];
        int OP = 0;
        while (OP != 4) {
            OP = Entrada.leiaInt("AGENDA \n ======= \n 1 - Cadastrar"
                    + "\n 2 - Listar \n 3 - Excluir \n 4 - Sair \n Qual sua opção");
            switch (OP) {
                case 1:
                    int x = Entrada.leiaInt("Qual contato de 0 a 9 deseja criar?");
                    contatos[x] = new Agenda();
                    contatos[x].Cadastrar();
                    break;
                case 2:
                    int y = Entrada.leiaInt("Qual contato de 0 a 9 deseja listar?");
                    contatos[y].Listar();
                    break;
                case 3:
                    int z = Entrada.leiaInt("Qual contato de 0 a 9 deseja excluir");
                    contatos[z].Excluir();
                    break;
                case 4:
                    System.exit(0);
                default:
                    Entrada.escrever("Opção não encontrada!");
            }
        }
    }
}
