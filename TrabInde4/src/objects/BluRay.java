//Vinícius Buffon

package objects;

public class BluRay extends Midias {

    int idBluray;
    String nomeFilme;
    double duracao;
    int idade;

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String informarCencura(int idade) {
        if (this.idade >= 18) {
            return "Categoria: Adulto";
        } else if (this.idade >= 10) {
            return "Categoria: Normal";
        } else if (this.idade < 10) {
            return "Categoria: Infantil";
        }
        return "";
    }

    @Override
    public String toString() {
        return "BluRay: \n"
                + "Código: " + codigo
                + "\nPreço: R$" + preco
                + "\nId do Bluray: " + idBluray
                + "\nNome do Filme: " + nomeFilme
                + "\nDuração do Filme: " + duracao
                + "\nClasificação indicativa, " + informarCencura(this.idade);
    }
}
