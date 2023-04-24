
import java.util.InputMismatchException;
import java.util.Scanner;


public class ErroVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[10];
        int pos =0;
        while(true){
            try{
            System.out.println("Informe o Indice do Vetor");
            pos = sc.nextInt();
            System.out.println("Informe o Valor");
            vet[pos] = sc.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("Carctere Inválido");
                System.exit(0);
            }catch(ArrayIndexOutOfBoundsException aob){
                System.out.println("Indice Fora do Array");
                System.exit(0);
            }
        }
    }
 
}
