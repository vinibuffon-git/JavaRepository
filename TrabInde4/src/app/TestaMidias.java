//Vinícius Buffon

package app;

import objects.BluRay;
import objects.Midias;
import objects.Usb;
import tools.Entrada;

public class TestaMidias {

    public static void main(String[] args) {
        int OP = 1;
        Midias vet[] = new Midias[10];
        for (int i = 0; i < 10; i++) {
            vet[i] = new Midias();
        }
        while (OP != 3) {
            OP = Entrada.leiaInt("Sistema de Mídias\n"
                    + "1 - Cadastrar Mídias\n"
                    + "2 - Exibir\n"
                    + "3 - Sair");
            switch (OP) {
                case 1:
                    int OPC = Entrada.leiaInt("Informe a posição do vetor "
                            + "(entre 0 a 9)");

                    int midiaTipo = Entrada.leiaInt("Informe a Mídia:\n"
                            + "1 - Blueray\n"
                            + "2 - USB");
                    switch (midiaTipo) {
                        case 1:
                            BluRay objBluRay1 = new BluRay();
                            objBluRay1.setCodigo(Entrada.leiaInt("Informe"
                                    + " o código do item"));
                            objBluRay1.setPreco(Entrada.leiaDouble("Informe"
                                    + " o preço do Bluray"));
                            objBluRay1.setCapacidadeArmazenamento(Entrada.leiaInt("Tamanho do arquivo (mb)"));
                            objBluRay1.setIdade(Entrada.leiaInt("Digite a idade indicada para o Filme"));
                            objBluRay1.setIdBluray(Entrada.leiaInt("Informe"
                                    + " o ID do Bluray"));
                            objBluRay1.setNomeFilme(Entrada.leiaString("Informe"
                                    + " o Nome do Bluray"));
                            objBluRay1.setDuracao(Entrada.leiaInt("Informe"
                                    + " a duração do bluray (em minutos)"));
                            vet[OPC] = objBluRay1;
                            OPC = 10;
                            break;
                        case 2:
                            Usb objUSB1 = new Usb();
                            objUSB1.setCodigo(Entrada.leiaInt("Informe"
                                    + " o código do item"));
                            objUSB1.setPreco(Entrada.leiaDouble("Informe"
                                    + " o preço do USB"));
                            objUSB1.setCapacidadeArmazenamento(Entrada.leiaInt("Tamanho do arquivo (mb)"));
                            objUSB1.setIdUSB(Entrada.leiaInt("Informe"
                                    + " o ID do USB"));
                            int arquivoTipo = Entrada.leiaInt(
                                    "Informe o tipo do arquivo:\n"
                                    + "1 - Imagem\n"
                                    + "2 - Som\n"
                                    + "3 - Vídeo");
                            String strArquivoTipo = "";
                            if (arquivoTipo == 1) {
                                strArquivoTipo = "Imagem";
                            }
                            if (arquivoTipo == 2) {
                                strArquivoTipo = "Som";
                            }
                            if (arquivoTipo == 3) {
                                strArquivoTipo = "Vídeo";
                            }
                            objUSB1.setTipoArquivos(strArquivoTipo);
                            vet[OPC] = objUSB1;
                            OPC = 10;
                            break;
                    }

                    break;
                case 2:
                    int option = Entrada.leiaInt("Exibir:\n"
                            + "1 - Exibir Mídias\n"
                            + "2 - Tamanho total das Mídias\n"
                            + "3 - Soma dos valores das Mídias\n"
                            + "4 - Voltar");
                    switch (option) {
                        case 1:
                            int ponteiro = Entrada.leiaInt("Informe a Posição do vetor:");
                            System.out.println(vet[ponteiro]);
                            break;
                        case 2:
                            capacidadeArmazenamentoTotal(vet);
                            break;
                        case 3:
                            precosTotais(vet);
                            break;
                        case 4:
                            break;

                        default:
                            throw new AssertionError();
                    }

                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    Entrada.escrever("ERRO: Opção não existe!");
            }
        }
        System.exit(0);
    }

    public static void capacidadeArmazenamentoTotal(Midias vet[]) {
        int total = 0;
        for (int i = 0; i < vet.length; i++) {
            total = total + vet[i].getCapacidadeArmazenamento();
        }
        Entrada.escrever("Armazenamento total: " + total + "mbs");
    }

    public static void precosTotais(Midias vet[]) {
        double total = 0;
        for (int i = 0; i < vet.length; i++) {
            total = total + vet[i].getPreco();
        }
        Entrada.escrever("Preço total: R$" + total + "");

    }
}
