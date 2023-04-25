
package exercicioHeranca;

public class TestaAnimais {
    
    public static void main(String[] args) {
        
        Gorila Go1 = new Gorila();
        Go1.carnivoro = true;
        Go1.herbivoro = false;
        Go1.corPelos = "Preto";
        Go1.numPatas = 4;
        Go1.peso = 100;
        Go1.idade = 25;
        
        Galinha Ga1 = new Galinha();
        Ga1.carnivoro = false;
        Ga1.herbivoro = true;
        Ga1.corPenas = "Branca";
        Ga1.numPatas = 2;
        Ga1.peso = 3;
        Ga1.idade = 9;
        
        System.out.println(Go1);
        System.out.println(Ga1);
        
        Go1.setCorPelos("Marron");
        Ga1.setCorPenas("Preta");
        
        System.out.println(Go1);
        System.out.println(Ga1);
        
        Go1.setIdade(40);
        Ga1.setIdade(5);

        System.out.println("O Gorila é " + Go1.statusVida());
        System.out.println("A Galinha é " + Ga1.statusVida());
    }
    
}
