// Vinicius Buffon e Robson Mentzen 

package objts;

import tools.Entrada;

public class Ford extends Carro {

    private double potenciaMotor = 5000.0;

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public Ford() {
    }

    public void alterarPotencia() {
        double potenciaDesejada = Entrada.leiaDouble("Digite a Potência desejada");
        if (getAno() >= 2010 && getPortas() == 2) {
            this.potenciaMotor = potenciaDesejada;
        } else {
            this.potenciaMotor += this.potenciaMotor * 0.10;
        }
    }

    @Override
    public String toString() {
        super.toString();
        return "Ford{" + "potenciaMotor=" + potenciaMotor +'}';
    }
}
