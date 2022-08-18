
package aula04;

public class ContaBanco {
    
    private String nome;
    private int nomeConta;
    private double saldoConta;
    private double limiteChuq;

    public ContaBanco() {
    }

    public ContaBanco(String nome, int nomeConta, double saldoConta, double limiteChuq) {
        this.nome = nome;
        this.nomeConta = nomeConta;
        this.saldoConta = saldoConta;
        this.limiteChuq = limiteChuq;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnomeConta() {
        return nomeConta;
    }

    public void setnomeConta(int nomeConta) {
        this.nomeConta = nomeConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getLimiteChuq() {
        return limiteChuq;
    }

    public void setLimiteChuq(double limiteChuq) {
        this.limiteChuq = limiteChuq;
    }
}
