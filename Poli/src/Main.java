
public class Main {
    public static void main(String[] args) {
        
        Produto prod = new Produto();
        Livro book = new Livro();
        Revista revi = new Revista();
        
//        prod.emitirDados();
//        book.emitirDados();
//        revi.emitirDados();
        
        Produto p1 = new Livro();
        Produto p2 = new Revista();
        
        p1.emitirDados();
        p2.emitirDados();
        
        if (p1 instanceof Revista){
            System.out.println("P1 é revista");
        } else { 
            System.out.println("P1 é Livro");
        }
    }
}
