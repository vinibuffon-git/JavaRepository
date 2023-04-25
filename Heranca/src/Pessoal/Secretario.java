package Pessoal;

public class Secretario extends Funcionario {

    int anoFomracao;
    int linguas;

    public void progredir() {
        int anoAtual = 2023;
        int anosFormado = anoAtual - this.anoFomracao;
        int numAumentos = anosFormado / 5;
        //Fazer o salario receber um aumento de 5% a cada 5 anos trabalhados
        double salario = this.getSalario();
        salario += salario * (numAumentos * 0.05);
        this.setSalario(salario);
    }

    public Secretario() {
    }

    public int getAnoFomracao() {
        return anoFomracao;
    }

    public void setAnoFomracao(int anoFomracao) {
        this.anoFomracao = anoFomracao;
    }

    public int getLinguas() {
        return linguas;
    }

    public void setLinguas(int linguas) {
        this.linguas = linguas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHorasDiarias() {
        return horasDiarias;
    }

    public void setHorasDiarias(int horasDiarias) {
        this.horasDiarias = horasDiarias;
    }

}
