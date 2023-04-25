
package Administrativo;

import Pessoal.*;

public class Gerente extends Funcionario{
    public String setorResponsavel;
    public double gratificacao;

    
    void aumanetarGratificacao(){
        this.gratificacao *= 1.05; //aumenta a gratificação em 5%
    }

    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    
}
