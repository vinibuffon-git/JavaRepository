
package aula04;

public class ContaBanco {
    
    private String nome;
    private int NumConta;
    private double saldoConta;
    private double limiteChuq;

    public ContaBanco() {
    }

    public ContaBanco(String nome, int NumConta, double saldoConta, double limiteChuq) {
        this.nome = nome;
        this.NumConta = NumConta;
        this.saldoConta = saldoConta;
        this.limiteChuq = limiteChuq;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return NumConta;
    }

    public void setNumConta(int NumConta) {
        this.NumConta = NumConta;
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
    
    @Override
    public String toString(){
        return nome;
    }
}
