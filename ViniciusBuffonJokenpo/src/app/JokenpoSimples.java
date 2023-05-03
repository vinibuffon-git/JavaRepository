//Vinícius Buffon

package app;

public class JokenpoSimples extends Jogo {

    @Override
    public int jogar(int jogo1, int jogo2) {
        int resultado = 0;
        if (jogo1 == 1  && jogo2 == 1){
            resultado = 0;
        }
        if (jogo1 == 1  && jogo2 == 2){
            resultado = 2;
        }
        if (jogo1 == 1  && jogo2 == 3){
            resultado = 1;
        }
        if (jogo1 == 2  && jogo2 == 1){
            resultado = 1;
        }
        if (jogo1 == 2  && jogo2 == 2){
            resultado = 0;
        }
        if (jogo1 == 2  && jogo2 == 3){
            resultado = 2;
        }
        if (jogo1 == 3  && jogo2 == 1){
            resultado = 2;
        }
        if (jogo1 == 3  && jogo2 == 2){
            resultado = 1;
        }
        if (jogo1 == 3  && jogo2 == 3){
            resultado = 0;
        }
        return resultado;
    }
    
    @Override
    public String informarJogo(int jogoFeito){
        String retorno ="";
        switch(jogoFeito){
            case 1: retorno = "Pedra";
            break;
            case 2: retorno = "Papel";
            break;
            case 3: retorno = "Tesoura";
            break;
        }
        return  retorno;
    }
    
    @Override
    public int gerarJogo(){
        int rand = (int)(Math.random() * 3 + 1);
        return rand; 
    }
}
