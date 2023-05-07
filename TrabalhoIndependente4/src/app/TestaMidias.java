package app;

import objects.BluRay;
import objects.Midias;
import objects.Usb;
import tools.Entrada;

public class TestaMidias {

    public static void main(String[] args) {
        int OP = 1;
        while (OP != 3) {
            Midias vet[] = new Midias[10];
            OP = Entrada.leiaInt("Sistema de Mídias\n"
                    + "1 - Cadastrar Mídias\n"
                    + "2 - Exibir Mídias\n"
                    + "3 - Sair");
            switch (OP) {
                case 1:
                    int OPC = Entrada.leiaInt("Informe a posição do vetor "
                            + "(entre 0 a 9)");
                    while (OPC != 10) {
                        int midiaTipo = Entrada.leiaInt("Informe a Mídia:\n"
                                + "1 - Blueray\n"
                                + "2 - USB");
                        switch (midiaTipo) {
                            case 1:
                                BluRay objBluRay1 = new BluRay();
                                objBluRay1.setCodigo(Entrada.leiaInt("Informe"
                                        + " o código do item"));
                                objBluRay1.setPreco(Entrada.leiaInt("Informe"
                                        + " o preço do Bluray"));
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
                                objUSB1.setPreco(Entrada.leiaInt("Informe"
                                        + " o preço do USB"));
                                objUSB1.setIdUSB(Entrada.leiaInt("Informe"
                                        + " o ID do USB"));
                                objUSB1.setTipoArquivos(
                                        Entrada.leiaString(
                                                "Informe o tipo do arquivo "
                                                + "(Imagem, Som, Vídeo)"));
                                vet[OPC] = objUSB1;
                                OPC = 10;
                                break;
                        }
                    }
                    break;
                case 2:
                    int ponteiro = Entrada.leiaInt("Informe a Posição do vetor:");
                    System.out.println(vet[ponteiro]);
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
}
