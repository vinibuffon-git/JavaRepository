
class SuperClasse {

    public void imprime() {
        System.out.println("imprime de SuperClasse");
    }
}

public class MinhaClasse extends SuperClasse {

    @Override
    public void imprime() {
        System.out.println("imprime de MinhaClasse");
    }
//Se tentar trocar, por exemplo, imprime() 
//por imprimir() - ERRO.

}
