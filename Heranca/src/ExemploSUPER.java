
public class ExemploSUPER extends Pai{

    //Chamar o construtor da superclasse
    public ExemploSUPER() {        
        System.out.println(">> Construtor da classe ExemploSUPER rodando...");
    }
    
    //Chamar o método imprimirMensagem da classe Pai
    public void imprimirMensagem(){
        System.out.println("Mensagem vinda da Classe ExemploSUPER");
    }
    
    public static void main(String[] args) {
        Pai pai = new Pai();
        ExemploSUPER filho = new ExemploSUPER();
        pai.imprimirMensagem();
        filho.imprimirMensagem();
    }
}

class Pai{
    
    public Pai() {        
        System.out.println(">> Construtor da classe Pai rodando...");
    }    
    
    public void imprimirMensagem(){
        System.out.println("Mensagem vinda da Classe Pai");
    }
}
