package Pessoal;

public class Engenheiro extends Funcionario{
    public String UniversidadeFormacao;
    public int n_CREA;

    public Engenheiro() {

    }

    public String getUniversidadeFormacao() {
        return UniversidadeFormacao;
    }

    public void setUniversidadeFormacao(String UniversidadeFormacao) {
        this.UniversidadeFormacao = UniversidadeFormacao;
    }

    public int getN_CREA() {
        return n_CREA;
    }

    public void setN_CREA(int n_CREA) {
        this.n_CREA = n_CREA;
    }

}