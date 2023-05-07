
package objects;

public class Midias {
    int codigo;
    double preco;

    public Midias() {
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

    @Override
    public String toString() {
        return "Midias{" + "codigo=" + codigo + ", preco=" + preco + '}';
    }

}
