
package outros;

public class Aluno {
    String universidade;
    String curso;
    String dicsiplina;
    String nome;

    public Aluno() {
        this.universidade = "Univates";
        this.curso = "TI";
        this.dicsiplina = "P.O.O";
        this.nome = "Vinicius";
    }
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        System.out.println(a1.nome);
        System.err.println(a1.curso);
        System.out.println(a1.dicsiplina);
        System.out.println(a1.universidade);
    }
    
}
