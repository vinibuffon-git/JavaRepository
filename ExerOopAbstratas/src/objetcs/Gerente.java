
package objetcs;

public class Gerente extends Funcionario{

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    @Override
    public double alterarSalario(double s) {
        this.salario += s;
        this.salario = this.salario * 1.15;
        return this.salario;
    }
}
