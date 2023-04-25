
import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Paulo
 */
/*
Erros a verificar: 
- Divisão por 0
- Capturar entrada de Letras: InputMismatchException
- capturar mais de uma Exception
 */
public class ExemploExcecao1 {

    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        double C = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de A: ");
        A = sc.nextInt();
        System.out.print("Valor de B: ");
        B = sc.nextInt();
        C = A / B;

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("Resultado da Divisão: " + C);
    }
}
