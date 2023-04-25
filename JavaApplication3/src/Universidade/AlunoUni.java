
package Universidade;

import Fundamental.Pessoa;

public class AlunoUni extends Pessoa{
    public static void main(String[] args) {
        AlunoUni alunoUNI1 = new AlunoUni();
        alunoUNI1.idade = 20;
        alunoUNI1.tipoSanquineo = "AB+";
        System.out.println(alunoUNI1);
    }
}
