
package objetcs;


public class Operario extends Funcionario{

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    @Override
    public double alterarSalario(double s) {
        this.salario += s;
        this.salario = this.salario * 1.05;
        return this.salario;
    }
}
