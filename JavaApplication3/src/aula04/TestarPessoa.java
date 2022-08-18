package aula04;

public class TestarPessoa {

    public static void main(String[] args) {

        Pessoa objPessoa1 = new Pessoa(); // Instanciar um objeto do tipo pessoa
        objPessoa1.setNome("Vinícius Buffon");
        objPessoa1.setCidade("Lajeado");
        objPessoa1.setIdade(20);
        objPessoa1.isAluno();

        Pessoa objPessoa2 = new Pessoa("Maria Clara", "Salvador", 17, true);
        
        ContaBanco objContaBanco = new ContaBanco("Vinícius Buffon", 123456, 999999.99, 999.99);

        System.out.println(objPessoa1);
        
        System.out.println(objContaBanco);
        
    }
}
