
package objetcs;


public class TestaFunc {
    public static void main(String[] args) {
        Operario op1 = new Operario();
        op1.setSalario(90.0);
        Gerente ge1 = new Gerente();
        ge1.setSalario(90.0);
        System.out.println("Salário Operario: " + op1.salario);
        System.out.println("Salário Gerente: " + ge1.salario);
        op1.alterarSalario(10.0);
        ge1.alterarSalario(10.0);
        System.out.println("Salário Operario: " + op1.salario);
        System.out.println("Salário Gerente: " + ge1.salario);
    }
    
}
