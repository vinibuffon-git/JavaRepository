
package Fundamental;

public class AlunoFun {
    public static void main(String[] args) {
        Pessoa alunoFUN1 = new Pessoa("Juca", "123.456.789-10", 13, 123456, "A+", 8);
        System.out.println(alunoFUN1);
        alunoFUN1.tipoSanquineo = "A-";
        alunoFUN1.anoEstudo = 9;
        System.out.println(alunoFUN1);
    }
}
