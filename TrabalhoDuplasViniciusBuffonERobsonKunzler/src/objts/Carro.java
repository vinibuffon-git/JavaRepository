// Vinicius Buffon e Robson Mentzen 

package objts;

import minhasExeptions.CaracteristaInvalida;
import tools.Entrada;

public abstract class Carro {

    private String cor;
    private String modelo;
    private String marca;
    private int ano;
    private int portas;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Carro() {
        this.cor = "Branco";
        this.modelo = "Uno";
        this.marca = "Fiat";
        this.ano = 2000;
        this.portas = 2;
    }

    public Carro(String cor, String modelo, String marca, int ano, int portas) {
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.portas = portas;
    }

    public void alterarCarro() throws CaracteristaInvalida {
        this.cor = Entrada.leiaString("Digite a cor do carro");
        this.marca = Entrada.leiaString("Digite a marca do carro");
        this.modelo = Entrada.leiaString("Digite o modelo do carro");
        int portasDesejadas = Entrada.leiaInt("Digite o número de portas do carro");
        if (portasDesejadas > 4) {
            throw new CaracteristaInvalida();
        }
        int anoDesejado = Entrada.leiaInt("Digite o ano do carro");
        if (anoDesejado < 2000) {
            throw new CaracteristaInvalida();
        } else {
            this.ano = anoDesejado;
            this.portas = portasDesejadas;
        }
    }

    @Override
    public String toString() {
        return "Carro{" + "cor=" + cor + ", modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", portas=" + portas + '}';
    }
}
