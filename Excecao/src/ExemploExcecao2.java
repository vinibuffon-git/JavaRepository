/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paulo
 */

/*
Tratar: THROW, THROWS
- entrada maior que o limite
- saida (não pode tirar mais do que as pessoas na sala)
- Usar throw, throws
 */
public class ExemploExcecao2 {

    static final int limiteSala = 20;
    int pessoasNaSala;

    public ExemploExcecao2(int totalnasala){
        this.pessoasNaSala = totalnasala;
    }
    public void entrarNaSala()  {
            this.pessoasNaSala++;
    }
    public void sairDaSala() {
            this.pessoasNaSala--;
    }
    public void mostrarSituacaodaSala(){
        System.out.println("\n2\nStatus da Sala no momento: ");
        System.out.println("Capacidade da Sala: " + ExemploExcecao2.limiteSala);
        System.out.println("Pessoas na Sala...: " + this.pessoasNaSala);
        System.out.println("");
    }
    public static void main(String[] args) {
        ExemploExcecao2 ex2 = new ExemploExcecao2(2);
        System.out.println("Faremos 5 iterações");
        for(int x=0; x<5; x++){
            ex2.mostrarSituacaodaSala();
            String mens = "1 - Entrar na Sala;\n";
            mens += "2 - Saida da Sala;";
            int op = Entrada.leiaInt(mens);
            if(op==1){
                ex2.entrarNaSala();
            }
            if(op==2){
                ex2.sairDaSala();
            }
        }
        System.out.println("Fim de Programa");
    }   
}
