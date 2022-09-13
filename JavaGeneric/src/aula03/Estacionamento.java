package aula03;

// 1 hora = 2R$ 2 horas = 1,50R$ 2 horas + = 0,50R$ por meia-hora
import ferramentas.Entrada;

public class Estacionamento {

    public static void main(String[] args) {

        int hora = Entrada.leiaInt("Horas");
        int min = Entrada.leiaInt("Minutos");
        double tempo = (hora * 60) + min;
        double preco = 0;
        double valorminadd = 1.0/60;
        
        if (tempo <= 15){
            preco = 0;
        } else
        if (tempo <= 60){
            preco = 2;
        } else 
        if (tempo <= 120) {
            preco = 3.50;
        } else 
        if (tempo > 120) {
            preco = (3.50 + ((tempo - 120) * valorminadd)); 
        }
        
        System.out.println("O estacionamento custou: " + preco);
        
        System.exit(0);
    }
}
