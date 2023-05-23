package objetcs;

public class Funcionario {

    Double salario;

    public Funcionario() {
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double alterarSalario(double s) {
        this.salario += s;
        return this.salario;
    }

}
