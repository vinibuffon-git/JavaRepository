
package objects;

public class BluRay extends Midias{
    int idBluray;
    String nomeFilme;
    double duracao;

    public BluRay() {
    }

    public int getIdBluray() {
        return idBluray;
    }

    public void setIdBluray(int idBluray) {
        this.idBluray = idBluray;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
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
        return "BluRay{" + "codigo=" + codigo + ", preco=" + preco + ", idBluray=" + idBluray + ", nomeFilme=" + nomeFilme + ", duracao=" + duracao + '}';
    }
}
