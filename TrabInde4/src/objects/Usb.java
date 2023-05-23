//Vinícius Buffon

package objects;

public class Usb extends Midias {

    int idUSB;
    String tipoArquivos;

    public Usb() {
    }

    public int getIdUSB() {
        return idUSB;
    }

    public void setIdUSB(int idUSB) {
        this.idUSB = idUSB;
    }

    public String getTipoArquivos() {
        return tipoArquivos;
    }

    public void setTipoArquivos(String tipoArquivos) {
        this.tipoArquivos = tipoArquivos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public String toString() {
        return "Usb:"
                + "\nCódigo: " + codigo
                + "\nPreçoo: R$" + preco
                + "\nId do USB: " + idUSB
                + "\nTipo do Arquivo: " + tipoArquivos;
    }
}
